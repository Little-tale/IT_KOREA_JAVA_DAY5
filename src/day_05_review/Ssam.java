package day_05_review;

import java.util.Scanner;

public class Ssam {
	public static void main(String[] args)
	{
		// 1. 변수를 만든다(inputNum, resultNum1, resultNum2)
		// 2. 출력한다(두자리수 정수를 입력하세요)
		// 3. 입력 받아 inputNum 저장한다.
		// 4. 계산하여 resultNum 변수에 저장한다.
		// 5. 결과를 출력한다.
		
		int inputNum = 0, resultNum1 = 0, resultNum2 =0 ;
		String msg = "두 자리수 정수를 입력하세요 : ";
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println(msg);
		inputNum = sc.nextInt();
		resultNum1 = inputNum / 10;
		resultNum2 = inputNum % 10;
		
		System.out.println("십의자리 : "+ resultNum1);
		System.out.println("일의자리 : "+ resultNum2);
		
		/////////////////////////////////////////////////////////
		
		// 1. 변수를 만든다.(int math, korean, english, sum, avg)
		// 2. 출력한다.(어떤 내용이 입력되는지 알려줄 수 있도록)
		// 3. 입력받아서 각 변수에 저장한다.(math, korean, english)
		// 4. 계산하여 sum 변수에 저장한다.(합계 저장)
		// 5. 계산하여 avg 변수에 저장한다.(평균(합계/과목수)저장)
		// 6. 결과를 출력한다.
		
		// 필요한 변수 선언란)
		int math = 0 , korean = 0, english = 0, sum = 0;
		float avg = 0;
		// 출력후 입력받기
		System.out.printf("수학점수 출력 : ");	math = sc.nextInt();
		System.out.printf("국어 점수 출력 : ");	korean = sc.nextInt();
		System.out.printf("영어 점수 출력 : ");	english = sc.nextInt();
		// 합계점수, 평균 점수 구하기
		sum = math + korean + english;
		avg = sum/3;
		
		System.out.println("합계점수 : "+sum);
		System.out.println("평균점수 : "+avg);
	}

}
