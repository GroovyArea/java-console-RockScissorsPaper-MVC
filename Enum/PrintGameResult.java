package Enum;

public enum PrintGameResult {

	WIN_RESULT("님이 이겼습니다."), DRAW_RESULT("비겼습니다."), LOSE_RESULT("컴퓨터가 이겼습니다.");

	private final String printGameResult;

	private PrintGameResult(String printGameResult) {
		this.printGameResult = printGameResult;
	}

	public String getValue() {
		return printGameResult;
	}

	public static PrintGameResult of(Result result) {

		switch (result) {
		case WIN:
			return WIN_RESULT;
		case DRAW:
			return DRAW_RESULT;
		default:
			return LOSE_RESULT;
		}

	}

}
