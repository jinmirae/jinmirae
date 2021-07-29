import java.util.ArrayList;
import java.util.zip.Inflater;

public class Car {
		// 속성=변수=필드(Java)/멤버변수(C++)
		private String nColor;//private선언 밖에서 수정 불가능!!
		private int maxSpeed;
		private int nSpeed;
		private int guest;
		private String modelName;
		private int nWheel;
		private int nFuel;
		ArrayList<Inflater> dailyRun;
		 
		//Source에서 Getters end Setters생성
		public String getnColor() {
			return nColor;
		}
		public int getMaxSpeed() {
			return maxSpeed;
		}
		public int getnSpeed() {
			return this.nSpeed;
		}
		public int getGuest() {
			return guest;
		}
		public String getModelName() {
			return modelName;
		}
		public int getnWheel() {
			return nWheel;
		}
		public int getnFuel() {
			return nFuel;
		}
		public ArrayList<Inflater> getDailyRun() {
			return dailyRun;
		}
		public void setnColor(String nColor) {
			this.nColor = nColor;
		}
		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
		}
		public void setnSpeed(int nSpeed) {
			this.nSpeed = nSpeed;
		}
		public void setGuest(int guest) {
			this.guest = guest;
		}
		public void setModelName(String modelName) {
			this.modelName = modelName;
		}
		public void setnWheel(int nWheel) {
			this.nWheel = nWheel;
		}
		public void setnFuel(int nFuel) {
			this.nFuel = nFuel;
		}
		public void setDailyRun(ArrayList<Inflater> dailyRun) {
			this.dailyRun = dailyRun;
		}
		public void drive(int x) {
			this.nSpeed=x;			
		}
		public void stop() {
			this.nSpeed=0;		
		}
		
}


//		void setColor(String colorstr) {//private선언으로 (캡슐화)하여 set으로 밖으로 보냄
//			this.nColor=colorstr;//윗줄변수명선언 colorstr전달하는 이미지변수
//		}
//		String getColor() {//밖으로 반환 String, return으로 선언
//			return this.nColor;
//		}

