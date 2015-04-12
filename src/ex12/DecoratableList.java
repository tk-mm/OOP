package ex12;

import java.util.ArrayList;

public class DecoratableList {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Decoratable> decolist = new ArrayList<Decoratable>();
		decolist.add(new Star("Hello Tokyo"));
		decolist.add(new Box("Hello Japan"));
		decolist.add(new List("Hello Universe"));
		decolist.add(new FreeStyle("Asako Natsume"));
		for(Decoratable d: decolist){
			d.decorate();
		}
	}

}
