package org.tests.showip;

import java.io.IOException;
import java.net.InetAddress;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;

@RestController
public class HelloController {

	private static final Lorem lorem = LoremIpsum.getInstance();
	private static final String name = lorem.getFirstName();

	@RequestMapping("/")
	public String index() throws IOException {
		String ip = InetAddress.getLocalHost().getHostAddress();
		return "My my address is " + ip + " and name is " + name;
	}

}
