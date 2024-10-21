package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02ArrayList예제 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		
		
		int select = 0;
		
		
		while(true) {
			System.out.println("====현재 재생목록====");
			System.out.println(list);
//			 for(int i=0;i<list.size();i++) {
//	               System.out.println((i+1)+"번째 곡>> "+list.get(i));
//	            }

			System.out.println("=================");
			
			
			System.out.println("==메뉴를 선택 해주세요==");
			System.out.println("[1] 노래추가 [2] 노래삭제 [3] 종료");
			
			select = sc.nextInt();
			
			if(select==1) {
				//추가로직
				System.out.println("추가할 노래 제목 입력");
				String title = sc.next(); //노래 제목
				System.out.println("추가할 위치 입력");
				int num = sc.nextInt(); //노래 위치
				//리스트 노래를 추가할 로직
					list.add(num-1,title);
					
				System.out.print(title+"이 "+num+"에 추가가 완료 되었습니다.");
				
			}else if(select==2) {
				System.out.println("삭제할 노래 위치 입력");
				int index = sc.nextInt();
					list.remove(index-1);
				// 리스트 노래 삭제할 로직
				System.out.print("노래 삭제가 완료되었습니다.");
				
				
			}else if(select==3) {
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("다시 입력해주세요");
				//입력 오류 예외 처리
			}
			
		/*	catch (InputMismatchException e) {
               // 예외가 발생하면 처리할 부분
               String input = sc.next(); // 잘못된 입력을 소비하여 버림
               if (input.equalsIgnoreCase("exit")) {
                   break; // exit 입력시 종료
               } else {
                   System.out.println("Invalid input.");
               }
            // 인덱스 범위 초과 오류 예외처리
           } catch (IndexOutOfBoundsException e) {
               // 예외 발생 시 처리할 부분
               System.out.println("IndexOutOfBoundsException 오류 발생");
           }
        
*/
		
		
		
		
		
		
		}

	}

}
