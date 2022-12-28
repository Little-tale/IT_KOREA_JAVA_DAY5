package day_05;

import java.util.Scanner;

public class InputTest01 {

	public static void main(String[] args)
	{
		// 출력 메소드
		System.out.println();
	//	클래스.
		
		// 자료형 변수명 = 값;
		int number = 3;
		
		//
		String name = "김재형";
		Scanner sc = new Scanner (System.in);
		
		System.out.print("입력해주세요(앵무새 모드) : ");
		String returnAnswerMode = sc.nextLine(); 
		System.out.println("(앵무새) : "+returnAnswerMode);
		System.err.println("(앵무새) : (강조) "+returnAnswerMode);
		
		// 넥스트 라인이 하는일
		// 엔터 이전 까지의 값을 가져온다.
		// 엔터를 입시 저장공간에서 지워준다.(소모한다)
		
	}

}
