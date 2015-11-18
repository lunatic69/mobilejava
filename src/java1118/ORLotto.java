package java1118;

import java.util.Arrays;

public class ORLotto {
	//	19 ����������
	//	20 ����ȭ Encapsulation
	private int [] lots;
	//	������ �����ε�
	public ORLotto(int n){
		lots = new int[n]; // �� �� �迭�� ���� ���� �⺻������ 0
	}
	public ORLotto(){
		this(6);
	}
	//	Math.Random(); : 0~0.9999999999...�� �ϳ��� �Ǽ��� ������
	private int makeOne(){
		return (int)(Math.random()*45)+1;
	}

	public boolean hasSame(int n){
		boolean hasS = false;
		for (int i = 0; i < lots.length; i++) {
			if(n==lots[i]){
				hasS=true;
				break;
			}
		}
		return hasS;
	}
	public void make(){
		Arrays.fill(lots, 0);
		int count = 0;
		while(count !=lots.length){
			int temp = makeOne();
			if(!hasSame(temp)){
				lots[count++] = temp;
			}
		}
	}
	public void print(){
		for (int i = 0; i < lots.length; i++) {
			System.out.print(lots[i] + "\t");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		ORLotto lot = new ORLotto();
		lot.make();
		lot.print();
		lot.make();
		lot.print();
	}
}