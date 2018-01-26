package com.java_sample;

public class gameBling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = (int)(Math.random()*1000)^6;
		double dollerRate = 1116.07143;
		
		double n = i*dollerRate;
		System.out.println(i+"달러는 " + n + "원 입니다.");
	}

}
