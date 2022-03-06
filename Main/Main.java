package Main;

import Controller.Controller;
import Enum.Result;
import Exception.RspException;
import View.ViewInput;
import View.ViewOutput;

public class Main {

	// 계속 플레이 정적 변수
	private static boolean play = true;
	
	public static void main(String[] args) throws RspException {

		// Controller 객체 생성
		Controller controller = new Controller();

		while (play) {
			// 콤퓨타 가위바위보
			int comRsp = (int)(Math.random() * 3) + 1;  
			
			// 게임 시작 출력 메서드 호출
			ViewOutput.startGame();
			
			System.out.println();
			
			// 컨트롤러에게 가위바위보 판정 요청
			if(controller.playRsp(ViewInput.inputRsp(), comRsp) == Result.LOSE.getGameResult()){
				gameEnd();
			}
			
			System.out.println();
		}
	}
	
	public static void gameEnd() {
		ViewOutput.endtitle();
		ViewOutput.gameResult();
		play = false;
	}
}
