/**
 * 
 */
package nubdub.com.PracticeMavenProject.controller;

import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nabdeep Shrestha
 *
 */
@RestController
public class Controller {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@RequestMapping("/currentTime")
	public String dispCurrentTime() {
		DateTime dt = new DateTime();
		return "The current year is " + dt.getYear() + ".";
	}
	
}
