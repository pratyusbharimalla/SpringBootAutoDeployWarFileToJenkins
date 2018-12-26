/**
 * 
 * @License Regency Softwares
 *
 * @File HomeResource.java
 *
 * @Author Pratyus
 *
 * @Date 26-Dec-2018
 *
 * @Description
 *
 */
package com.regency.jenkins.autodeploy.war.app.SpringBootAutoDeployWarFileToJenkins;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */

@RestController
public class HomeResource {
	private static final String template = "Spring, %s.";
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping("/home")
    public Message greeting(@RequestParam(value="message", defaultValue="Web Application") String message) {
        return new Message(counter.incrementAndGet(),
                            String.format(template, message));
    }
}

