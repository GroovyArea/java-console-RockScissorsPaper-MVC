package Controller;

import Enum.PrintGameResult;
import Enum.Result;
import Enum.Rsp;
import Exception.RspException;
import Model.Player;
import Model.WinDrawCount;
import View.ViewOutput;

// 요청을 받는 Controller
public class Controller {

	// 게임 결과를 가지고 있는 필드
	private Result result;

	// play 메서드
	public void playRsp(Rsp playerRsp) throws RspException {

		// 사용자 객체 생성
		final Player player = new Player(playerRsp);
		
		// 게임결과 반환값을 필드에 저장
		this.result = player.play();
		
		// 가위바위보 상태 값 출력
		ViewOutput.whatYouInput(player.getRsp(), player.getComputer().getComRsp());
		
		gameCount(); 
		resultChange(); 
	}

	// 승리 무승부 카운트 변환 메서드
	public void gameCount() {
		Result.gameCount(result);
	}

	// viewOutput 결과 바꿔주고 출력하는 메서드
	public void resultChange() {
		PrintGameResult.resultOut(result);
	}

	// 게임 결과 반환 메서드
	public Result gameResult() {
		return result;
	}
}
