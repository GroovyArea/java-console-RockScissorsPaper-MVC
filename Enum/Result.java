package Enum;

public enum Result {
	
	WIN(10),
	LOSE(20),
	DRAW(30);
	
	
	private final int gameResult;
	
	Result(int gameResult) {
		this.gameResult = gameResult;
	}
	
	public int getGameResult() {
		return gameResult;
	}
}
