package first_challenge;

// 요청을 처리하는 클래스 Model
// 가위바위보 승패 판단 후 반환하는 메서드
// 재시작 판단 후 반환하는 메서드
public class Model {
	private static final int RESTART = 1; // 재시작 상수
	private static final int END = 0; // 게임 종료 상수
	private static final int WIN = 1; // 이김 상수
	private static final int LOSE = 2; // 진 상수
	private static final int DRAW = 3; // 비김 상수
	
	private int judgeResult = 0; // 승패 여부 판단 변수.
	private int win = 0; // 이긴 횟수
	private int draw = 0; // 비긴 횟수

	
	// 승패 결과 반환 메서드
	public int judgeRsp(int playerRsp) {
		int comRsp = (int)(Math.random() * 3) + 1;
		return judgeProcess(comRsp, playerRsp); // 숫자 변수 반환해주깅
	}

	// 승패 확인 메서드
	public int judgeProcess(int comRsp, int playerRsp) {
		if ((comRsp == 3 && playerRsp == 1) || (comRsp == 1 && playerRsp == 2) || (comRsp == 2 && playerRsp == 3)) {
			judgeResult = WIN; // 이김
			win++;
		} else if (playerRsp == comRsp) {
			judgeResult = DRAW; // 비김
			draw++;
		} else {
			judgeResult = LOSE; // 짐
		}
		return judgeResult;
	}
	
	// 승수 반환
	public int getWinCount() {
		return win;
	}
	
	// 비김 수 반환
	public int getDrawCount() {
		return draw;
	}
	
	// 재시작 여부 판단하는 메서드
	public int judgeRestart(char re) {
		// Y를 입력 받았을 경우
		if (re == 'y' || re == 'Y') {
			return RESTART;
		}
		return END;
	}

}
