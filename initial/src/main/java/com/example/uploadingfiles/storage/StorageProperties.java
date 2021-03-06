package com.example.uploadingfiles.storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@ConfigurationProperties("storage")
@Component
public class StorageProperties {

	/**
	 * Folder location for storing files
	 */
	private String location = "C:\\springBoot-soruce\\html";

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
