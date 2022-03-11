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

	private Result result;

	public void playRsp(Rsp playerRsp) throws RspException {

		final Player player = new Player(playerRsp);
		this.result = player.play();

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
