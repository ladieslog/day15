package day15;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex02 {
	public static void main(String[] args) {
		JFrame frame =new JFrame("test");
		Container c=frame.getContentPane();
		JLabel label =new JLabel("Hello GUI");
		c.add(label);
		
		frame.setLocation(1000,200); //가로 ,세로 위치
		frame.setPreferredSize(new Dimension(500,200));	//프레임사이즈
		frame.pack();
		
		Font font =new Font(null,0,42);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label.setText("안녕하세요");
		
		for(int i=0;i<100000;i++)
			label.setText(i+"바퀴 회전중: --");
	}
}









