package com.playboy.core.log;

public class Logger {
	public static void log(String msg) {
		System.out.println(String.format("[PlayerBoy Log] [%s] %s", Thread.currentThread(), msg));
	}
}
