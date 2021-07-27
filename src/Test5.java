import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args) {
		//ArrayList
		//배열을 신축성있게 필요한만큼의 메모리만 사용
		ArrayList<String> studentName=new ArrayList<String>();
		studentName.add("John");//add로 배열을 생성
		studentName.add("Jane");
		studentName.add("Jacob");
		studentName.add("Johanson");
		studentName.add("Jason");
		studentName.add("James");
		
		for(int i=0; i<studentName.size();i++) {
			System.out.println(studentName.get(i));//조회
		}
		System.out.println();
		studentName.set(3,"Jefferson");//수정
		for(int i=0; i<studentName.size();i++) {
			System.out.println(studentName.get(i));
		}
		
	}
}
