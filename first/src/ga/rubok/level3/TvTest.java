package ga.rubok.level3;

public class TvTest {
	public static void main(String[] args) {
		Tv tv1 = new Tv(); //Tv 객체 주소값만 받음
		
		System.out.println("name : " + tv1.name); 
		System.out.println("power : " + tv1.power);
		System.out.println("channel : " + tv1.channel);
		
		System.out.println("-----------------");
		tv1.name = "삼성Tv";
		System.out.println("name : " + tv1.name);
		tv1.changePower();
		System.out.println("power : " + tv1.power);
		tv1.channel = 5;
		System.out.println("channel : " + tv1.channel);
		tv1.channelUp();
		System.out.println("channel : " + tv1.channel);
		tv1.channelDown();
		System.out.println("channel : " + tv1.channel);
	}

}
