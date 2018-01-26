package com.java_sample;

import java.util.Scanner;

public class bmiChk {
	private static Scanner scanner;

	// 비만도 검사
	/* BMI = 체중 / (키*제곱)
	     < 기준 > 
	  	비만  : 25 이상
		과체중 : 23 - 24.9
		정상 : 18.5 - 22.9
		저체중 : 18.5 미만
		
		<화면>
		** 비만도 체크입니다. **
		1. 키를입력하세요 .
		2 .몸모게를 입려하세요.
		당신의 BMI는 xx 이고  당신은 (저체중, 정상, 과체중, 비만) 입니다.
		
	 */
	
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.println("** 비만도 체크입니다. **");

		System.out.println("1. 키를 입력하세요.");
		double t = scanner.nextDouble() / 100;

		System.out.println("2. 몸무게를 입력하세요.");
		double w = scanner.nextDouble();

		double bmi = w / (t * t);
		String bmiCheck = "";
		if (bmi < 18.5) {
			bmiCheck = "저체중";
		} else if (bmi >= 18.5 && bmi <= 22.9) {
			bmiCheck = "정상";
		} else if (bmi >= 23 && bmi <= 24.9) {
			bmiCheck = "과체중";
		} else if (bmi >= 25) {
			bmiCheck = "비반";
		}

		System.out.println("당신의 BMI수치는" + bmi + "이고 당신은 " + bmiCheck + "입니다.");
	}

}
