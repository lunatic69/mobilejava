package com.hankyoung.mobile.jh;

import java.util.Calendar;

//������ ���丮
//ü���� �и�
//����ȭ: a.b.Hello�� a.c.Hello�� �ٸ� ��Ű��
public class JHCalendar {
	public void printCalender(int year, int month){
		//13 static: ��ü ���� ���� �ʰ� ���
		String s = String.format("\t\t%d��\t%d��", year, month);
		String t = "��\t��\tȭ\t��\t��\t��\t��";
		System.out.println(s);
		System.out.println(t);
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);//0~11���� ������� ������ month-1�� �Ѵ�.
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		//Calendar.DAY_OF_WEEK 1���� ����
		//1: �Ͽ��� ~ 7: �����
		for (int i = 1; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		//cal �������� �������� 31, 30, 29, 28
		for (int i = 1; i <= lastDay; i++) {
			System.out.print(i + "\t");
			if((dayOfWeek + i - 1)%7 == 0){//�����
				System.out.println();
			}
		}
		System.out.println();
	}
	public void printCalender(int year) {
		String s = String.format("\t\t\t%d��", year);
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
