package View;

import Enum.PrintGameResult;
import Enum.Result;
import Enum.Rsp;
import Model.WinDrawCount;

public class ViewOutput {

	// 게임 스타트 메서드
	public static void startGame() {
		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.println("=============================");
	}

	// 가위바위보 뭐 냈는지 출력하는 메서드
	public static void whatYouInput(Rsp player, Rsp computer) {
		System.out.println("[참가자] : ["+player+"]");
		System.out.println("[컴퓨터] : ["+computer+"]");
		System.out.println();
	}
	
	// 1 게임 결과 출력 메서드
	public static void singleGameResult(PrintGameResult str) {
		System.out.println(str.getValue());
	}

	// 게임 종료 출력 메서드
	public static void endtitle() {
		System.out.println(" == 게임 종료 ==");
		System.out.println("=================");
	}
	
	// println() 메서드
	public static void newLine() {
		System.out.println();
	}
	
	// 게임 결과 출력
	public static void gameResult() {
		System.out
				.println("당신은 [" + WinDrawCount.getWinCount() + "] 번 이겼고, [" + WinDrawCount.getDrawCount() + "] 번 비겼습니다.");
	}
}
