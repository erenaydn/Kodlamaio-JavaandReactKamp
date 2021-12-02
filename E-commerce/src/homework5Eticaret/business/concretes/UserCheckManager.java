package homework5Eticaret.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import homework5Eticaret.business.abstracts.UserCheckService;
import homework5Eticaret.entities.concretes.User;

public class UserCheckManager implements UserCheckService {
	List<String> listOfMail = new ArrayList<String>();

	@Override
	public boolean validateEmail(User user) {

		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		if (pattern.matcher(user.getEmailName()).find() == false) {
			System.out.println(" Emailiniz regex kurallar�na uygun de�ildir. ");
			return false;
		}

		return true;
	}

	// email ve �ifre i�lemleri okeyse kullan�c� onay� geliyor.
	@Override
	public boolean validateUser(User user) {
		if (validateEmail(user) && checkNameandPassword(user) == true) {

			return true;
		}
		return false;
	}

	// �ifre ve isim soyisim kontrol�.
	@Override
	public boolean checkNameandPassword(User user) {
		if (user.getFirstName().length() >= 2 && user.getLastName().length() >= 2
				&& user.getEmailPassword().length() >= 6) {
			return true;
		}
		System.out.println("Ad ve soyad en az 2 kelimeden ve Sifreniz en az 6 karakter olmal�");

		return false;
	}

}
