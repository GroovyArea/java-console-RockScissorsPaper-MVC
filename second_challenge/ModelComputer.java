package second_challenge;


// 컴퓨터의 정보를 담고 있는 클래스
public class ModelComputer {
	private int comRsp = (int)(Math.random() * 3) + 1;

	public int getComRsp() {
		return comRsp;
	}

	public void setComRsp(int comRsp) {
		this.comRsp = comRsp;
	} 
	
	
}
