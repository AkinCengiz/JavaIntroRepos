package quiz;

public class Main {

	public static void main(String[] args) {
		int x = 100;
		int y = 0;
		
		Car car1 = null;
		
		try {
			int z = x / y;
			System.out.println(car1.getModel());
		} catch (ArithmeticException e) {
			System.out.println("Tam sayiyi sifira bolme hatasi...");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Null pointer exeption hatasi...");
			e.printStackTrace();
		}finally {
			System.out.println("Finally code bloq...");
		}
		System.out.println("Program calismasi sona geldi....");

	}

}
