package com.erickisee.quickstart;

import org.apache.geode.cache.client.ClientRegionShortcut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@SpringBootApplication
@ClientCacheApplication(name="AccessingGemFireDataRestApplication")
@EnableEntityDefinedRegions(
  basePackageClasses = Person.class,
  clientRegionShortcut = ClientRegionShortcut.LOCAL
)
@EnableGemfireRepositories
@SuppressWarnings("unused")
public class QuickstartApplication {
  
	
	public static void main(String[] args) {
	SpringApplication.run(QuickstartApplication.class, args);
	}
	
  
}

