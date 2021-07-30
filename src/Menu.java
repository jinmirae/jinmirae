import java.util.ArrayList;

public class Menu {
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	Menu() {
		this.alName= new ArrayList<String>();
		this.alPrice= new ArrayList<Integer>();
	}
	
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