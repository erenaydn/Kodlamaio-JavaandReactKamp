package kodlamaioHomework2;

public class ProductServiceManager  {

	public void add(Product product) {

		System.out.println(product.getCourseName() + " adl� kurs eklendi. ");
		System.out.println("-----");
	}

	public void delete(Product product) {

		System.out.println(product.getCourseName() + " adl� kurs silindi. ");
		System.out.println("-----");
	}

	public void update(Product product) {

		System.out.println(product.getCourseName() + " adl� kurs g�ncellendi. ");
		System.out.println("-----");
	}
	public void getAll(Product[] products) {
		
		for(Product product: products) {
			
			System.out.println("Kurs ad� : "+product.getCourseName());
			System.out.println("Kurs hocas� : "+product.getCourseInstructor());
			System.out.println("Kurs indirimli fiyat� : "+product.getCourseDiscountedPrice());
			System.out.println("----- ");
		}
	}
}
