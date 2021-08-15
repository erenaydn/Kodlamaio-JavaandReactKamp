package homework5Eticaret.business.concretes;

import java.util.ArrayList;
import java.util.List;

import homework5Eticaret.business.abstracts.EmailService;
import homework5Eticaret.entities.concretes.User;

public class EmailManager implements EmailService {

	List<String> verifyEmails = new ArrayList<String>();

	@Override
	public void sendMailwithUser(User user, String mail) {
		System.out.println(user.getEmailName() + " adresine mail gonderilmistir ");
		System.out.println(" --- mail g�nderme");

	}

	@Override
	public void verifyCheckMail(String email) {
		verifyEmails.add(email);

	}

	@Override
	public boolean verificatedMail(String email) {
		verifyEmails.add(email); // sisteme giri� yapt�rmak i�in listeye deneme maili ekledim
		if (verifyEmails.contains(email)) {
			return true;
		}
		return false;
	}

	@Override
	public void sendMail(String mail) {
		System.out.println(" Mail g�nderildi.");

	}

}
