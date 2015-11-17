package com.hankyoung.mobile.jh;

public class JHAntQuiz {
	//h = "112213"
	public String antQuiz(String h){
		String t = "";
		char c = h.charAt(0);//1
		int count = 1;
		for(int i = 1; i<h.length(); i++){
			if(c==h.charAt(i)){
				count++;
			}else{
				t = t+c+count;
				c = h.charAt(i);
				count = 1;
			}
		}
		t = t + c + count; //마지막 것
		System.out.println(t);
		return t;
	}
	public void antQuiz(int stage){
		String t = "11";
		for (int i = 0; i < stage; i++) {
			System.out.println(t);
			t = antQuiz(t);
			
		}
	}
public static void main(String[] args) {
	JHAntQuiz quiz = new JHAntQuiz();
	quiz.antQuiz("11");
	
}
}
