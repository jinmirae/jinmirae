import java.util.ArrayList;
import java.util.Scanner;

public class Menutest {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.init();
		
		//메뉴이름/가격을 입력하는 루틴
		
		Scanner s1 = new Scanner(System.in);//스캐너는 2개 선언
		Scanner s2 = new Scanner(System.in);
		String n = s1.nextLine();
		
		while(!n.equals("")) {//공백은 문자로 들어가니 while문에서는 equals를 선언하여 사용
			int x=s2.nextInt();//alPrice가격이 될 변수 인식
			menu.addName(n);//alName메뉴이름으로 입력되는 값 n을 가져옴
			menu.addPrice(x);//alPrice메뉴가격으로 입력되는 값 x를 가져옴
			n= s1.nextLine();//alPrice메뉴가격으로 입력되는 값 x를 변수로 인식
		}
		//메뉴이름이 ""이 입력되면 루틴(반복문) 종료.
		//그동안입력된 메뉴명/가격 출력.
		menu.showMenu();
		
	}
}
