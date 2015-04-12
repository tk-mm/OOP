package ex2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class SampleYen extends JFrame {
	private SampleYenPanel sp;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SampleYen sy = new SampleYen();
	}
	public SampleYen(){
		super("サンプル");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		sp = new SampleYenPanel();
		add(sp, BorderLayout.CENTER);
		setVisible(true);
	}
	public class SampleYenPanel extends JPanel{
		private ArrayList<Yen> yenlist = new ArrayList<Yen>();
		
		public SampleYenPanel(){
			addMouseListener(new SampleMouseListener());
		}
		public void paint(Graphics g){
			super.paint(g);
			Iterator<Yen> it = yenlist.iterator();
			while(it.hasNext()){
				Yen c = it.next();
				c.draw(g);
			}
		}
		public class SampleMouseListener extends MouseAdapter{
			public void mousePressed(MouseEvent e){
				yenlist.add(new Yen(e.getX(), e.getY()));
				repaint();
			}
		}
	}

}
