package net.youssfi.configservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoverControll {

	@Value("${eureka.client.service-url.defaultZone}")
	private String url;

	@GetMapping("/discover")
	public String discover(){
		return url;
	}
}
