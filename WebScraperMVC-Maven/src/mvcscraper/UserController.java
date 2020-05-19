package mvcscraper;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
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

	@RequestMapping("/showForm")
	public String showForm (Model userModel) {

		userModel.addAttribute("user", new User());

		return "userlogin";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("user") User user, BindingResult userBindingResult) {

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
