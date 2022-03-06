package View;

import java.util.Scanner;

import Enum.Rsp;
import Exception.RspException;

public class ViewInput {

	private static final String RSP_INPUT = "1, 2, 3 중에서 숫자를 입력하세요.";
	
	private static final String INVALID_INPUT = "잘못된 입력값입니다. 1,2,3의 숫자 중 하나를 입력하세요.";

	private static final Scanner SCANNER = new Scanner(System.in);

	public ViewInput() {

	}

	// 가위바위보 숫자 입력 메서드
	public static int inputRsp() throws RspException {
		System.out.println(RSP_INPUT);

		int input = SCANNER.nextInt();

		if (input != Rsp.ROCK.getRockScissorsPaper() 
				&& input != Rsp.SCISSORES.getRockScissorsPaper() 
				&& input!= Rsp.PAPER.getRockScissorsPaper()) {
			throw new RspException(INVALID_INPUT);
			}
		
		SCANNER.nextLine();

		return input;
	}
}
