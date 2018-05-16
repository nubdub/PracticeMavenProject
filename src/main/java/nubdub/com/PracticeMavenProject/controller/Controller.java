/**
 * 
 */
package nubdub.com.PracticeMavenProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nubdu
 *
 */
@RestController
public class Controller {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
}
