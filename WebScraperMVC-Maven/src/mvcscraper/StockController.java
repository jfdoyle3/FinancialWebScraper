package mvcscraper;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import entity.Stock;

@Controller
@RequestMapping("/stock")
public class StockController {

	@RequestMapping("/history")
	public String history(Model stockModel) {

		List<Stock> stockList = entity.QueryDB.GetAllStocks();

		stockModel.addAttribute("stock", stockList);

		return "scraperhistory";
	}


}
