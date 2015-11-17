package com.hankyoung.mobile.jh;


public class Star {
	public static void downMountain(int stage){
		for(int i = 0; i < stage; i++){
			for (int j = 0; j < i+1; j++) {
				System.out.printf("%s", "*,¡Ú");
			}
			System.out.println();
		}
	}
	public static void upMountain(int stage){
		for (int i = 0; i < stage; i++) {
			for (int j = 0; j < stage-1-i; j++) {
				System.out.printf("%s", " ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.printf("%s","¡Û");
			}
			System.out.println();
		}
	}
		public static void mountain(int stage){
			for (int i = 0; i < stage; i++) {
				for (int j = 0; j < stage-1-i; j++) {
					System.out.printf("%s", "¡Ü");
				}
				for (int j = 0; j < 2*i+1; j++) {
					System.out.printf("%s","¡Û");
				}
				System.out.println();
			}
		}
		public static void sandwich(int stage){
			for (int j = 0; j < stage; j++) {
				for (int i = 0; i < stage-j; i++) {
					System.out.printf("%s","X");
				}
				System.out.println();
			}
		}
		public static void diamond(int stage){
			for (int i = 0; i < stage; i++) {
				for (int j = 0; j < Math.abs(i-stage/2); j++) {
					System.out.printf("%s","¡Ü");
				}
				for (int j = 0; j < stage-2*Math.abs(i-stage/2); j++) {
					System.out.printf("%s","¡Û");
				}
				System.out.println();
			}
		}
	


	public static void main(String[] args) {
		//downMountain(4);
//		System.out.println();
//		upMountain(5);
//		mountain(5);
//		sandwich(5);
		diamond(5);
	}
}
