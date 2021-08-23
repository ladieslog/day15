package day15;

public class Quiz01_t1 {
	public static void main(String[] args) {
		Login_tap log =new Login_tap();
		Function_obtion func =new Function_obtion();
		int a=0;
		while(true) { 
				a= log.login();
			if(a==1) {
				System.out.println("인증통과");
				func.winObtion();
			}else if(a==2) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}
}
