package ex12;

public class DecoratebleSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Decoratable star, box, list, freestyle;
		star = new Star("Hello Tokyo");
		box = new Box("Hello Japan");
		list = new List("Hello Universe");
		freestyle = new FreeStyle("Asako Natsume");
		star.decorate();
		box.decorate();
		list.decorate();
		freestyle.decorate();
	}

}
