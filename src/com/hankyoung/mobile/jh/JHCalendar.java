package com.hankyoung.mobile.jh;

import java.util.Calendar;

//물리적 디렉토리
//체계적 분리
//은닉화: a.b.Hello와 a.c.Hello는 다른 패키지
public class JHCalendar {
	public void printCalender(int year, int month){
		//13 static: 객체 생성 하지 않고 사용
		String s = String.format("\t\t%d년\t%d월", year, month);
		String t = "일\t월\t화\t수\t목\t금\t토";
		System.out.println(s);
		System.out.println(t);
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);//0~11월로 만들었기 때문에 month-1을 한다.
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		//Calendar.DAY_OF_WEEK 1일의 요일
		//1: 일요일 ~ 7: 토요일
		for (int i = 1; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		//cal 실질적인 마지막날 31, 30, 29, 28
		for (int i = 1; i <= lastDay; i++) {
			System.out.print(i + "\t");
			if((dayOfWeek + i - 1)%7 == 0){//토요일
				System.out.println();
			}
		}
		System.out.println();
	}
	public void printCalender(int year) {
		String s = String.format("\t\t\t%d년", year);
		System.out.println(s);
		for (int i = 1; i < 13; i++) {
			printCalender(year, i);
		}
	}
	public static void main(String[] args) {
		JHCalendar jh = new JHCalendar();
		jh.printCalender(2015);
	}
}
