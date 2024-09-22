package com.project.springFramework.examples.RealWorld.c1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MysqlService")
public class MysqlService implements DataService{

	/*
	 * @Override public int[] retrieveData() { int var[]= {55,66,22,33}; return var;
	 * }
	 */
	public int[] retrieveData() {
	return new int[] { 1, 2, 3, 4, 5 };
	}
}
