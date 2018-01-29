package com.java_sample;

import java.util.Scanner;

public class punchMain {
	private static Scanner scanner;
//
//	// 펀치머신입니다.
//	/*
//	 * 10명을 입력받아 가장 강한 펀치를 찾으세요
//	 * */
//	public static void main(String[] args) {
//		String[] nameScore = new String[2];
//		int size = nameScore.length;
//		
//		scanner = new Scanner(System.in);
//		
//		for(int i=0; i<size; i++) {
//			System.out.println(i + ". 이름과 점수를입력하세요. (유동수, 100)");
//			String sc = scanner.next();
//			String[] parts = sc.split(",");
//			System.out.println(parts[0]+""+parts[1]);
//		}
//	
//		for(int i=0; i<size; i++) {
//			System.out.println(nameScore[i]);			
//		}
//	}
//
	public static void main(String[] args) {
		String[] names = { 	"Elena", "Thomas", "Hamilton", "Suzie", "Phil",
                			"Matt", "Alex", "Emma", "John", "James",
            				"Emily","Daniel", "Neda", "Aaron", "Kate" 
            			 };
		int[] scores = {590, 252, 562, 251, 519,
                		408, 870, 646, 185, 620,
            			577, 633, 937, 380, 285};
		
		int highScoreIdx = 0;
		
		for(int i=0; i< scores.length; i++) {
			if(scores[highScoreIdx] < scores[i])
				highScoreIdx = i;
		}
		
		System.out.println("최고득점자는 "+ names[highScoreIdx] + "입니다.");
	}
}
