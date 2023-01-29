package Introduction;

public class Counter implements Runnable {
	
	private String name;
	private int time;

	/**
	 * @param name
	 */
	public Counter(String name, int time) {
		super();
		this.name = name;
		this.time = time;
	}

	@Override
	public void run() {
		for(int i = 0; i<= 10; i++)
		{
			try {
				Thread.sleep(this.time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + " Thread : " + i);
		}
		
	}

}
