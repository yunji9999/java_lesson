
public class 메소드예제1 {

	public static void main(String[] args) {
		 // 정수형 변수 num1과 num2를 각각 초기화하고 문자형 변수 op를 선언해서 원하는 연산자로 초기화하세요.
	      // num1,num2,op의 값을 받아 num1과 num2를 op의 연산자에 맞게 연산한 최종 값을 반환해주는 cal 메소드를 작성하세요

	      int num1 = 50;
	      int num2 = 15;
	      char op = '-';

	      System.out.println(cal(num1, num2, op));
	}
	public static int cal(int num1, int num2, char op) {
		int result =0;
		
		if(op=='+') {
			result=num1+num2;
				
		}
		else if(op=='-')  { 
			result=num1-num2;
		}
		else if(op=='*') {
			result=num1*num2;
		}
		else if (op=='/') {
			result=num1/num2;
		}
		
		return result;
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
