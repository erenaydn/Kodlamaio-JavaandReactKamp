
public class CheckRealService implements ICheckRealPersonManager {

	@Override
	public boolean CheckRealPerson(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" ADLI KULLANICI DO�RULANDI ");
		return true;
	}
	

}
