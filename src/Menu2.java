import java.util.ArrayList;

public class Menu2 {
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	Menu2() {
		alName= new ArrayList<String>();
		alPrice= new ArrayList<Integer>();
		
		ArrayList<Double>alPrice=new ArrayList<Double>();
				
		addName("Americano");
		addName("Espresso");
		addName("Latte");
		addPrice(3500);
		addPrice(2000);
		addPrice(3000);
		
		showMenu();
	}
	
	/* 생성자 - 용도: 주로 초기화 작업용
	 * 명명법: 이름이 클래스와 같아야 함.
	 * 반환값: 반환값이 없다.(반환할 수 없이, 작업만 실행)
	 * 실행 -> new연산자가 실행된 직후, 자동실행
	 * 다른 메소드를 호출할 수 있다.
	 *  */
	
	void addName(String name) {
		this.alName.add(name);//alName에 add로 name을 설정
	}
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	void showMenu() {
		//alName, alPrice 출력
		for(int i=0;i<alName.size();i++) {// ★ 꼭 외우기★
			System.out.print(alName.get(i)+"/"+alPrice.get(i)+" ");
		}
	}
}