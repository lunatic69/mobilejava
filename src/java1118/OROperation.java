package java1118;


public class OROperation {
	public int sum100(){
		int s = 0;
		for (int a = 1; a < 101; a=a+1) {
			s = s + a;
		}
		return s;
	}
	public double sumExe(){
		double s = 1.0;
		double a = 1.0;
		for (int i = 1; i < 20; i++) {
			a = (1.0/i)*a;
			s = s + a;
		}
		return s;
	}
	public double deposit (int year, double r, double b){
		double sum = 0.0;
		double rr = r/100.0/12.0;
		double a = b*(1+rr);
		for (int i = 0; i < 12*year; i++) {
			a = a*(1+rr);
			sum += a;
		}
		return sum;
	} 
		
	/* s = 1.0
	 * a = 1.0
	 * i = 1 1<20 a = 1.0/1*1.0; s = 1 + 1.0/1*1.0
	 * i = 2 2<20 a = 1.0/1/2*1.0 s = 
	 */

	public static void main(String[] args){
		OROperation oro = new OROperation();
//		oro.sum100();
		int aa=(int)oro.deposit(3, 1.5, 800000);
		System.out.println(aa);
	

	}
}
