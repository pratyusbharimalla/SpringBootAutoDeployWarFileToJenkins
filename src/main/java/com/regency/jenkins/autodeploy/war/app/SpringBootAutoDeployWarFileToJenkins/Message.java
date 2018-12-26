/**
 * 
 * @License Regency Softwares
 *
 * @File Message.java
 *
 * @Author Pratyus
 *
 * @Date 26-Dec-2018
 *
 * @Description
 *
 */
package com.regency.jenkins.autodeploy.war.app.SpringBootAutoDeployWarFileToJenkins;

/**
 * 
 */
public class Message {
	
	private final long id;
	private final String msg;

	public Message(long id, String msg) {
		this.id = id;
		this.msg = msg;
	}

	public long getId() {
		return id;
	}

	public String getMsg() {
		return msg;
	}
}
