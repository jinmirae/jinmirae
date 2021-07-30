//다른패키지 안에 있는 클래스를 사용하고 싶다면 임포트하여 불러와 사용
import pck.Reuse;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Test01 t=new Test01();
		t.setField(10);
		t.setField("Hello");
		System.out.println(t.getT1()+","+t.getT2());
		t.setK(7);
		System.out.println(t.getK());
		Test01 tx=new Test01();
		System.out.println(tx.getK());
		
		Reuse rus = new Reuse();//impot한 Reuse를 새로운 메소드로 선언하여 사용
	}

}
