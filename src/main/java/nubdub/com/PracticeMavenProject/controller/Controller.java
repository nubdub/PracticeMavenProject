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
		String greetings = "Greetings from Spring Boot!";
		StringBuilder sb = new StringBuilder("<br> <a href=\"");
		createDateLink(sb);
		return greetings + sb.toString();
	}

	public void createDateLink(StringBuilder sb) {
		sb.append("http://localhost:8080/currentDate\">")
			.append("Click here for current date!")
			.append("</a>");
	}
	
	@RequestMapping("/currentDate")
	public String dispCurrentTime() {
		DateTime dt = new DateTime();
		return "The current date is " + dt.getMonthOfYear() + 
				"/" + dt.getDayOfMonth() + 
				"/" + dt.getYear() + ".";
	}
	
}
