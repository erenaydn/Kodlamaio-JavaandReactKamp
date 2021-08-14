

public class Main {

	public static void main(String[] args) {
		
		
		// for Starbucks customer
		
		BaseCustomerManager customermanager = new StarbucksCustomerManager(new MernisService());
		
		customermanager.save(new Customer(3,"Eren","Ayd�n",1996,"1010102020"));
		
		// for Nero customer
		BaseCustomerManager customermanager2= new NeroCustomerManager();
		
		customermanager2.save(new Customer(2,"Eren2","Ayd�n",1995,"2020201010"));
		
		
	}

}
