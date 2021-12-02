package homework5Eticaret.core;

import homework5Eticaret.GoogleSystem.LoginManager;
//import homework5Eticaret.YahooSystem.YahooLoginManager;
import homework5Eticaret.entities.concretes.User;

public class LoginManagerAdapter implements LoginService {
	// google d�� servisini adapter sayesinde sisteme ekleyebildik.
	LoginManager googleAuth = new LoginManager();
	// ileride sisteme farkl� bir d�� servis eklenebilir.
	// YahooLoginManager yahooAuth = new YahooLoginManager();

	@Override
	public void logIn(User user) {
		googleAuth.logIn(user.getEmailName(), user.getEmailPassword());

		// yahooAuth.logIn(user.getEmailName(), user.getEmailPassword());

	}

	@Override
	public void signUp(User user) {
		googleAuth.signUp(user.getEmailName(), user.getEmailPassword());
		// yahooAuth.signUp(user.getEmailName(), user.getEmailPassword());
	}

}
