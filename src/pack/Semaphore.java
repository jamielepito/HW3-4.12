package pack;

public class Semaphore extends Thread{
	int size;

	//semaphore
	public Semaphore(int size){
		this.size = size;
	}
	
	public int release(){
		notifyAll();
		return size++;
	}
	//wait anf notify for aquire aand release
	public int acquire() throws InterruptedException{
		while (size == 0){
			wait();
		}
		notifyAll();
		return size--;
	}
}
