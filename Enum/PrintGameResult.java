package Enum;

import View.ViewOutput;

public enum PrintGameResult {
	WIN_RESULT("님이 이겼습니다."), DRAW_RESULT("비겼습니다."), LOSE_RESULT("컴퓨터가 이겼습니다.");

	private final String printGameResult;

	private PrintGameResult(String printGameResult) {
		this.printGameResult = printGameResult;
	}

	public String getValue() {
		return printGameResult;
	}

	public static void resultOut(Result result) {
		
		if (result == Result.WIN)
			ViewOutput.singleGameResult(WIN_RESULT);
		if (result == Result.DRAW)
			ViewOutput.singleGameResult(DRAW_RESULT);
		if (result == Result.LOSE)
			ViewOutput.singleGameResult(LOSE_RESULT);
	}

}
