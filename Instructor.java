
public class Instructor extends Person{
	int salary;
    String sub;
	public Instructor(String n, int y,String su,int s) {
		super(n, y);
		sub=su;
		salary=s;
	}
	int gets(){
		return salary;
	}
	String getsu() {
		return sub;
	}
}
