import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		//양의 정수 두개를 순서대로 입력받는다.
		//최소공배수 최대공약수를 구한다.
		//출력
		
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();//num1 입력값 받기
		int num2 = s.nextInt();//num2 입력값 받기
		int c=0;//최소공약수 출력 변수 선언
		
		for(int i=1; i<=num1; i++) {//i는 num1, num2에 대입값(1부터 시작)
			if(num1%i==0 && num2%i==0) {//i가 num1,2 값에 공통으로 나눠지면 
				c=i;//c에 i값을 대입
			}//if 
		}//for
		System.out.print("최공약 "+c);
		System.out.print("최공배 "+num1*num2/c);
	}

}
