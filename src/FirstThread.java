
public class FirstThread extends Thread {	
	public static void main(String[] args) {
		
		Thread first =new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){			
		        System.out.println("�����߳�:"+Thread.currentThread().getName());
				}
			}
		},"�߳�1");
		first.start();
	}
	
	
}
