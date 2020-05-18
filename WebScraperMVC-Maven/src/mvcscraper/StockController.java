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
	public String showForm (Model stockModel) {
		
		 List<Stock> eStock=entity.QueryDB.GetAllStocks();
		 Stock singleStock=eStock.get(0);
		 
		 System.out.println(singleStock);
		 
		stockModel.addAttribute("stock", singleStock);
		
		
		return "statictable";
	}
	@RequestMapping("/processStocks")
	public String processStocks(@ModelAttribute("stock") Stock stock) {

		// log the input data
		System.out.println("Stock: " + stock.getSymbol());

		return "web-console";
	}

}
