
public class OfferServiceManager implements IOfferServiceManager {

	@Override
	public void add(Offer offer) {
		System.out.println(offer.getOfferName()+ " adl� kampanya  eklendi.");
		
	}

	@Override
	public void update(Offer offer) {
		System.out.println(offer.getOfferName()+ " adl� kampanya  g�ncellendi.");
		
	}

	@Override
	public void delete(Offer offer) {
		System.out.println(offer.getOfferName()+ " adl� kampanya  silindi.");
		
	}

}
