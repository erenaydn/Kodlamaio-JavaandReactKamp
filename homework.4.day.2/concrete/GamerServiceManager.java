
public class GamerServiceManager implements IGamerServiceManager{

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " adl� kullan�c� eklendi.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " adl� kullan�c� g�ncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " adl� kullan�c� silindi.");
	}
	
	
	
	
}
