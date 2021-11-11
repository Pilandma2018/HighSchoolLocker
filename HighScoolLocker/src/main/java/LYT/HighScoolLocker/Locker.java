package LYT.HighScoolLocker;

import java.util.ArrayList;
import java.util.Scanner; 

public class Locker {
	private String name;
private int lockerNumber;
 private int book;
 private int number1;
 private int number2;
 private int number3;
Scanner sc = new Scanner(System.in);

 public Locker(int number1, int number2, int number3, int book, int lockerNumber, String name) {
	 this.name = name;
	 this.book = book;
	 this.lockerNumber = lockerNumber;
	 this.number1 = number1;
	 this.number2 = number2;
	 this.number3 = number3;
 }
 CombinationLock combolock = new CombinationLock(number1,number2,number3);

 public void putBookInLocker() {
	book++;
	}
public boolean removeBookFromLocker() {
	if (book >=1) {
		book--;
		return true;
	}
	else {
		return false;
	}
}

public void openLocker() {
	System.out.println("Enter the combination code:");
	int lock1 = sc.nextInt();
	int lock2 = sc.nextInt();
	int lock3 = sc.nextInt();
	if (combolock.openLock(lock1, lock2, lock3)) {
		System.out.println("The locker is unlocked.");
	} else {
		System.out.println("You failed to unlock the locker.");
	}
}

public String getname() {
	return name;
}
public int getbook() {
	return book;
}
public int getlockerNumber() {
	return lockerNumber;
}
public void setname(String name) {
	this.name = name;
}
public void setbook(int book) {
	this.book = book;
}
public void setlockerNumber(int lockNumber) {
	this.lockerNumber = lockNumber;
}
public void setnumber1(int number1) {
	this.number1 = number1;
}
public void setnumber2( int number2) {
	this.number2 = number2;
}
public void setnumber3(int number3) {
	this.number3 = number3;
}

public String toString() {
	return "Locker [Locker number = " + lockerNumber  
			+ ", Name = " + name + " Amount of books = " + book  
			+ ", Combo 1 = " + number1 + ", Combo 2 = " + number2
			+ ", Combo 3 = " + number3  
			+ "]";
}
public static void main(String[] args) {

}
}
