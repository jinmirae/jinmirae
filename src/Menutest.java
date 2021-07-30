import java.util.ArrayList;
import java.util.Scanner;

public class Menutest {

	public static void main(String[] args) {
		Menu menu = new Menu();//class에서 선언한 Menu초기화를 자동으로 인식 실행
		
		//메뉴이름/가격을 입력하는 루틴
		
		Scanner s1 = new Scanner(System.in);//1개의 class에 2개의 인스턴스변수를 입력하기 위해
		Scanner s2 = new Scanner(System.in);//scanner를 2개 선언
		String n = s1.nextLine();
		
		while(!n.equals("")) {//공백은 문자로 들어가니 while문에서는 equals를 선언하여 사용
			int x=s2.nextInt();//alPrice가격이 될 변수 인식
			menu.addName(n);//alName메뉴이름으로 입력되는 값 n을 가져옴
			menu.addPrice(x);//alPrice메뉴가격으로 입력되는 값 x를 가져옴
			n= s1.nextLine();//alPrice메뉴가격으로 입력되는 값 x를 변수로 인식
		}
		//메뉴이름이 ""이 입력되면 루틴(반복문) 종료.
		//그동안입력된 메뉴명/가격 출력.
		menu.showMenu();//클래스 void showMenu안에서 출력선언하여  while문이 끝나면 자동으로 전체메뉴 출력
		
	}
}