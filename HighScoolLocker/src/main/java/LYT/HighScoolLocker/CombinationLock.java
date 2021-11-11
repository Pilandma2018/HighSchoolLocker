package LYT.HighScoolLocker;

public class CombinationLock {
	private int number1;
	private int number2;
	private int number3;
	private int dial = 0;

	public CombinationLock(int number1, int number2, int number3) {
		
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
		
	}

	public int turnRight(int Ticks) {
		if (dial + Ticks > 39) {
			dial = dial + Ticks - 40;
		}
		else {
				dial = dial + Ticks;
		}
		return dial;
	}
	public int turnLeft(int Ticks) {
		if (dial > Ticks) {
			dial = dial - Ticks;
		}
		else {
				dial = dial + 40 - Ticks;
		}
		return dial;
	}
	public boolean openLock(int num1, int num2, int num3) {
		if ((number1 == num1) && (number2 == num2) && (number3 == num3)) {
			return true;
		}
		else
			return false;
	}
public int getDial() {
	return dial;
}
public void setDial( int dial) {
	this.dial = dial;
}

public void setNumber1(int number1) {
	this.number1 = number1;
}
public void setNumber2(int number2) {
	this.number2 = number2;
}
public void setNumber3(int number3) {
	this.number3 = number3;
}

}