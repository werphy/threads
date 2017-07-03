
public class FirstThread extends Thread {	
	public static void main(String[] args) {
		
		Thread first =new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){			
		        System.out.println("这是线程:"+Thread.currentThread().getName());
				}
			}
		},"线程1");
		first.start();
	}
	
	
}
