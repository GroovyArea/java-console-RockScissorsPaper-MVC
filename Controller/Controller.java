package Controller;

import Enum.PrintGameResult;
import Enum.Result;
import Enum.Rsp;
import Exception.RspException;
import Model.Computer;
import Model.ComputerNumber;
import Model.Player;
import Model.WinDrawCount;
import View.ViewOutput;

// 요청을 받는 Controller
public class Controller {

	// 필드 선언
	private Result result;
	private Player player;
	private Computer computer;

	// play 메서드
	public void playRsp(Rsp playerRsp) throws RspException {

		// 참가자 객체 생성
		player = new Player(playerRsp);
		// 컴터 객체 생성 및 번호 주입
		computer = new Computer(new ComputerNumber().getComputerNumber());
		
		// 게임결과 반환값을 필드에 저장
		this.result = gameOf(player, computer);

		rspPrint();
		gameCount();
		changedResultPrint();
	}

	// 승리 무승부 카운트 변환 메서드
	public void gameCount() {
		Result.gameCount(result);
	}
	
	// 가위바위보 상태 값 출력하는 메서드
	public void rspPrint() throws RspException {
		ViewOutput.whatYouInput(player.getRsp(), computer.getComRsp());
	}
	
	// viewOutput 결과 바꿔주고 출력하는 메서드
	public void changedResultPrint() {
		ViewOutput.singleGameResult(PrintGameResult.of(result));
	}
	
	// 결과 얻어오는 메서드
	public Result gameOf(Player player, Computer computer) throws RspException {
		return Result.getGameResult(player.getRsp(), computer.getComRsp());
	}

	// 게임 결과 반환 메서드
	public Result getGameResult() {
		return result;
	}
}
