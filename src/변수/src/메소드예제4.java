
public class 메소드예제4 {

	public static void main(String[] args) {
		 // 약수의 합을 구하여 반환하는 getSumOfDivisors() 메소드를 구현하세요.

	      int num = 10;
	      int result = getSumOfDivisors(num);
	      
	      System.out.println(num+"의 약수의 합 : "+result);

	}
	public static int getSumOfDivisors(int n) {
	      int count = 0;
	      for(int i=1; i<=n; i++) {
	         if(n%i == 0) {
	            count = count + i;
	         }
	      }
	      return count;
	   }
}
