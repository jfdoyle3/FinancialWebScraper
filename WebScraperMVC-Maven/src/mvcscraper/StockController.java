package mvcscraper;

import java.util.List;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import entity.Stock;

@Controller
@RequestMapping("/stock")
public class StockController {


	@RequestMapping("/showForm")
	public String showForm(Model stockModel) {

		List<Stock> eStock = entity.QueryDB.GetAllStocks();
		Stock singleStock = eStock.get(1);
		String symbol=singleStock.getSymbol();
		
		System.out.println("/showForm");
		System.out.println("Stock Object: " + singleStock);
		System.out.println("Stock Symbol: " + singleStock.getSymbol());
		System.out.println("------------------");
		
		stockModel.addAttribute("Stock", singleStock);
		System.out.println("SM: "+stockModel.toString());
		return "statictable";
	}
	
	@RequestMapping("/processStocks")
	public String processStocks( @ModelAttribute("Stock") Stock eStock) {

		System.out.println("/processStocks");
		System.out.println("Stock: " + eStock);
		System.out.println("---------------");
		return "web-console";
	}

}
