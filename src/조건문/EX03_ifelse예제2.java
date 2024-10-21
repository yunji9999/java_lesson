package 조건문;

import java.util.Scanner;

public class EX03_ifelse예제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		 int age = sc.nextInt();
		 
		 System.out.print("인원수를 입력하세요 : ");
		 
		 int people = sc.nextInt();
		 
		 if(age>=20) {
			 System.out.print("총 " + (5000*people) + "원 입니다.");}
			 else {
				 System.out.println("총 " + ((5000/2)*people) + "원 입니다.");
			 }
			 }
				 
			

	}

