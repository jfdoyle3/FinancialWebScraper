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
public class LoginController {
	
	// Hibernate Validation allows white spaces as valid entries.
	// Need to add an initbinder to have it trim input strings
	// of all leading & ending white spaces and
	// returns null if white spaces are the only entry.
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor trimEmail=new StringTrimmerEditor(true);
		StringTrimmerEditor trimPassword=new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, trimEmail);
		dataBinder.registerCustomEditor(String.class, trimPassword);
		
	}
	
	@RequestMapping("/loginForm")
	public String showForm(Model theModel) {

		theModel.addAttribute("customer", new Customer());

		return "login";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("login") Customer theCustomer, BindingResult theBindingResult) {

		System.out.println("Last name: |"+ theCustomer.getLastName()+"|");
		System.out.println("\n\n\nBinding result: "+  theBindingResult+"|");
		
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}
	}
}
