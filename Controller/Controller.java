package Controller;

import Model.Computer;
import Model.Game;
import Model.Player;

// 요청을 받는 Controller
public class Controller {
	
	Player player = new Player();
	Computer computer = new Computer();

	public int playRsp(int inputRsp, int comRsp) {
		player.setPlayerRsp(inputRsp); // 입력한 가위바위보 플레이어에 넣어주고
		computer.setComRsp(comRsp); // 컴터 카위바위보도 넣어주고

		//승패 결과 숫자로 반환 객체 넘겨줘서
		return Game.judgeProcess(player, computer);
	}
	
	

}
