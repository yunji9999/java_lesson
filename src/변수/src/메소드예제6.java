
public class 메소드예제6 {

	public static void main(String[] args) {
	
		int[] arr = {15,10,2,8,23};		
		
		//average(array)의 값을 추출 원해
		avg(arr);
		
		// average라는 메소드에 array를 담아서 보내야하는데
		// 이럴 때는 반드시 avg(arr) 출력을 해줘야함
		
		System.out.println(avg(arr));
	}
	

	
	//public static int avg(int arr[]) {
		
	public static double avg(int [] a) {
		// float도 가능함
		int sum=0;
		
		for (int i=0; i<5; i++) {
		
			sum += arr[i];
					
			int average = 0;
			average = sum/5;
			
		} return avg;
}

	
	
	
	
	
	
	

}
