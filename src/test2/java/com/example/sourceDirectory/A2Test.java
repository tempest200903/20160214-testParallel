package com.example.sourceDirectory;

import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

@RunWith(JUnit5.class)
public class A2Test {

	@Test
	public void test1() {
		ParallelStub.test("A2Test.test1");
	}

	@Test
	public void test2() {
		ParallelStub.test("A2Test.test2");
	}

	@Test
	public void test3() {
		ParallelStub.test("A2Test.test3");
	}

	@Test
	public void test4() {
		ParallelStub.test("A2Test.test4");
	}

}
