package pack;

public class Semaphore {
	int size;

	//semaphore
	public Semaphore(int size){
		this.size = size;
	}
	
	public int release(){
		return size++;
	}
	//wait anf notify for aquire aand release
	public int acquire() throws InterruptedException{
		while (size == 0){
			wait();
		}
		return size--;
	}
}
