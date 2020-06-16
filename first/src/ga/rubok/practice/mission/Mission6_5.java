package ga.rubok.practice.mission;

public class Mission6_5 {
	
	public static void main(String[] args) {
		int star = 5;
//
//		for(int i = 1; i <= star; i++) {
//			for(int j = 1; j <= star; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i = 1; i <= star*star; i++) {
			System.out.print("*");
			if(i%star == 0) {
				System.out.println();
			}
		}
	}

}
