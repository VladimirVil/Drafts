package po;

public class Main {
//	public static void main (String[] args) {
//		PostOffice postoffice = new PostOffice();
//		Person chris = new Person ("Chris");
//		Person john = new Person("John");
//		Mail m  = new Mail("John", "Dundee", "You have got a secret");
//		
//		postoffice.Attach(chris);
//		postoffice.Attach(john);
//		
//		postoffice.addMail(m);
//	}

	public static void main (String[] args) {
		Node node1 = new Node("first");
		Node node2 = new Node("second");
		
		Mail m = new Mail("second", "dunndee", "You have got an email");
		
		node1.Attach(node2);
		node2.Attach(node1);
		
		node1.addMail(m);
	}
}
