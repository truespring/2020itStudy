package ga.rubok.level3;

import java.util.ArrayList;

public class List2 {
	public static void main(String[] args) {
		
//		Object obj = 1;
//		obj = "aaa";
//		obj = 1.1;  사용하려면 강제 형변환이 필요함
//		          제네릭이라는 제약사항을 걸음
		ArrayList<Integer> list = new ArrayList();
		list.add(1); // add는 인덱스를 한 칸 늘리고 (int)는 값을 넣음
		list.add(2);
		list.add(2, 11);
		list.add(3);
		list.add(4);
//		list.add("ddd");

		list.add(2, 1);
		list.add(2, 11);
		list.add(2, 18);
		list.remove(3);
		
		System.out.println();
		
		int value = list.get(2);
		System.out.println(value);
		
		for(int i = 0; i < list.size(); i++) {
			int val = list.get(i);
			System.out.print(val + ", ");
		}
		System.out.println();
		// Object는 최상위 부모이고 Java의 모든 자식이 상속받음
		for(int val : list) {
			System.out.print(val + ", ");
		}
	}

}
