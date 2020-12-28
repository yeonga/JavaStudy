package part5;

public class ArrayLengthExample {

	// ----------배열길이-------------
	// 배열에 저장할 수 있는 전체 항목의 개수
	// 배열 변수.length; (값을 절대 바꿀 수 없고 & 새로운 값을 추가하지도 못함)

	public static void main(String[] args) {

		int[] scores = { 83, 90, 87 };

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);

	}

}