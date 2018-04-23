class MyThread extends Thread{
	public void run() {

		System.out.println("inside new Thread");
		
		new EvenThread().start();
		new OddThread().start();
		
	}
	
}

class EvenThread extends Thread{
	
	public void run() {

		try {
			for(int i=0;;i+=2){
					Thread.sleep(300);
					System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
}

class OddThread extends Thread{
	
	public void run() {

		try {
			for(int i=1;;i+=2){
					Thread.sleep(900);
					System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}




public class Entry {
	public static void main(String[] args) {

		Thread t1 = new MyThread();
		t1.start();
		
		System.out.println("inside main()");
		
		
		
		
	}
}
