package ex5;

public class Card {
    private int mark;
    private int number;

    public static final int SPADE = 0;
    public static final int HEART = 1;
    public static final int CLUB = 2;
    public static final int DIAMOND = 3;

    public static final int BLACK = 0;
    public static final int RED = 1;

    public Card(int m, int num) {
    	this.mark = m;
    	this.number = num;

    }
    public String getMark() {
    	String c = null;
    	switch(mark){
    	case 0:
    		c = "S";
    		break;
    	case 1:
    		c = "H";
    		break;
    	case 2:
    		c = "C";
    		break;
    	case 3:
    		c = "D";
    		break;
    	}
    	return c;
    }
    public String getNumber() {
    	String n = null;
    	switch(number){
    	case 1:
    		n = "A";
    		break;
    	case 11:
    		n = "J";
    		break;
    	case 12:
    		n = "Q";
    		break;
    	case 13:
    		n = "K";
    		break;
    	default:
    		n = String.valueOf(number);
    		break;
    	}
    	return n;
    }
    public String color(){
    	String c = null;
    	switch(mark){
    	case 0:
    		c = "黒";
    		break;
    	case 1:
    		c = "赤";
    		break;
    	case 2:
    		c = "黒";
    		break;
    	case 3:
    		c = "赤";
    		break;
    	}
    	return c;
    }
    
    public boolean isEqualMark(Card aCard){
    	boolean result = false;
    	if(mark == aCard.mark && number == aCard.number){
    		result = true;
    	}else{
    		result = false;
    	}
    	return result;
    }
    
    public boolean isLargerThan(Card aCard){
    	boolean result = false;
    	if(number == 1 && aCard.number == 13){
    		result = true;
    	}else if(number > aCard.number){
    		result = true;
    	}else{
    		result = false;
    	}
    	return result;
    }
    
    public String toString(){
    	return "a Card(" + getMark() + ", " + getNumber() + ")";
    }

    public static void main(String[] args) {
	Card card1, card2, card3, card4, card5;
	card1 = new Card(Card.SPADE, 1);
	card2 = new Card(Card.DIAMOND, 2);
	card3 = new Card(Card.SPADE, 13);
	card4 = new Card(Card.SPADE, 13);
	card5 = new Card(Card.SPADE, 3);

	System.out.println(card1);
	System.out.println(card2);
	System.out.println(card3);
	System.out.println(card3.isEqualMark(card4));
	System.out.println(card3.isEqualMark(card5));
	System.out.println(card1.isLargerThan(card5));
	System.out.println(card1.isLargerThan(card3));
    } 
}
