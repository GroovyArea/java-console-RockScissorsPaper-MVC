package second_challenge;

// 요청을 받는 놈 얘는 서비스를 호출해야함
public class Controller {
	Service service = new Service();
	
	// 일단 사용자 가위바위보 입력 받는 콘트롤러
	public int getRsp(int playerRsp, int comRsp) {
		// 입력 받은 값으로 서비스 메서드 호출 후 값 반환받기
		return service.judgeService(playerRsp, comRsp);
	}
	
	// 재시작 요청
	public int getRestartNo(char re) {
		return service.reService(re);
	}

	public int getWinCount() {
		return service.getWinCoount();
	}

	public int getDrawCount() {
		return service.getDrawCount();
	}

}
