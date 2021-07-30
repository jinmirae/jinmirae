import java.util.ArrayList;

public class Cartest2 {

	public static void main(String[] args) {
		Car2 car = new Car2();//car2클래스의 템플릿을 이용하여 생성된 변수를 불러온다
		
		System.out.println(car.getnColor());
		System.out.println(car.getGuest());
		System.out.println(car.getMaxSpeed());
		System.out.println(car.getnSpeed());
		
		Car2 avante=new Car2("grey white",5,280,30);//Car2를 불러오면 class에서 고정된 값을 불러온다
		//인스턴스변수의 수가 맞는 생성자를 불러와 변수값을 주입
		//변수값이 아직 지정되지 않은 2번째 class에 주입 
		
		System.out.println(avante.getnColor());
		System.out.println(avante.getGuest());
		System.out.println(avante.getMaxSpeed());
		System.out.println(avante.getnSpeed());
		
		Car2 grandeur=new Car2("blak",5,320,50,"Grandeur",4);//파라미터
		
		System.out.println(grandeur.getnColor());
		System.out.println(grandeur.getGuest());
		System.out.println(grandeur.getMaxSpeed());
		System.out.println(grandeur.getnSpeed());
		System.out.println(grandeur.getModelName());
		System.out.println(grandeur.getnWheel());
		}
}
