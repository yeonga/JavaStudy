package part4_1_if_switch;

public class IfDiceExample_Random {

  /*  랜덤 뽑기 : int num = (int) (Math.random() * n) + start; ->  n = n개의 정수 / start = 시작 숫자 
	1. 주사위 번호 하나 뽑기 (1부터6까지) : int num = (int) (Math.random() * 6)+1;
	2. 로또 번호 뽑기 (1부터 45까지) : int num = (int) (Math.random() * 45)+1;  */

	public static void main(String[] args) {

		int num = (int) (Math.random() * 6) + 1; // 주사위 번호 하나 뽑기

		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}

	}

}
