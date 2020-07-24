package ga.rubok.level6;

public abstract class Player {
//	추상메소드가 하나라도 있다면 클래스 앞에 abstract를 붙이고 해당 메소드에도 붙여야함
//	추상 메소드가 없더라도 붙일 수 있음 - 객체화를 하지 않겠다는 뜻 부모역할만 함(상속만 받음)
	public abstract void play() ;
//	추상메소드 - 선언만 하고 구연은 하지 않는 메소드
//	강제 오버라이딩을 요구하여 상속받은 클래스는 반드시 해줘야함
	public void stop() {
		System.out.println("재생을 멈췄다.");
	}
}
//	해당 메소드가 기본소양이라고 생각할 때 추상메소드를 사용하면 자식클래스에서 오버라이딩을 만들게 하여 구체적인 해당사항을 할당 시킬 수 있음
class CDPlayer extends Player {
	@Override
	public void play() {
		System.out.println("CD를 재생합니다.");
	}
}

class DVDPlayer extends Player {
	@Override
	public void play() {
		System.out.println("DVD를 재생합니다.");
	}
	
}