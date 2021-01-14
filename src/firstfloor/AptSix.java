package firstfloor;

public class AptSix {

	public static void main(String[] args) {
		String laptop = "MacBook Pro";
		System.out.println(laptop);
		kitchen();
		livingRoom();

	}

	public static void kitchen() {
		int dinningTable = 1;
		int dinningChairs = 6;
		int dinningSet = (dinningTable + dinningChairs);

		System.out.println(dinningSet + " Picees Dinning set in my kitchen");

	}

	public static void livingRoom() {
		String tv = "LG";
		System.out.println(tv);

	}

}
