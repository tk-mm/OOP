package ex12;

public class List implements Decoratable{
	private String str;
	
	public List(String str){
		this.str = str;
	}
	@Override
	public void decorate() {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 0; i < 3; i++){
			System.out.println("・" + str + "!");
		}
	}
}
