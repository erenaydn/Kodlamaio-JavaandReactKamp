package kodlamaioHomework2;

public class ProductServiceManager  {

	public void add(Product product) {

		System.out.println(product.getCourseName() + " adl� kurs eklendi. ");
	}

	public void delete(Product product) {

		System.out.println(product.getCourseName() + " adl� kurs silindi. ");
	}

	public void update(Product product) {

		System.out.println(product.getCourseName() + " adl� kurs g�ncellendi. ");
	}
	public void getAll(Product[] products) {
		
		for(Product product: products) {
			
			System.out.println(product.getCourseName());
			System.out.println(product.getCourseInstructor());
			System.out.println(product.getCourseDiscountedPrice());
		}
	}
}
