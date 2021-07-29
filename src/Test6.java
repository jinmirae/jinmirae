import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		//학생들의 수학점수를 읽어들이는 프로그램
		//-1이 들어올때까지 ArrayList에 입력값이 채워지면서 늘어난다.
		//읽어들이기가 끝나면,
		//(1) 모든 학생의 점수를 출력
		//(2) 점수의 총합계, 평균점수를 계산해서 출력.

		ArrayList<Integer> point = new ArrayList<Integer>();//정수로 받음
		Scanner s = new Scanner(System.in);//입력받기
		
		int n=s.nextInt();//입력값을 변수로 전환
		
		while(n!=-1) {//-1이 입력될때까지 반복
			point.add(n);//정수를 입력받아 리스트에 보냄
			n=s.nextInt();//
		}
		//입력된 점수 출력
		for(int i=0;i<point.size();i++) {//i(인원수)의 값은 0으로 시작 입력받은 값을 i(인원수)로 받는다
			System.out.println(point.get(i));//i(리스트)로 갈 값  입력부분
		}
		int sum=0;//입력받은 값의 합을 구하기위한 기본값 0 선언
		for(int j=0;j<point.size();j++) {//총합계를 구하기 위해 j라는 변수를 선언 i(인원수)의 모든 입력값(점수)를 불러온다 
			sum=sum+point.get(j);//불러온 i(인원수)의 점수를 총합한다
		}
		System.out.println("합계:"+sum);//총합계출력
		System.out.println("평균:"+(sum/point.size()));//총합계/인원수=평균
		}
	}
