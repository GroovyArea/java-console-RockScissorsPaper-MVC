package Model;


public class ComputerNumber {
	
	// 컴퓨터 가위바위보용 자동 숫자 상수
	private final int AUTO_NUMBER = (int)(Math.random() * 3) + 1;
	
	// 가위바위보 값 정수형 반환
	public int getComputerNumber() {
		return AUTO_NUMBER;
	}
}
