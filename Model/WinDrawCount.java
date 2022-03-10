package Model;

// 카운트 클래스
public class WinDrawCount {

	private static int winCount = 0;
	private static int drawCount = 0;

	public static int getWinCount() {
		return winCount;
	}

	// 이긴 횟수 증가
	public static void plusWinCount() {
		WinDrawCount.winCount++;
	}

	public static int getDrawCount() {
		return drawCount;
	}

	// 비긴 횟수 증가
	public static void plusDrawCount() {
		WinDrawCount.drawCount++;
	}

}
