package kodlamaioHomework2;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product("Java ile React ", " Java ve react �zerine harika bir kurs. ", "Engin Demiro�","1500","1200");
		
		Product product2 = new Product();
		product2.setCourseName("2 2 Java ile React ");
		product2.setCourseInstructor("Engin demiro�");
		product2.setCoursePrice("15000");
		product2.setCourseDiscountedPrice("10000");
		product2.setCourseDetail("JAVA �ZER�NE ");
		
		ProductServiceManager manager = new ProductServiceManager();
		// �r�n ekleme ��karma silme 
		manager.add(product1);
		manager.add(product2);
		
		manager.delete(product2);
		manager.delete(product1);
		
		manager.update(product1);
		manager.update(product2);
		// t�m �r�nleri g�rme 
		Product[] products = new Product[] {product1,product2};
		
		manager.getAll(products);
	}

}
