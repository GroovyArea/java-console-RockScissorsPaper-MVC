package Model;

import Enum.Rsp;
import Exception.RspException;

// 컴퓨터의 정보를 담고 있는 클래스
public class Computer {

	private final int comRsp;

	// setter 대신 생성자로 대입시켜서 해결
	// 컴퓨터 인스턴스를 생성 시 자동 숫자(가위바위보) 저장
	public Computer(final int comRsp) {
		this.comRsp = comRsp;
	}

	// 컴퓨터 가위바위보를 enum으로 변환하여 반환
	public Rsp getComRsp() throws RspException {
		return Rsp.of(comRsp);
	}

}
