class MyFirstClass {
	public static void main(String[] s) {
		MySecondClass o = new MySecondClass(0,0);
		int i,j;
		for (i=1; i<=8; i++) {
			for(j=1; j<=8; j++) {
				o.setFirstValue(i);
				o.setSecondValue(j);
				System.out.print(o.Multiply());
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

class MySecondClass{
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