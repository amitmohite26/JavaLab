import com.cg.Container;

public class Entry3 {

	public static void main(String[] args) {
		
		Container containerRef = new Container();
		
		Thread producerThread = new Producer(containerRef);
		producerThread.setName("Producer Thread");
		
		producerThread.start();

		Thread consumerThread = new Consumer(containerRef);
		
		consumerThread.setName("Consumer Thread");
		consumerThread.start();
		
		
		System.out.println("end of main()....");
	}
	
}

class Producer extends Thread{

	private Container containerRef;
	
	public Producer(Container containerRef) {
		this.containerRef = containerRef;
	}

	public void run() /*throws InterruptedException*/{

		while(true){
			try {
				containerRef.put("test message");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
/*		try {
			while(true){
				containerRef.put("test message");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/		
	}
	
}

class Consumer extends Thread{

	private Container containerRef;
	
	public Consumer(Container containerRef) {
		this.containerRef = containerRef;
	}

	public void run() /*throws InterruptedException*/{

		while(true){
			try {
				containerRef.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
/*		try {
			while(true){
				containerRef.put("test message");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/		
	}
	
}
