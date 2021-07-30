package code;

import javax.swing.JFrame;

public class Main {
	static JFrame fr;
	public static void main(String[] args) {
		makeFrame();
	}
	static void makeFrame() {
		fr=new JFrame();
		fr.setTitle("BarrageAction(仮)");
		fr.setBounds(0, 0, 100, 100);
		fr.setLocationRelativeTo(null);
		fr.setVisible(true);
	}
}
