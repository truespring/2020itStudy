package ga.rubok.level3;

public class TvTest3 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		/*
		현재 객체는 null
		객체를 만들지 않았기 때문
		*/
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		/*
		 Tv[] tvArr는 큰 주소(배열 만큼의 주소 개수를 포괄하는 주소)를 가리키고
		 각 주소(만든 만큼의 개수)가 객체를 가리킴 
		 */
	}

}
