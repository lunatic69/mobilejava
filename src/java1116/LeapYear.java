package java1116;
//5 패키지 - 물리적인 디렉토리
public class LeapYear { //4 타입 - 참조타입
	//6 메소드 - 선언, 호출
	//이름 - 몇 라인의 묶음
	//카멜 - 낙타, aaaaLLLL()
	//클래스 이름은 대문자로 시작
	//예약어는 소문자
	public boolean leapYear(int year){
		boolean isS = false;
		//7 조건문
		if(((year%4==0)	&&	(year%100!=0))	||	(year%4==0)){
			isS = true;
		}
		return isS;
	}
	public void leapPrint(int _year){
		//8 순환문 초조건빤스(초기조건반복스택) 조건빤스 조건빤스 조건 끝
		for (int i= _year; i < 2016; i++) {
			if(leapYear(i)){
				System.out.println(i + "는 윤년");
			}
		}
	}		
	public void leapPrint(){
		//8 순환문 초조건빤스(초기조건반복스택) 조건빤스 조건빤스 조건 끝
		for (int i=1; i < 2016; i++) {
			if(leapYear(i)){
				System.out.println(i + "는 윤년");
			}
		}
	}
}
