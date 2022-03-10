package Enum;

import Model.WinDrawCount;

public enum Result {

	WIN, LOSE, DRAW;
	/*
	 * private final int gameResult;
	 * 
	 * private Result(int gameResult) { this.gameResult = gameResult; }
	 */

	public static Result getGameResult(Rsp player, Rsp com) {

		// 이김
		if (com == Rsp.ROCK && player == Rsp.PAPER 
				|| com == Rsp.SCISSOROS && player == Rsp.ROCK
				|| com == Rsp.PAPER && player == Rsp.SCISSOROS) {
			return WIN;
		}

		// 비김
		if (com == player) {
			return DRAW;
		}
		
		// 짐
		return LOSE;
	}
	
	public static void gameCount(Result result) {
		if(result == WIN)
			WinDrawCount.plusWinCount();
		if(result == DRAW)
			WinDrawCount.plusDrawCount();
	}
	
}
