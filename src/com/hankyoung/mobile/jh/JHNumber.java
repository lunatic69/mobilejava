package com.hankyoung.mobile.jh;

public class JHNumber {
	/**
	 * 각 자리의 합 구하기
	 * 123 => 1+2+3
	 * @param num
	 * @return
	 */
	public static int sumEach1(int num){
		int tot = 0;
		while(num!=0){
			tot += num%10;
			num /= 10;
		}
		return tot;
	}
	public static int sumEach2(int num){
		int tot = 0;
		for (int i = 0; i < (num+"").length(); i++) {
			tot += (num+"").charAt(i)-'0';// '9' - '0'
		}
		return tot;
	}
	public static int sumEach3(int num){
		int tot = 0;
		char []cc = (num+"").toCharArray();
		for (int i = 0; i < cc.length; i++) {
			tot += cc[i] - '0';
		}
		return tot;
	}
	public static void main(String[] args) {
		int num = 23345;
		int aa = JHNumber.sumEach3(num);
		System.out.println(aa);
		System.out.println((int)'0');
	}
}
