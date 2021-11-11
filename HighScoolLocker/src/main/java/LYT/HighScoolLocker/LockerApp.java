package LYT.HighScoolLocker;

public class LockerApp {
public static void main(String[] args) {
	Locker Mouse = new Locker(28,17,39,3,100,"Mickey Mouse");
	Locker Duck = new Locker(35,16,27, 0, 275,"Donald Duck");
	Mouse.openLocker();
	for (int i=0; i<3; i++) {
		Mouse.putBookInLocker();
	}
	Duck.removeBookFromLocker();
	System.out.println(Mouse.toString());
	System.out.println(Duck.toString());
}
}
