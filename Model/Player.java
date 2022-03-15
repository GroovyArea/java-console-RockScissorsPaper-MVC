package Model;

import Enum.Rsp;


// 사용자의 정보를 담고 있는 클래스
// 컴퓨터와 사용자의 값을 비교할 것
public class Player {

	private final Rsp playerRsp;

	// setter 대신 생성자로 주입시켜서 해결
	public Player(final Rsp playerRsp) {
		this.playerRsp = playerRsp;
	}
	
	// 참가자 가위바위보 반환
	public Rsp getRsp() {
		return playerRsp;
	}

}
