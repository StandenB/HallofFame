package co.grandcircus.FamousLab;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.FamousLab.entity.AllData;

@Controller
public class FamousController {

	@RequestMapping("/")
	public ModelAndView showTiny() {
		ModelAndView mav = new ModelAndView("index");
		
		// Create a rest template
		RestTemplate restTemplate = new RestTemplate();
		
		// Set url
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		
		// Make the Request.
		AllData response = restTemplate.getForObject(url, AllData.class);
		
		// Extract body from response.
		// AllData result = response.getBody();
		// System.out.println(result);
		
		mav.addObject("tiny", response.getTiny()); 
		return mav;
	}
	
	@RequestMapping("/complete")
	public ModelAndView showComplete() {
		ModelAndView mav = new ModelAndView("complete");
		
		// Create a rest template
		RestTemplate restTemplate = new RestTemplate();

		// Set url
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		
		// Make the Request.
		AllData response = restTemplate.getForObject(url, AllData.class);
		System.out.println(response.getComplete());
		// Extract body from response.
		//AllData result = response.getBody();
		//System.out.println(result);
		mav.addObject("complete", response.getComplete()); 
		return mav;
	}
}
