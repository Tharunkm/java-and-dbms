package lab_practice;

public class P22_Main {

	public static void main(String[] args) {
		Thread thread1=new P22_GreetingThread("Good Morning",1);
		Thread thread2 = new P22_GreetingThread("Hello",2);
		Thread thread3 = new P22_GreetingThread("Welcome",3);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
