package second_challenge;

// Model 메서드 호출해주고 컨트롤러로 값 반환하는 메서드 만들기
public class Service {
	private ModelGame model = new ModelGame();
	
	// 승패 판단하는 모델 메서드 호출하는 넘.
	public int judgeService(int playerRsp, int comRsp) {
		return model.judgeRsp(playerRsp, comRsp);

	}

	// 재시작 여부 판단하는 모델 메서드 호출하는 넘.
	public int reService(char re) {
		return model.judgeRestart(re);
	}

	public int getWinCoount() {
		return model.getWinCount();
	}

	public int getDrawCount() {
		return model.getDrawCount();
	}

}
