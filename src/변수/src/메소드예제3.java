
public class 메소드예제3 {

	public static void main(String[] args) {
		// num2가 num1의 약수인지 확인하여 true/false를 반환하는 isDivisor() 메소드를 구현하세요
	      
	      int num1 = 8;
	      int num2 = 2;
	      
	      boolean divide = isDivisor(num1, num2);
	      
	      System.out.println(divide);

	}
	
	public static boolean isDivisor(int num1, int num2) {
			if(num1%num2==0) {
				return true;
			}else{
				return false;
			}

    }
}
	

