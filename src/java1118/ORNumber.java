package java1118;

public class ORNumber {
	//	n-2
	public boolean isPrime(int num){
		boolean isP = true;
		//		6이 2로 나뉘어졌음에도 3으로 다시 나누는 것을 막기 위해 break로 제어해 준다.
		for (int i = 2; i < num; i++) {
			if(num%i==0){
				isP = false;
				break;
			}
		}
		return isP;
	}
	public boolean isPrime2(int num){
		boolean isP = true;
		//		정수의 반까지만 나눠봐도 그것이 소수인지를 알 수 있다.
		for (int i = 2; i < num/2; i++) {
			if(num%i==0){
				isP = false;
				break;
			}
		}
		return isP;
	}
	public boolean isPrime3(int num){
		boolean isP = true;
		//		6이 2로 나뉘어졌음에도 3으로 다시 나누는 것을 막기 위해 break로 제어해 준다.
		for (int i = 2; i < (int)(Math.sqrt(num)); i++) {
			if(num%i==0){
				isP = false;
				break;
			}
		}
		return isP;
	}
	public void printPrime(){
		for (int i = 2; i < 100; i++) {
			if(isPrime(i)){
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ORNumber orn = new ORNumber();
		//		orn.printPrime();
		//		orn.divideNum(100);
		//		orn.printPerfect(100);
		orn.printAmicable(220);
	}
	//	약수 254p
	public void divideNum(int n){
		if(n==1){
			System.out.println("[1]");
		}else{
			System.out.print("[1, ");
			for (int i = 2; i < n; i++) {
				if(n%i==0){
					System.out.printf("%d, ", i);
				}
			}
			System.out.println(n+"]");
		}
	}
	public int sumDivide(int n){
		int tot = 1;
		for (int i = 2; i < n; i++) {
			if(n%i==0){
				tot += i;
			}
		}
		return tot;
	}

	public void printPerfect(int n){
		for (int i = 2; i <= n; i++) {
			if(i==sumDivide(i)){
				System.out.printf("%d는 완전수: ", i);
				divideNum(i);
			}
		}
	}
	public void printAmicable(int n){
		for (int i = 2; i <= n; i++) {
			int A = i;
			int B = sumDivide(A);
			int C = sumDivide(B);
			if((A<B) && (A==C)){
				System.out.printf("%d: %d 친화수 ", A, B);
				divideNum(A);
				divideNum(B);
			}
		}
	}
}