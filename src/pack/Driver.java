package pack;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		BoundedBuffer bufferClass = new BoundedBuffer();
		
		bufferClass.insert("testing");
		System.out.println(bufferClass.occupiedSem.size);
		System.out.println(bufferClass.freeSem.size);
		System.out.println(bufferClass.retrieve());
		
		
		

	}

}
