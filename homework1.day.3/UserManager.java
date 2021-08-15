package kodluyoruzioHomework3;

public class UserManager {
	
	public void addUser(User user) {
		
		System.out.println(user.getUserid()+" idsine sahip ��renci "+user.getFirstName()+" Ad� ile eklendi");
	}
	public void addMultipleUsers(User[] users) {
		
		for(User user:users) {
			addUser(user);
			System.out.println(user.getFirstName()+" adl� kullan�c� "+user.getUserid()+" id ile eklendi.");
		}
	}

}
