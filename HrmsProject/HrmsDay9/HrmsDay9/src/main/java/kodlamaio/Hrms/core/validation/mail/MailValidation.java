package kodlamaio.Hrms.core.validation.mail;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.results.Result;

@Service
public class MailValidation implements MailValidationService{

	@Override
	public Result validate(String email) {
		return new Result(true, email + ": Mail dogrulandi");
	}

	@Override
	public boolean checkEmailDomain(String webAddress, String email) {
		return webAddress.contains(email.split("@")[1]);
	}
	


}
