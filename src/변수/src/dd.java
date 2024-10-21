//class Solution {
//    public int[] solution(int[] numbers, int num1, int num2) {
//        int[] answer = new int [num2-num1+1];
//     
//            for (int i=0; i<num2-num1+1; i++){
//                answer [i] = numbers [num1+i];
//            }
//        return answer;
//    }
//}

//answer [0] = numbers [num1];
//answer [1] = numbers [num1+1]
//answer [2] = numbers [num1+2]

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        
        // 분자 = denom2 * numer1 + denom1 * numer2
        // 분모 = denom1 * denom2
        
        int a = denom2 * numer1 + denom1 * numer2;
        int b = denom1 * denom2;
        
        //여기서 a, b의 최대공약수를 찾아서 각각 분자 분모에 나눠줘야함
        // 최대공약수 구하는 법: 
        
        int k=0;
        
        for (int i=0; i=a; i++){
            if(a%i==0){
                k=a;
            }
            for(int j=0; j=b; j++){
             if(b%i==0){
                 k=b;
             }   
            }
            //k는 최대공약수
            
            answer [0] = a/k;
            answer [1] = b/k;
        }
        
        
        return answer;
    }
}