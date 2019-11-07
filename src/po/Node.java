package po;

import java.util.ArrayList;

public class Node implements Hyb{

	private ArrayList<Mail> allMail;
	private ArrayList<Hyb> observers;
	String name;

	public Node (String name) {
		this.name = name;
		allMail = new ArrayList<>();
		observers = new ArrayList<>();
	}
	
	public void addMail (Mail m) {
		allMail.add(m);
		Notify();
	}
	
	public ArrayList<Mail> getState() {
		
		return allMail;
	}

	@Override
	public void Attach(Hyb o) {
		observers.add(o);
	}

	@Override
	public void Dettach(Hyb o) {

		observers.remove(o);
	}

	@Override
	public void Notify() {

		for (int i=0; i<observers.size(); i++) {
			observers.get(i).update(this);
		}
	}
	
	public void checkMail(ArrayList<Mail> m) {
		
		for (int i=0; i<m.size(); i++) {
			System.out.println("Inside loop");
			if (name.compareTo(m.get(i).receiverName) == 0) {
				System.out.println(name + ": " + m.get(i).content);
			}
		}
	}

	@Override
	public void update(Object obj) {
		System.out.println("Inside update");
		if (obj instanceof Node) {
			Node po = (Node) obj;
			checkMail(po.getState());
		}
	}

}
