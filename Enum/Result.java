package Enum;

import Model.WinDrawCount;

public enum Result {

	WIN, LOSE, DRAW;

	// 결과 로직 반환
	public static Result getGameResult(Rsp player, Rsp com) {

		// 이김
		if (com == Rsp.ROCK && player == Rsp.PAPER 
				|| com == Rsp.SCISSORS && player == Rsp.ROCK
				|| com == Rsp.PAPER && player == Rsp.SCISSORS) {
			return WIN;
		}

		// 비김
		if (com == player) {
			return DRAW;
		}
		
		// 짐
		return LOSE;
	}
	
	// enum 타입 결과를 매개변수로 받아 승 무 카운트
	public static void gameCount(Result result) {
		if(result == WIN)
			WinDrawCount.plusWinCount();
		if(result == DRAW)
			WinDrawCount.plusDrawCount();
	}
	
}
