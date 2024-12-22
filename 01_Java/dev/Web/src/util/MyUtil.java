package util;

import java.util.Random;

public class MyUtil {
	
	/* Color */
	public static final String BLACK   = "\033[90m";  // final은 수정이 불가능하다는 뜻
	public static final String RED     = "\033[91m";
	public static final String GREEN   = "\033[92m";
	public static final String YELLOW  = "\033[93m";
	public static final String BLUE    = "\033[94m";
	public static final String MAGENTA = "\033[95m";
	public static final String CYAN    = "\033[96m";
	public static final String WHITE   = "\033[97m";
	public static final String END     = "\033[0m";
	
	/* Style */
	public static final String BOLD            = "\033[1m";
	public static final String INTENSITY       = "\033[2m";
	public static final String ITALIC          = "\033[3m";
	public static final String UNDERLINE       = "\033[4m";
	public static final String NEGATIVE        = "\033[7m";
	public static final String CROSSEDOUT      = "\033[9m";
	public static final String DOUBLEUNDERLINE = "\033[21m";
	
	public static void main(String[] args)
	
		{
		
	}
		// TODO Auto-generated method stub
	public static void p(String str) {
		System.out.println(str);
		
	}
	
	public static void cp(String str) {
		Random rd = new Random();
		int color = rd.nextInt(256);  // 0 ~ 255
		System.out.print("\033[38;5;" + color + "m");
		System.out.println("***************");
		System.out.println(str);
		System.out.println("***************");
		System.out.print(END);
	}

}
