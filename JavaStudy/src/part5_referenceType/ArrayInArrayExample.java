package part5_referenceType;

public class ArrayInArrayExample {			 

	// ----------다차원 배열------------- 
	// 배열 속의 배열 
	public static void main(String[] args) {

		int[][] mathScores = new int[2][3];			// 길이(length)가 '3'인 것을 '2'개 만든
		for (int i = 0; i < mathScores.length; i++) {			// i = 0~1
			for (int k = 0; k < mathScores[i].length; k++) {	// k = 0~2 
				System.out.println("mathScores[" + i + "][" + k + "]= " + mathScores[i][k]);
			}
		}
		System.out.println();

		int[][] englishScores = new int[2][];		//englishScores.length가 2(2개)인 것만 정해
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for (int i = 0; i < englishScores.length; i++) {			// i = 0~1
			for (int k = 0; k < englishScores[i].length; k++) {		// k = 0~2 
				System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);
			}
		}
		System.out.println();

		int[][] javaScores = { { 95, 80 }, { 92, 96, 80 } };	// 그룹 0 & 1 이 있고 0에는 (0,0), (0,1)이 있으며 / 1에는 (1,0), (1,1) (1,2)가 있음
		for (int i = 0; i < javaScores.length; i++) {			// i = 0~1
			for (int k = 0; k < javaScores[i].length; k++) {	// k = 0~2 
				System.out.println("javaScores[" + i + "][" + k + "] = " + javaScores[i][k]);
			}
		}

	}

}
