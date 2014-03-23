package homework;

public class Task1 implements Runnable{

	@Override
	public void run() {
		synchronized (this){
			for (int i = 0; i < 500; i++){
				System.out.println("Yes!");
				if (i == 10){
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
