package ga.rubok.level3;

public class TvTest2 {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = tv1;
		
		tv1.channelUp();
		System.out.println(tv2.channel);
				
	}

}
