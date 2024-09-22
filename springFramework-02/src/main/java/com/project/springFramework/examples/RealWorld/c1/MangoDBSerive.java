package com.project.springFramework.examples.RealWorld.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MangoDBSerive implements DataService {

	/*
	 * @Override public int[] retrieveData() { int var[] = {2,4,5,6,9,8}; return
	 * var; }
	 */
	public int[] retrieveData() {
	return new int[] { 11, 22, 33, 44, 55 };
	}

}
