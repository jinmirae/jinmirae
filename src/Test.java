
public class Test {

	public static void main(String[] args) {

		int j = 0;
		
		for(int i=2; i<=10000; i++) {
			for(int k=2; k<=i; k++) {
				if(i%k == 0) {
					j++;
				}
			}
			if(j == 1) {
				System.out.println(i);
			}
			j =0;
		}
	}

}
