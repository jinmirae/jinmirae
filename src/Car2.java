import java.util.ArrayList;
import java.util.zip.Inflater;

public class Car2 {
		String nColor;
		int maxSpeed;
		int nSpeed;
		int guest;
		String modelName;
		int nWheel;
		
		//생성자 오버로딩(여러개의 생성자를 작성)<-다형성
		Car2(){//고정된선언 - 기본 생정자 - 매개변수 없음.
			this.nColor="blue";
			this.guest=5;
			this.maxSpeed=240;
			this.nSpeed=0;
		}
		
		Car2(String c, int g, int m, int n) {//avante에서 호출되는 클래스
			this.nColor=c;
			this.guest=g;
			this.maxSpeed=m;
			this.nSpeed=n;
		}
		
		Car2(String a, int b, int c, int d, String e, int f) {//Grandeur에서 호출되는 클래스
			// ▲입력된 파라미터를 문자열과 정수로 나누어 인식 후 변수값을 선언 해준다.
//			this.nColor=a;
//			this.guest=b;
//			this.maxSpeed=c;
//			this.nSpeed=d;
			// ▼중복 출력되는 this를 다른생성자에서 호출
			this(a,b,c,d);
			this.modelName=e;
			this.nWheel=f;
		}
		
		void drive(int x) {
			this.nSpeed=x;
		}
		void stop(int x) {
			this.nSpeed=0;
		}

		public String getnColor() {
			return nColor;
		}

		public void setnColor(String nColor) {
			this.nColor = nColor;
		}

		public int getMaxSpeed() {
			return maxSpeed;
		}

		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
		}

		public int getnSpeed() {
			return nSpeed;
		}

		public void setnSpeed(int nSpeed) {
			this.nSpeed = nSpeed;
		}

		public int getGuest() {
			return guest;
		}

		public void setGuest(int guest) {
			this.guest = guest;
		}

		public String getModelName() {
			return modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public int getnWheel() {
			return nWheel;
		}

		public void setnWheel(int nWheel) {
			this.nWheel = nWheel;
		}
		
		
}


