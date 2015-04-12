package ex11;

public abstract class OpenObject {
	public static void main(String[] args){
		OpenObject window, file, curtain;
		window = new Window();
		file = new File();
		curtain = new Curtain();
		window.open();
		file.open();
		curtain.open();
	}
	public abstract void open();
}
