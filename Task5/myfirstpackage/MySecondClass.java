package myfirstpackage;

public class MySecondClass{ 
		private int val1, val2;
		public MySecondClass(int a, int b) {
			this.val1 = a;
			this.val2 = b;
		}
		
		public int getFirstValue() {
			return val1;
		}
		
		public int  getSecndValue() {
			return val2;
		}
		
		public void setSecondValue(int val){
			this.val2 = val;
		}
		
		public void setFirstValue(int val){
			this.val1 = val;
		}
		
		public int Multiply(){
			return val1 * val2;
		}
}