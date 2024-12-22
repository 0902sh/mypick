package com.mega.boardnew.util;

import org.springframework.stereotype.Component;

@Component
public class Color {
	public static final String BLUE = "\033[94m";
	public static final String RED = "\033[91m";
	public static final String GREEN = "\033[92m";
	public static final String MAGENTA = "\033[95m";
	
	public static final String END = "\033[0m";
	
	public static final String BOLD = "\033[1m";
}
