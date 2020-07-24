package ga.rubok.level6;

public class PlayerTest {
	public static void main(String[] args) {
		Player player = new CDPlayer();
		player.play();
		player.stop();
		
		player = new DVDPlayer();
		player.play();
	}

}
