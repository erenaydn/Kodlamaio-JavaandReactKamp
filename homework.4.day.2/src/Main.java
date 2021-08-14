import java.rmi.RemoteException;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {

		SaleManager sales = new SaleManager();

		Gamer gamer1 = new Gamer("Eren", "Ayd�n", "1234", LocalDate.of(1996, 06, 15));

		Game game1 = new Game("Pubg", "FPS", 1500);

		Offer offer1 = new Offer(123, "YIL BA�I ", 20);
		
		

		// Mernis do�rulama
		MernisServiceAdapter manager = new MernisServiceAdapter();
		manager.CheckRealPerson(gamer1);
		// sistem check return true d�nen

		CheckRealService manager1 = new CheckRealService();
		manager1.CheckRealPerson(gamer1);

		// oyun kay�t, silme, update
		GameServiceManager gamemanager = new GameServiceManager();
		gamemanager.add(game1);
		gamemanager.delete(game1);
		gamemanager.update(game1);
		// User kay�t, silme, update

		GamerServiceManager gamermanager = new GamerServiceManager();
		gamermanager.add(gamer1);
		gamermanager.delete(gamer1);
		gamermanager.update(gamer1);

		// kampanya kay�t, silme, update

		OfferServiceManager offermanager = new OfferServiceManager();
		offermanager.add(offer1);
		offermanager.delete(offer1);
		offermanager.update(offer1);
		
		// Sat�� i�lemi 
		sales.sellGame(gamer1, game1, offer1);

	}

}
