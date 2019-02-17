package benchmark.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {
	/**
	 * Load an HTML file for the "/" mapping
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String homepageLoader() {
		return "homepage.html";
	}
}
