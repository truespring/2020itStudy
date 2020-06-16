package ga.rubok.level2;

public class Array {
	public static void main(String[] args) {
		int[] arr = new int[100]; // [], new가 들어가면 reference 변수
		char[] arr2 = new char[20]; // 배열을 쓰는 이유는 변수를 반복하기 싫어서
		float[] arr3 = new float[10]; //변수 타입[] 주소값 = new 변수 타입[갯수]; reference 변수로 바뀜 어떤 변수 타입이든
		boolean[] arr6 = new boolean[2];
		String[] arr4 = new String[30]; // type[] 변수명 = new type[갯수]
		System.out.println(arr4[0]); // 기본 값은 null이 들어 있음
		System.out.println(arr[0]); // 기본 값은 0이 들어 있음
		System.out.println(arr6[0]); // 기본 값은 false가 들어 있음
		System.out.printf("%d\n",(int)arr2[2]); // 기본 값은 " "가 들어 있음

		int[] arr5 = { 10, 20, 30, 40 }; // 방을 만듦과 동시에 객체를 할당
		System.out.println(arr5[0]);
		
		
		int[] arr7 = new int[100];
		for(int i = 0; i < arr7.length; i++) { //주소값.~~~ 여기서 .을 사용하는 것은 reference 변수만 사용 가능함, null 일 때는 에러가 발생
			arr7[i] = 5;
		}
		
		for(int i = 0; i < arr7.length; i++) {
			// arr7[i] = 5; 좋은 방법은 아님 나중에 메소드를 활용할 때 메소드는 한 가지 작업을 해야하기 때문에 나눠주는 것이 좋음
			System.out.println(arr7[i]);
		}

	}

}
