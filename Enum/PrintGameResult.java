package Enum;

public enum PrintGameResult {
	WIN_RESULT("님이 이겼습니다."),
	DRAW_RESULT("비겼습니다."),
	LOSE_RESULT("컴퓨터가 이겼습니다.");
	
	private final String printGameResult; 
	
	PrintGameResult(String printGameResult) {
		this.printGameResult = printGameResult;
	}
	
	public String getPrintGameResult() {
		return printGameResult;
				
	}
}
