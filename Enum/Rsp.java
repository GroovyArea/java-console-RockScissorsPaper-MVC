package Enum;

import Exception.RspException;


public enum Rsp {

	ROCK(1), SCISSORS(2), PAPER(3);

	private final int rockScissorsPaper;

	private static final String INVALID_INPUT = "은 잘못된 입력값입니다. 1, 2, 3의 숫자 중 하나를 입력하세요.";

	private Rsp(int rockScissorsPaper) {
		this.rockScissorsPaper = rockScissorsPaper;
	}

	// 가위바위보 반환 메서드. viewInput에서 사용자 입력값을 인자를 매개변수로 받음
	public static Rsp of(final int playerRsp) throws RspException {

		switch (playerRsp) {
		case 1:
			return ROCK;
		case 2:
			return SCISSORS;
		case 3:
			return PAPER;

		default:
			throw new RspException(playerRsp + INVALID_INPUT);

		}

	}

}