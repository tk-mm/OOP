package ex10;

public class Student {
	private String studentNumber;
	private String name;
	private String address;
	private String tel;
	
	public static void main(String[] args){
		Student student = new Student("☓☓fi☓☓☓", "uzuyh", "Tokyo", "090-☓☓☓☓-☓☓☓☓");
		System.out.println(student);
		System.out.println(student.getStudentNumber());
		student.setName("Natsume");
		System.out.println(student.getName());
		student.setAddress("NewYork");
		System.out.println(student.getAddress());
		student.setTel("03-☓☓☓☓-☓☓☓☓");
		System.out.println(student.getTel());
		System.out.println(student);
	}
	
	public Student(String studentNumber, String name, String address, String tel){
		this.studentNumber = studentNumber;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	public String getStudentNumber(){
		return studentNumber;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getTel(){
		return tel;
	}
	public void setTel(String tel){
		this.tel = tel;
	}
	public String toString(){
		return "a Student(" + getStudentNumber() + 
				"," + getName() + 
				"," + getAddress() + 
				"," + getTel() + ")";
	}
}
