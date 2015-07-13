package array;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : KEC
 * @ Story :int 형 배열에서 입력값 중 최대값 구하기
 * */
public class InputMax {
	public static void main(String[] args) {
		// 배열 선언 및 초기화
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];
		int max=0;
		System.out.println("3개의 점수를 입력하세요.");
		
		// for-loop으로 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("최대값은 " + max);
		// 비교로직은 if 문을 사용하세요.
		/* if(arr[0]>arr[1] && arr[0]>arr[2]){
			System.out.println("최대값은 " + arr[0]);
		}else if(arr[1]>arr[2] && arr[1]>arr[0]) {
			System.out.println("최대값은 " + arr[1]);
		}else if(arr[2]>arr[1] && arr[2]>arr[0]){
			System.out.println("최대값은 " + arr[2]);
		}else{
			System.out.println("잘못된 값 입력");
		} */
		
	}
}
