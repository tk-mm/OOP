package ex10;

public class TA extends Student{
	private String subject;
	private String extension;
	
	public static void main(String[] args){
		TA ta = new TA("☓☓fi☓☓☓", "uzuyh", "Tokyo", "090-☓☓☓☓-☓☓☓☓", "鯖プロ", "8000");
		System.out.println(ta);
		ta.setSubject("CG演習");
		System.out.println(ta.getSubject());
		ta.setExtension("5000");
		System.out.println(ta.getExtension());
		System.out.println(ta);
	}
	public TA(String studentNumber, String name, String address, String tel, String subject, String extension){
		super(studentNumber, name, address, tel);
		this.subject = subject;
		this.extension = extension;
	}
	public String getSubject(){
		return subject;
	}
	public void setSubject(String subject){
		this.subject = subject;
	}
	public String getExtension(){
		return extension;
	}
	public void setExtension(String extension){
		this.extension = extension;
	}
	public String toString(){
		return "a TA(" + getStudentNumber() + 
				"," + getName() + 
				"," + getAddress() + 
				"," + getTel() + 
				"," + getSubject() + 
				"," + getExtension() + ")";
	}

}
