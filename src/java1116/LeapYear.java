package java1116;
//5 ��Ű�� - �������� ���丮
public class LeapYear { //4 Ÿ�� - ����Ÿ��
	//6 �޼ҵ� - ����, ȣ��
	//�̸� - �� ������ ����
	//ī�� - ��Ÿ, aaaaLLLL()
	//Ŭ���� �̸��� �빮�ڷ� ����
	//������ �ҹ���
	public boolean leapYear(int year){
		boolean isS = false;
		//7 ���ǹ�
		if(((year%4==0)	&&	(year%100!=0))	||	(year%4==0)){
			isS = true;
		}
		return isS;
	}
	public void leapPrint(int _year){
		//8 ��ȯ�� �����Ǻ���(�ʱ����ǹݺ�����) ���Ǻ��� ���Ǻ��� ���� ��
		for (int i= _year; i < 2016; i++) {
			if(leapYear(i)){
				System.out.println(i + "�� ����");
			}
		}
	}		
	public void leapPrint(){
		//8 ��ȯ�� �����Ǻ���(�ʱ����ǹݺ�����) ���Ǻ��� ���Ǻ��� ���� ��
		for (int i=1; i < 2016; i++) {
			if(leapYear(i)){
				System.out.println(i + "�� ����");
			}
		}
	}
}
