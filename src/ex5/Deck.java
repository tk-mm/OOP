package ex5;

import java.util.ArrayList;

public class Deck {
	public static ArrayList<Card> list;
	public Deck(){
		list = new ArrayList<Card>();
		for(int i = 0; i < 4; i++){
			for(int j = 1; j <= 13; j++){
				list.add(new Card(i, j));
			}
		}
	}
	public void show(){
		for(Card card:list){
			System.out.println(card);
		}
	}
	public static void main(String[] args){
		Deck deck = new Deck();
		deck.show();
	}
}
