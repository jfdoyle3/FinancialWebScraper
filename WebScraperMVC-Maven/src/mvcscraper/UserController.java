package mvcscraper;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ConsoleScraper.Login;

@Controller
@RequestMapping("/user")
public class UserController {

	@InitBinder 
	public void initEmailBinder(WebDataBinder emailDataBinder) {

		StringTrimmerEditor trimEmail = new StringTrimmerEditor(true);
		emailDataBinder.registerCustomEditor(String.class, trimEmail);

	}

	@InitBinder 
	public void initPasswordBinder(WebDataBinder passwordDataBinder) {

		StringTrimmerEditor trimPassword = new StringTrimmerEditor(true);
		passwordDataBinder.registerCustomEditor(String.class, trimPassword);

	}

	@RequestMapping("/login")
	public String login (Model userModel) {

		userModel.addAttribute("user", new User());

		return "userlogin";
	}

	@RequestMapping("/loggingIn")
	public String loggingIn(@Valid @ModelAttribute("user") User user, BindingResult userBindingResult) throws InterruptedException, IOException {

		System.out.println("User email: |" + user.getEmail() + "|");
		System.out.println("User password: |" + user.getPassword() + "|");
		System.out.println("\n\n\nBinding result: " + userBindingResult + "|");

		if (userBindingResult.hasErrors()) {
			return "userlogin";
		} else {
			
			return "statictable";
		}
	}
}
