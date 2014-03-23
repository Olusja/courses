package homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecut {
	public static void main(String[] args) {
		Task task = new Task();
		Task1 task1 = new Task1();
//		ExecutorService executor = Executors.newFixedThreadPool(6);
//		executor.execute(task);
//		executor.execute(task1);
		Thread thread = new Thread(task);
		Thread thread1 = new Thread(task1);
		
		thread.start();
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		thread.yield();
		thread1.start();
	}
		

}
