package homework;



public class Task implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 500; i++){
			System.out.println("Ouch!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
