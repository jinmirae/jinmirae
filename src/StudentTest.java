
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		//학생클래스로 인스턴스변수 s1을 만든다.
		//s1안의 필드들에 적당한 값을 넣는다.
		//s1안의 필드들의 값을 화면에 출력.
		
		Student std = new Student();
		std.name="진미래";
		std.nYear=3;
		std.nClass=8;
		std.nNumber=31;
		std.birthday="19941216";
		std.gender="female";
		std.mobile="01042052275";
		
		System.out.println("학생이름:"+std.name);
		System.out.println("학년:"+std.nYear);
		System.out.println("반번호:"+std.nClass);
		System.out.println("학생번호:"+std.nNumber);
		System.out.println("생년월일:"+std.birthday);
		System.out.println("성별:"+std.gender);
		System.out.println("모바일번호:"+std.mobile);
		
		}
	}
