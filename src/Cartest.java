import java.util.ArrayList;

public class Cartest {

	public static void main(String[] args) {
		Car seltos = new Car();//Car 필드값의 seltos선언
		
		//필수(변수)에 직접 접근 클래스에서 private선언으로 아래 명령어 사용 불가능
		//seltos.nColor="White";
		//System.out.println("색상:"+seltos.nColor);
		
		//메소드를 통해서 필드(변수)에 접근
		seltos.setnColor("blue");
		String color=seltos.getnColor();
		System.out.println("색상:"+color);
		
		seltos.setGuest(3);
		System.out.println("승객수:"+seltos.getGuest());
		seltos.drive(50);
		System.out.println("현재속도:"+seltos.getnSpeed());
		seltos.stop();
		System.out.println("정지후 속도:"+seltos.getnSpeed());
		
		}
}
