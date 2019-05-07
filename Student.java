
public class Student extends Person{
	String maj,sid;
	public Student(String s,String n,int y,String m) {
		super(n, y);
		maj=m;
		sid=s;
	}
	String getm(){
		return maj;
	}
	String gets() {
		return sid;
	}
}
