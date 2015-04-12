package ex3;

public class MyPoint {
	private int x;
	private int y;
	
	public MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public double getR(){
		return Math.sqrt(x*x+y*y);
	}
	public double getTheta(){
		return (double)Math.atan2(y, x) * 180 / Math.PI;
	}
	public double distance(MyPoint anotherPoint){
		return Math.sqrt((anotherPoint.getX() - x) * (anotherPoint.getX() - x)
				+ (anotherPoint.getY() - y) * (anotherPoint.getY() - y));
	}
	public String toString(){
		return "a MyPoint(" + getX() + ", " + getY() + ")";
	}
}
