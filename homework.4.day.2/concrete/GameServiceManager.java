
public class GameServiceManager implements IGameServiceManager{
	
	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+ " adl� oyun eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+ " adl� oyun S�L�ND�.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+ " adl� oyun G�NCELLEND�.");
		
	}

}
