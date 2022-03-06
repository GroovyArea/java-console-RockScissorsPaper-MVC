package Model;

import Enum.PrintGameResult;
import Enum.Result;
import Enum.Rsp;
import View.ViewOutput;

public class Game {
	
	// 승패 확인 메서드
	public static int judgeProcess(Player player, Computer com) {
		int p = player.getPlayerRsp();
		int c = com.getComRsp();
		
		if ((c == Rsp.PAPER.getRockScissorsPaper() && p == Rsp.ROCK.getRockScissorsPaper()) || 
				(c == Rsp.ROCK.getRockScissorsPaper() && p == Rsp.SCISSORES.getRockScissorsPaper()) ||
				(c == Rsp.SCISSORES.getRockScissorsPaper() && p == Rsp.PAPER.getRockScissorsPaper())) {
			ViewOutput.singleGameResult(PrintGameResult.WIN_RESULT.getPrintGameResult()); // 이김 출력 값 뷰 메서드에 넣어주기
			WinDrawCount.plusWinCount(); // 이김 횟수 증가
			return Result.WIN.getGameResult();
		} 
		if (p == c) {
			ViewOutput.singleGameResult(PrintGameResult.DRAW_RESULT.getPrintGameResult());// 비김 출력 값 뷰 메서드에 넣어주기
			WinDrawCount.plusDrawCount(); // 비김 횟수 증가
			return Result.DRAW.getGameResult();
		} 
		
		ViewOutput.singleGameResult(PrintGameResult.LOSE_RESULT.getPrintGameResult()); // 짐 출력 값 뷰 메서드에 넣기
	
		return Result.LOSE.getGameResult();
	}

}
