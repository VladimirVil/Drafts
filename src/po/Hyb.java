package po;

public interface Hyb {

	//subject methods
	void Attach(Hyb o);
	void Dettach(Hyb o);
	void Notify();
	
	//observer methods
	void update (Object o);

}
