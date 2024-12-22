package day05;

import util.MyUtil;

public class SmartPhone extends Phone {
	
	public void installApp() {
		MyUtil.p("Installing App....");
	}
	
	public void webSerfing() {
		MyUtil.p("Web Serfing....");
		
	}

	@Override
	public void sendText(String str) {
		MyUtil.p(str);
		
	}
}
