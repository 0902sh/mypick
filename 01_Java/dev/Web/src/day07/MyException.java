package day07;

public class MyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sendReceipt(10000);
			sendReceipt(400000000);
			
		}
		catch(MyException2 e) {
			e.printStackTrace();
			
			// 예외처리 통계DB에 입력 등 후속 조치 가능
		}
	}
	
	public static void sendReceipt(int amt) throws MyException2 {
		if(amt > 100000000) {
			throw new MyException2("[B001] 과도한 청구금액 넌 백퍼 사기");
		}
		else if(amt < 1000) {
			throw new MyException2("[B002] 금액 " + amt + "원이면 니 돈 주고 먹어");
		}
		
		System.out.println("[SendReceipt()]" + amt + "원 정상 처리 완료");
	}

}

class MyException2 extends Exception {
	MyException2(String msg){
		super(msg);
		System.out.println("[MyException] 경찰서 고발");
		System.out.println("[MyException] 메시지 로그 기록");
		System.out.println("[MyException] 모든 전원 오프");
		System.out.println("[MyException] 전원 계약 해지");
		System.out.println("[MyException] 관련자 모두 무급 출근");
	}
}