package java1116;

public class YGCalender {
	//멤버
	//12 배열: 같은 타입의 나열
	int[] leapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int[] planYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public boolean isLeapYear(int year){
		boolean isS = false;
		if( ((year%4==0 ) && (year%100!=0)) || (year%400 == 0) ){
			isS = true;
		}
		return isS;
	}
	/**
	 * 2015, 11월 --> 1년부터 2014년까지 총합
	 * @param year 전년도까지의 총 일수를 구하기 위한 연도
	 * @return 전년도까지의 총 일수
	 */
	public int totalDay(int year){
		int tot = 0;
		for (int i = 1; i < year; i++) {
			if(isLeapYear(i)){
				tot += 366;
			}else{
				tot += 365;
			}
		}
		return tot;
	}
	/**
	 * 2015, 11 --> 2014까지의 총합 + 1~10월까지의 총합
	 * @param year
	 * @param month
	 * @return
	 */
	//11 오버로딩: 같은 이름의 메소드를 다른 방식으로 사용
	public int totalDay(int year, int month){
		int tot = totalDay(year);
		for (int i = 1; i < month; i++) {
			if(isLeapYear(year)){
				tot += leapYear[i-1];
			}else{
				tot += planYear[i-1];
			}
		}
		return tot;
	}
	public int totalDay(int year, int month, int date){
		int tot = totalDay(year, month);
		return tot+date;
	}
	public int lastDay(int year, int month){
		if(isLeapYear(year)){
			return leapYear[month-1];
		}else{
			return planYear[month-1];
		}
	}
	public void printCalender(int year, int month){
		//13 static: 객체 생성 하지 않고 사용
		String s = String.format("\t\t%d년\t%d월", year, month);
		String t = "일\t월\t화\t수\t목\t금\t토";
		System.out.println(s);
		System.out.println(t);
		int dayOfWeek = (1+totalDay(year, month, 1)-1)%7;
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= lastDay(year, month); i++) {
			System.out.print(i + "\t");
			if((dayOfWeek + i)%7 == 0){//토요일
				System.out.println();
			}
		}
		System.out.println();
	}
	public static void main(String[] args){
		YGCalender yg = new YGCalender();
		//		yg.printCalender(2015,  10);
				yg.printCalender(2015);
	}
	public void printCalender(int year) {
		String s = String.format("\t\t\t%d년", year);
		System.out.println(s);
		for (int i = 1; i < 13; i++) {
			printCalender(year, i);
		}
	}
}