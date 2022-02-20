package first_challenge;

// 요청을 받는 놈 얘는 서비스를 호출해야함
public class Controller {
	Service service = new Service();
	
	// 싱글톤 디자인 패턴
	private static Controller _ctr;
	
	private Controller() {

	}
	
	static {
		_ctr = new Controller();
	}
	
	public static Controller getController() {
		return _ctr;
	}
	
	
	// 일단 사용자 가위바위보 입력 받는 칸트롤러?
	public int getRsp(int playerRsp, int comRsp) {
		// 입력 받은 값으로 서비스 메서드 호출 후 값 반환받기
		return service.judgeService(playerRsp, comRsp);
	}
	
	public int getRestartNo(char re) {
		return service.reService(re);
	}

}
