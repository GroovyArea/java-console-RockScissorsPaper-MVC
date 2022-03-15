package Controller;

import Enum.PrintGameResult;
import Enum.Result;
import Enum.Rsp;
import Exception.RspException;
import Model.Computer;
import Model.Player;
import Model.WinDrawCount;
import View.ViewOutput;

// 요청을 받는 Controller
public class Controller {

	// 게임 결과를 가지고 있는 필드
	private Result result;

	// play 메서드
	public void playRsp(Rsp playerRsp, Computer computer) throws RspException {

		// 사용자 객체 생성
		final Player player = new Player(playerRsp);
		
		// 게임결과 반환값을 필드에 저장
		this.result = gameOf(player, computer);
		
		// 가위바위보 상태 값 출력
		ViewOutput.whatYouInput(player.getRsp(), computer.getComRsp());
		
		gameCount(); 
		resultChange(); 
	}

	// 승리 무승부 카운트 변환 메서드
	public void gameCount() {
		Result.gameCount(result);
	}

	// viewOutput 결과 바꿔주고 출력하는 메서드
	public void resultChange() {
		if (result == Result.WIN)
			ViewOutput.singleGameResult(PrintGameResult.of(result));
		if (result == Result.DRAW)
			ViewOutput.singleGameResult(PrintGameResult.of(result));
		if (result == Result.LOSE)
			ViewOutput.singleGameResult(PrintGameResult.of(result));
	}

	// 결과 얻어오는 메서드
	public Result gameOf(Player player, Computer computer) throws RspException {
		return Result.getGameResult(player.getRsp(), computer.getComRsp());
	}
	
	// 게임 결과 반환 메서드
	public Result gameResult() {
		return result;
	}
}
