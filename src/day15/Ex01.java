package day15;

import java.util.Scanner;

class A01 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("a01 : "+i);
		}
	}
}
class B01 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("음악이 흘러나옵니다. : "+i);
		}
	}
}


class A02 extends Thread{
	public void run() {
		for(;;) {
			try {
				System.out.println("답글이 날라 옵니다.");
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}


public class Ex01 {
	public static void main(String[] args) {
		A01 a=new A01();
		B01 b= new B01();
		a.setDaemon(true);
		b.setDaemon(true);
		a.start();  b.start();
		System.out.println("프로그램 종료합니다. ");
		
		
		//2
		Scanner input =new Scanner(System.in);
		String message=null;
		
		A02 a2=new A02();
		a2.setDaemon(true);
		a2.start();
		for(;;) {
			System.out.println("메세지 전송 : ");
			message=input.next();
			System.out.println(message);
			if(message.equals("exit"))
				break;
		}
		System.out.println("포로그램을 종료합니다.");
	}
}










