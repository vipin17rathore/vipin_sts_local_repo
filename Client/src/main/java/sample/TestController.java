package sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@GetMapping("/getEmployeeCliet")
	public Object getData() {
		final String uri = "http://localhost:9090/employees";

		RestTemplate restTemplate = new RestTemplate();
		Object result = restTemplate.getForObject(uri, Object.class);

		System.out.println("DATA"+result.toString());
		return result;
	}

}
