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
		System.out.println(result);
		switch (result) {
		case WIN :
			ViewOutput.singleGameResult(WIN_RESULT);
		case DRAW :
			ViewOutput.singleGameResult(DRAW_RESULT);
		default :
			ViewOutput.singleGameResult(LOSE_RESULT);
		}
	}

}
