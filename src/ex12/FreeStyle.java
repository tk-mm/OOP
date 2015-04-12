package ex12;

public class FreeStyle implements Decoratable{
	private String str;
	
	public FreeStyle(String str){
		this.str = str;
	}
	public void decorate(){
		printLine();
		System.out.println("/*" + str + "*/");
		printLine();
	}
	private void printLine(){
		for(int i = 0; i < str.length() + 3; i++){
			System.out.print("/");
		}
		System.out.println("/");
	}
}
