package second_challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Exception.RestartException;
import Exception.RspException;

public class ViewInput {
	// 입력 받는 객체 스트림 객체 생성
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private ModelPlayer modelPlayer = new ModelPlayer();
	
	// 가위바위보 숫자 입력 메서드
	public int inputRsp() throws NumberFormatException, IOException, RspException {

		modelPlayer.setPlayerRsp(Integer.parseInt(br.readLine()));

		int result = modelPlayer.getPlayerRsp();
		
		if (!(result == 1 || result == 2 || result == 3))
			throw new RspException("잘못된 입력값입니다. 1,2,3의 숫자 중 하나를 입력하세요.");
		return result;

	}

	// 재시작 문자 입력 메서드
	public char inputRestart() throws IOException, RestartException {

		System.out.println("재시작 하시겠습니까? (y : n)");
		char re = br.readLine().charAt(0);
		if (!(re == 'y' || re == 'Y' || re == 'n' || re == 'N')) {
			throw new RestartException("잘못된 입력값입니다. y나 n을 입력해주세요.");
		}
		return re;
	}

}
