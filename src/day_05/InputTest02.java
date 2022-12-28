package day_05;

import java.util.Scanner;

public class InputTest02
{	public static void main(String[] args)
	{
		// 1. 두 정수를 입력 받고 합을 구하기
		// 2. 넥스트 사용 

		// 변수 선언 란)
		int first ; // 초기화는 꼭 하는게 좋지만 안해도 작동은 된다. 대신 메모리 효율성 떨어짐
		int second ;
		
		// 클래스 선언
		Scanner scan = new Scanner(System.in);
		
		// 스캔 시작과 안내)
		System.out.print("정수 1번 입력 : ");
		first = scan.nextInt();
		System.out.print("정수 2번 입력 : ");
		second = scan.nextInt();
		
		// 마무리 답변란)
		System.out.println("두정수의 합은 "+(first+second)+" 입니다.");
		
		// 방법 3
		// nextInt를 사용했습니다! ㅠㅠ
		
	}

}
