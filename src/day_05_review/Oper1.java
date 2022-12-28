package day_05_review;

import java.util.Scanner;

public class Oper1
{ public static void main(String[] args)
	{
		// 단항 연산자
	System.out.println("단항 연산자");
	int num1 = 10;
	System.out.println(+num1);
	System.out.println(-num1);
	
	boolean isTrue = true;
	System.out.println(isTrue);
	System.out.println(!isTrue);
	
		// 증감 연산자
	int num2 = 0;
	num2 +=5;
	
	System.out.println("후위"+ num2++);
	System.out.println("전위"+ ++num2);
	float num3 = 3.0f;
	System.out.println("전위"+ ++num3);
	// 단순히 1이 더해지는 개념으로 해석하면 않된다.
	// 1단계 다음으로 간다고 이해해야한다 예를들어
	// 2 3 5 7 12 이런 배열이 있다고 했을때 
	// ++[1] 은 즉 5가 나온다 int는 다음단계가 1씩 증가하는 규칙이니 나오는 값!!
	// 즉 한 메모리 영역안에 다음단계로 가진다!!가 맞는 개념이다.
	
	
	//산술 연산자
	// 수학을 조금이라도 공부했다면 알수있다. 
	
	
	}

}
