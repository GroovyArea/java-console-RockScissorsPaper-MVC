package Model;


public class ComputerNumber {
	
	// 컴퓨터 자동 숫자 필드 
	private int AUTO_Number = (int)(Math.random() * 3) + 1;
	
	// 가위바위보 값 정수형 반환
	public int getComputerNumber() {
		return AUTO_Number;
	}
}
