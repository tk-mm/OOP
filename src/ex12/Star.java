package ex12;

public class Star implements Decoratable {
	private String str;
	
	public Star(String str){
		this.str = str;
	}
	@Override
	public void decorate() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("*" + str + "*");
	}
}
