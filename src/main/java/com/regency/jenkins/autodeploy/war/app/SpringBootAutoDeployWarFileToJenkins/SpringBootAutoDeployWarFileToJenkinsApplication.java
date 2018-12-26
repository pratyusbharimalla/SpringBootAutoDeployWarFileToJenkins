package com.regency.jenkins.autodeploy.war.app.SpringBootAutoDeployWarFileToJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootAutoDeployWarFileToJenkinsApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutoDeployWarFileToJenkinsApplication.class, args);
		System.out.println("Spring Auto Web Application...");
	}
	
	/* (non-Javadoc)
	 * @see org.springframework.boot.web.servlet.support.SpringBootServletInitializer#configure(org.springframework.boot.builder.SpringApplicationBuilder)
	 */
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		return builder.sources(SpringBootAutoDeployWarFileToJenkinsApplication.class);
	}

}

