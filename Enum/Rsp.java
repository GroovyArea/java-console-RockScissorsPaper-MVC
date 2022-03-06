package Enum;

public enum Rsp {
	ROCK(1), SCISSORES(2), PAPER(3);

	private final int rockScissorsPaper;

	Rsp(int rockScissorsPaper) {
		this.rockScissorsPaper = rockScissorsPaper;
	}

	public int getRockScissorsPaper() {
		return rockScissorsPaper;
	}
}