package View;

import java.util.Scanner;

import Enum.Rsp;
import Exception.RspException;

public class ViewInput {

	private static final String RSP_INPUT = "1, 2, 3 중에서 숫자를 입력하세요.";

	private static final Scanner SCANNER = new Scanner(System.in);

	public ViewInput() {

	}

	// 가위바위보 숫자 입력 메서드
	public static Rsp inputPlayerRsp() throws RspException {
		
		System.out.println(RSP_INPUT);

		// 이넘 클래스로 사용자 입력 가위바위보 값 보내기
		Rsp input = Rsp.of(SCANNER.nextInt());

		SCANNER.nextLine();

		return input;
	}
	
}
