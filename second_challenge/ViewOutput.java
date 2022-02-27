package second_challenge;

import java.io.IOException;

import Exception.RestartException;
import Exception.RspException;

public class ViewOutput {
	private ViewInput viewInput = new ViewInput();

	private static int WIN_COUNT = 0; // 이긴 횟수
	private static int DRAW_COUNT = 0; // 비긴 횟수
	private static int WIN_LOSE = 0; // 승패 여부 판단 변수
	
	private static final int WIN = 1; // 이김 상수
	private static final int LOSE = 2; // 진 상수
	private static final int DRAW = 3; // 비김 상수
	private static final int END = 0; //끝 상수

	
	public static void main(String[] args) throws NumberFormatException, IOException, RestartException, RspException {
		new ViewOutput().startGame();
	}

	
	// 게임 스타트 메서드
	private void startGame() throws IOException, RestartException, NumberFormatException, RspException {
		Controller controller = new Controller();
	
		
		boolean flex = true; // 게임 지속 여부 판단 논리 변수 값 선언
		
		while (flex) {
			ModelComputer modelComputer = new ModelComputer();
			messageOut("===============================");
			messageOut("가위바위보 게임 시작");
			messageOut("===============================");

			messageOut("1, 2, 3 중에 숫자를 입력하세요 :");
			int playerRsp = viewInput.inputRsp();
			int comRsp = modelComputer.getComRsp();
			
			// 승패 결과 정수형 변수
			WIN_LOSE = controller.getRsp(playerRsp,comRsp);

			// 이긴 횟수
			WIN_COUNT = controller.getWinCount();

			// 비긴 횟수
			DRAW_COUNT = controller.getDrawCount();
			
			if(resultOut(WIN_LOSE)==false) {
				messageOut(toString());
				if(controller.getRestartNo(viewInput.inputRestart()) == END) {
					messageOut("게임을 종료합니다.");
					flex = false; // false 로 바꾸면서 게임 종료
				}
			}
			
//			// 게임 종료 여부 결정 => 졌을 때! 얘는 불린값을 받아와야 함.
//			flex = gameRestart(controller.getRestartNo(viewInput.inputRestart()));
		}
		
	}

	// 재시작 확인 메서드 => 불린 값 반환
	public boolean gameRestart(int reGame) {
		boolean flex = true;
		// 결과 변수 가지고 검증
		if (resultOut(WIN_LOSE) == false) { // 졌다면
			if (reGame== END) {
				messageOut("게임을 종료합니다.");
			}
		}
		return flex;
	}
	
	// 승패 검증 메서드
	private boolean resultOut(int winLose) {
		boolean flag = true;
		if (winLose == WIN) { // 이겼을 시
			winResult();
		} else if (winLose == LOSE) { // 졌을 시
			loseResult();
			flag = false;
		} else if (winLose == DRAW) { // 비겼을 시
			drawResult();
		}
		return flag;
	}
	
	// 게임 결과 Win 시 true 반환 메서드
	public void winResult() {
		messageOut("님이 이겼습니다");
	}

	// 게임 결과 Lose 시 false 반환 메서드
	public void loseResult() {
		messageOut("컴퓨터가 이겼습니다.");
	}

	public void drawResult() {
		messageOut("비겼습니다.");
	}

	// Sysout 중복 방지 메서드
	public void messageOut(String message) {
		System.out.println(message);
	}

	// 결과 출력 오버라이드
	@Override
	public String toString() {
		return "당신은 " + WIN_COUNT + " 번 이겼고, " + DRAW_COUNT + " 번 비겼습니다.";
	}
}
