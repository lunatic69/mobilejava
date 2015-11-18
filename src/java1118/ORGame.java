package java1118;

import java.util.Arrays;
public class ORGame {
	private int[] game;
	public ORGame(int n){
		if(n%2==0){
			game = new int[n];
		}else{
			System.out.println("짝수를 입력하시오.");
			System.exit(-1);
		}
	}
	public ORGame(){
		this(20);
	}
	private int makeOne(){
		return (int)(Math.random()*(game.length/2))+1;
	}
	public int hasTwo(int n){
		int hasT = 0;
		for (int i = 0; i < game.length; i++) {
			if(n==game[i]){
				hasT++;
			}
		}
		return hasT;
	}
	public void make(){
		Arrays.fill(game, -1);
		int count = 0;
		while(count !=game.length){
			int temp = makeOne();
			if(hasTwo(temp)<2){
				game[count++] = temp;
			}
		}
	}
	public void print(){
		for (int i = 0; i < game.length; i++) {
			System.out.print(game[i] + "\t");
			if((i+1)==game.length/2){
				System.out.println();
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ORGame game = new ORGame(34);
		game.make();
		game.print();
	}
}
