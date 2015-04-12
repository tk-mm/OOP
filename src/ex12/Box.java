package ex12;

public class Box implements Decoratable{
	private String str;
	
	public Box(String str){
		this.str = str;
	}
	@Override
	public void decorate() {
		// TODO 自動生成されたメソッド・スタブ
		printLine();
		System.out.println("|" + str + "|");
		printLine();
	}
	private void printLine(){
		System.out.print("+");
		for(int i = 0; i < str.length(); i++){
			System.out.print("-");
		}
		System.out.println("+");
	}
}
