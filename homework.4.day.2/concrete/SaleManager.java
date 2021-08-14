
public class SaleManager implements SaleService {

	@Override
	public void sellGame(Gamer gamer, Game game, Offer offer) {
		
		double discountedPrice = game.getGamePrice()*(offer.getDiscountRate()/100);
		
		System.out.println(gamer.getFirstName()+" adl� kullan�c� "+ game.getGameName()+" adl� oyunu "+
		offer.getDiscountRate()+" indirim oran� ile "+discountedPrice+ " fiyat�ndan sat�n alm��t�r.");
		
	}
	
	
	
	

}
