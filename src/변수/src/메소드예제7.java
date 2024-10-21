import java.util.Arrays;

public class 메소드예제7 {

	public static void main(String[] args) {
		int [] array = {1,3,4,8,9,10};
		arrayToString(array);

	}

	
	public static void arrayToString(int [] arr) {
		for (int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		//System.out.println(Arrays.toString(arr));
		}
	
		
}
