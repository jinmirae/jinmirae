import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		//Factorial :n!
		//양의 정수를 입력받는다. 단,10이하의 숫자.
		//팩토리얼을 계산하는 프로그램.
		Scanner s = new Scanner(System.in);//입력받는다
		int n = s.nextInt();//정수를 입력받아 n으로 대입
		int p = 1;//출력되는값 p
		for(int i=1; i<=n; i++) {//입력받은 정수까지 반복
			p=p*i;//반복값 i를 모두 곱하여 p에 대입
		}
		System.out.println(p);//계산된 p출력
	}
}
