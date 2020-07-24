package ga.rubok.practice.mission;

public class GreatMission3 {
	public static void main(String[] args) {
		int[][] arr = { { 90, 100, 88 }, // 영어
				{ 34, 99, 45 }, // 수학
				{ 98, 65, 87 }, // 국어
		};

		String[] clsArr = { "영어", "수학", "국어" };
		int[] sumArr = new int[clsArr.length];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				sumArr[i] += arr[i][j];
			}
		}
		
		int totalSum = 0;
		int totalCnt = 0;
		for(int i = 0; i < sumArr.length; i++) {
			System.out.printf("%s의 합계 : %d, 평균 : %d\n", clsArr[i], sumArr[i], sumArr[i] / arr[i].length);
			totalSum += sumArr[i];
			totalCnt += arr[i].length;
		}
		System.out.printf("전체 합계 : %d, 전체 평균 : %.1f", totalSum, (float)totalSum / totalCnt);

	}

}
