package Main;

import Controller.Controller;
import Enum.Result;
import Exception.RspException;
import Model.Computer;
import Model.ComputerNumber;
import Model.Computer;
import Model.Player;
import View.ViewInput;
import View.ViewOutput;

public class Main {

	public static void main(String[] args) throws RspException {

		// Controller 객체 생성
		Controller controller = new Controller();

		while (true) {

			// 게임 시작 문장 출력 메서드 호출
			ViewOutput.startGame();

			System.out.println();

			// 게임 실행!
			controller.playRsp(ViewInput.inputPlayerRsp(), new Computer(new ComputerNumber().getComputerNumber()));

			System.out.println();

			// 컨트롤러에게 가위바위보 판정 요청 졌을 경우 종료
			if (controller.gameResult() == Result.LOSE) {
				gameEnd();
				break;
			}

		}
	}

	public static void gameEnd() {
		ViewOutput.endtitle(); // 끝 문자열 출력
		ViewOutput.gameResult(); // 게임 결과 출력
	}

}
