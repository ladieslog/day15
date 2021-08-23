package day15;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WindowPrograms extends Thread{
	public void winds() {
		JFrame frame =new JFrame("Time");
		Container c=frame.getContentPane();
			
		JLabel label =new JLabel();
		c.add(label);

		frame.setLocation(1000,200); //화면위치 가로 ,세로 위치
		frame.setPreferredSize(new Dimension(1000,200));	//프레임사이즈
		frame.pack();
		
		Font font =new Font(null,0,32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setVisible(true);		//화면 출력
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("숫자 0을 누르면 멈춰집니다.");
		while(true) {
			Date date=new Date();
			SimpleDateFormat simples =new SimpleDateFormat(""
					+ "yyyy년 MM월 dd일 aa hh시 mm분 ss초");
			label.setText(simples.format(date));
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}
}
