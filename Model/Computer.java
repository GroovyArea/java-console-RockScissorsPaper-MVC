package Model;

import Enum.Rsp;
import Exception.RspException;

// 컴퓨터의 정보를 담고 있는 클래스
public class Computer {

	private int comRsp;
	private ComputerNumber computerNumber = new ComputerNumber();

	// setter 대신 생성자로 주입 시켜서 해결
	public Computer() {
		this.comRsp = computerNumber.getComputerNumber();
	}

	public Rsp getComRsp() throws RspException {
		return Rsp.of(comRsp);
	}

}
