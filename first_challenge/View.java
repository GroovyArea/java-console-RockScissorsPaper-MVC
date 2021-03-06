package first_challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Exception.RestartException;
import Exception.RspException;

public class View {
	private static int WIN_COUNT = 0; // 이긴 횟수
	private static int DRAW_COUNT = 0; // 비긴 횟수
	private static int WIN_LOSE = 0; // 승패 여부 판단 변수

	private static final int WIN = 1; // 이김 상수
	private static final int LOSE = 2; // 진 상수
	private static final int DRAW = 3; // 비김 상수
	private static final int END = 0; // 게임 종료 상수

	// 입력 받는 객체 스트림 객체 생성
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// 메인 메서드
	public static void main(String[] args) throws NumberFormatException, IOException, RspException, RestartException {
		new View().startGame();
	}

	// 게임 시작 메서드
	public void startGame() throws NumberFormatException, IOException, RspException, RestartException {
		Controller controller = new Controller();

		boolean flex = true; // 게임 지속 여부 판단 논리 변수 값 선언

		while (flex) {

			messageOut("===============================");
			messageOut("가위바위보 게임 시작");
			messageOut("===============================");

			// 승패 결과 정수형 변수
			WIN_LOSE = controller.getRsp(inputRsp());

			// 이긴 횟수
			WIN_COUNT = controller.getWinCount();

			// 비긴 횟수j
			DRAW_COUNT = controller.getDrawCount();
			
			if(resultOut(WIN_LOSE)==false) {
				messageOut(toString());
				if(controller.getRestartNo(inputRestart()) == END) {
					messageOut("게임을 종료합니다.");
					flex = false; // false 로 바꾸면서 게임 종료
				}
			}
			
		}
	}

	public boolean gameRestart(int reGame) {
		boolean flex = true;
		// 결과 변수 가지고 검증
		if (resultOut(WIN_LOSE) == false) { // 졌다면
			messageOut(toString());
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

	// 가위바위보 숫자 입력 메서드
	public int inputRsp() throws NumberFormatException, IOException, RspException {

		messageOut("1, 2, 3 중에 숫자를 입력하세요 :");
		int result = Integer.parseInt(br.readLine());

		if (!(result == 1 || result == 2 || result == 3))
			throw new RspException("잘못된 입력값입니다. 1,2,3의 숫자 중 하나를 입력하세요.");
		return result;

	}

	// 재시작 문자 입력 메서드
	public char inputRestart() throws IOException, RestartException {
		messageOut("재시작 하시겠습니까? (y : n)");
		char re = br.readLine().charAt(0);

		if (!(re == 'y' || re == 'Y' || re == 'n' || re == 'N')) {
			throw new RestartException("잘못된 입력값입니다. y나 n을 입력해주세요.");
		}
		return re;
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
