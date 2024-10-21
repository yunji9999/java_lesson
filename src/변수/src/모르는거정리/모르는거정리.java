//package 모르는거정리;
//
//public class 모르는거정리 {
//	
//	// 곱한 거 소수점까지 살리고 싶을 때
//	public int solution (int num1, int num2) {
//		double result = (double) num1/ (double) num2;
//		return (int) result*1000;
//	}
//	
//	// 배열 자르기
//	
//	
//	//버블정렬
//	 Arrays.sort(array);  // 오름차순으로 배열 정렬 (작은 게 앞으로)
//	
//	 for (int j = 0; j < array.length - 1; j++) {
//         for (int i = 0; i < array.length - 1 - j; i++) {
//             if (array[i] > array[i + 1]) {
//                 k = array[i];
//                 array[i] = array[i + 1];
//                 array[i + 1] = k;
//             }
//         }
//     }

	
	
class Solution {
    public int[] solution(int n) {
        // 홀수의 개수를 계산하여 배열의 크기를 결정
        int size = (n + 1) / 2;
        int[] answer = new int[size];
        
        // 홀수를 배열에 저장
        int index = 0;
        for (int i = 1; i <= n; i += 2) {  // 홀수만 순회
            answer[index] = i;
            index++;
        }
        
        return answer;
    }
}
	
	
	
	
	
	
	
	
	
	

