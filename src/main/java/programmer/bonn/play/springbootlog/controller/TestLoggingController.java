package programmer.bonn.play.springbootlog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestLoggingController {

	@GetMapping("/")
	public String sayHello() {

		log.trace("print in TRACE scope");
		log.debug("print in DEBUG scope");
		log.info("print in INFO scope");
		log.warn("print in WARN scope");
		log.error("print in ERROR scope");

		return "Hello";
	}

}
