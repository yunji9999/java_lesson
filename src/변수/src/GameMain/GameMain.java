package GameMain;

import java.util.Scanner;

public class GameMain{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("사용한 게임을 선택해주세요");
	  System.out.println("[1] 포켓몬  [2] 커비");
	 
	  //@Override
	  ///어노테이션 :  알려주는 기능
	  
	  int input = sc.nextInt();
	  
	  if(input==1) {
		  
		  //포켓몬
		  //포켓몬 칩 가져오기
		  
		  pokemon game1 = new pokemon();
		  // 포켓몬 칩을 닌텐도에 넣고 실행
		  
		  insert(game1);
			  
	  }else if (input==2) {
		  //커비
		  //커비 칩 가져오기
		  Kirby game2 = new Kirby();
		  //커비 칩을 닌텐도에 넣고 실행
		  insert(game2);
	  }
	}
	  //사용자가 1입력하면 포켓몬 게임 사직
	  //사용자가 2입력하면 커비 게임 시작
  
  public static void insert(pokemon game1) {
	  	System.out.println("포켓몬 게임 시작");
	  	game1.start();
  }
  
  public static void insert(Kirby game1) {
	  	System.out.println("커비 게임 시작");
	  	game1.start();
  }
}
  