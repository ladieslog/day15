package day15;

import java.util.Scanner;

public class Function_obtion {
	public void winObtion() {
		Scanner pulls =new Scanner(System.in);
		WindowPrograms wins= new WindowPrograms();
		int a,b=0;
		System.out.println("\n==========환영합니다.==========\n");
		while(b==0) {
			System.out.print("1.기능 2.off \n입력>>>> ");
			a=pulls.nextInt();
			if(a==1) {
				wins.winds();
				System.out.println("off를 누르면 그만둘 수 있습니다. ");;
			}else if(a==2) {
				System.out.println("나가집니다.");;
				b=1;
			}else {
				System.out.println("없는 선택지 입니다.");
			}
		}
		
	}
}
