package pack;

public class Semaphore extends Thread{
	int size;

	//semaphore
	public Semaphore(int size){
		this.size = size;
	}
	
	public int release(){
		//notifyAll(); - problem implementing this rn
		return size++;
	}
	//wait and notify for acquire and release
	public int acquire() throws InterruptedException{
		while (size == 0){
			wait();
		}
		//notifyAll(); - ^generates an error
		return size--;
	}
}
