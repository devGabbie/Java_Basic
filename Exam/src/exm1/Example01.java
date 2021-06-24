package exm1;

import java.util.Scanner;

public class Example01 { 
	/*Scanner로 정수n을 입력받음
	 * 1부터 정수 n까지의 합을 계산하여 그 결과를 출력
	 * ex.5 = 1+2+3+4+5 출력결과 55
	 */

	public static void main(String[] args) {

		System.out.println("숫자를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int result = 0;
		for (int i=1; i<=num; i++) {
			result+=i;
		}
		System.out.println("결과: " + result);
		
	}

}
