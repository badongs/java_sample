package com.java_sample;

public class gameBling {
	// 랜덤 달러를 가져와 원화로 환전 하기.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = (int)(Math.random()*1000)^6;
		double dollerRate = 1116.07143;
		
		double n = i*dollerRate;
		System.out.println(i+"달러는 " + n + "원 입니다.");
	}

}
