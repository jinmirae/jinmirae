
public class Test01 {
		//static int k 이 클래스를 기반하는 모든 인스턴스에서 공유하는 필드.
		static int k=-1;//final선언 시 정적필드의 값을 고정
		private int t1;
		private String t2;
		
		//생성자 오버로딩
		public void setField(int i) {
			this.t1=i;
		}
		public void setField(String s) {
			this.t2=s;
		}
		public int getT1() {
			return this.t1;
		}
		public String getT2() {
			return this.t2;
		}
		public static void setK(int a) {
			k=a;
		}
		public static int getK() {
			return k;
		}
}
