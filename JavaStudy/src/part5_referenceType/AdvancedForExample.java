package part5_referenceType;

public class AdvancedForExample {
	
	// ----------향상된 for문-------------
	// for문의 괄호 ()에는 배열에서 꺼낸 항목을 저장할 "변수 선언"과 "콜론( : )" 그리고 "배열"을 냐란히 작성함
	// 배열 및 컬렉션 항목의 개수만큼 반복하고, 자동적으로 for문을 빠져나감 

	public static void main (String[] args) {
		
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for (int scr : scores) {
			sum = sum + scr;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}

}
