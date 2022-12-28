package day_05_review;

import java.util.Scanner;

public class Platics
{ public static void main(String[] args)
	{
		//실습1
		// 두자리수 정수를 입력받고 십의자리. 일의자리를 출력하는 프로그램
	
		// 입력예시
		/*
		 * 두자리수 정수를 입력하세요 : 51
		 * 출력예시 
		 * 십의자리는 5 입니다. 일의 자리는 1입니다.
		 */
	
	// 변수 선언란)
	int tenInt = 0; String tenString , firstString;
	// Scan 선언
	Scanner scan = new Scanner(System.in);
	// 입력받고 출력 동시 
	System.out.print("두 자릿수 정수를 입력하세요 : ");
	tenInt = scan.nextInt();
	
	//스트링으로 자르기
	
	System.out.printf("십의자리는 %.1s 입니다 \n", ""+tenInt);
	System.out.printf("일의자리는 %s 입니다", ""+tenInt);

		//실습 2
			//수학점수, 국어점수, 영어점수, 입력받고
			// 합계와 평균을 구하기
	
		//입력예시
		/*
		 * 100, 90, 100 
		 * 평균점수 
		 * 96
		 */
	}

}
