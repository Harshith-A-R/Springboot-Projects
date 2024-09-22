package com.project.springFramework.examples.RealWorld.c1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BuisnessServiceCalculation {
	DataService dataService;

	@Autowired
	public BuisnessServiceCalculation(@Qualifier("MysqlService") DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);

	}
}
