package array;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : KEC
 * @ Story :int 형 배열 입력 예제
 * */
public class InputSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum=0, avg=0;
		int[] arr = new int[3]; // 3개 숫자 저장 공간
		// 배열의 값을 입력하라고 하먄 무조건 for CTRL + SPACE
		System.out.println("3개의 숫자를 입력하세요.");
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"번째 숫자 입력");
			arr[i] = scanner.nextInt();
			// 누적 공식
			sum+=arr[i];
		}
		// 입력된 값의 평균
		avg = sum/arr.length;
		
		/*for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		} */
	
		
		System.out.println("입력하신 숫자의 합 : " + sum);
		System.out.println("입력하신 숫자의 평균 : " + avg);
		
	}
}
