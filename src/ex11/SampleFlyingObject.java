package ex11;

public class SampleFlyingObject {
	public static void main(String[] args){
		FlyingObject plane, butterfly, bird;
		plane = new Plane();
		butterfly = new Butterfly();
		bird = new Bird();
		
		plane.fly();
		butterfly.fly();
		bird.fly();
	}
}
