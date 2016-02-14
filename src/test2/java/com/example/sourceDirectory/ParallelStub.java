package com.example.sourceDirectory;

import java.lang.management.ManagementFactory;

final class ParallelStub {

	static final String PID;

	static {
		int pid = Integer.parseInt(ManagementFactory.getRuntimeMXBean().getName().split("@")[0]);
		PID = String.format("%05d", pid);
	}

	private static final long millis = 2000;

	static void println(String string) {
		String name = Thread.currentThread().getName();
		System.out.println("[" + PID + "]{" + name + "}[" + time() + "] " + string);
	}

	static void test(String testName) {
		println("begin " + testName);
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		println("end   " + testName);
	}

	static long time() {
		return System.currentTimeMillis() - 1455442736319L - 1076968L - 1097274L;
	}

}
