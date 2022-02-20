package first_challenge;

// 요청을 처리하는 클래스 Model
// 가위바위보 승패 판단 후 반환하는 메서드
// 재시작 판단 후 반환하는 메서드
public class Model {
	
	private int judgeResult = 0; //승패 여부 판단 변수.
	private int restartResult =0; // 재시작 여부 판단 변수
	
	// 승패 판단하는 넘
	public int judgeRsp(int playerRsp, int comRsp) {
		if((comRsp==3 && playerRsp ==1) || (comRsp== 1 && playerRsp ==2) ||(comRsp==2 && playerRsp ==3)) {
			judgeResult = 1; // 이김		
		} else if ((comRsp == 1 && playerRsp ==3)||(comRsp == 2 && playerRsp ==1)||(comRsp == 3 && playerRsp ==2)) {
			judgeResult = 2; // 짐
		} else if(playerRsp == comRsp) {
			judgeResult = 3; // 비김
		}
		return judgeResult; // 숫자 변수 반환해주깅
 	}

	// 재시작 여부 판단하는 넘
	public int judgeRestart(char re) {
		// Y를 입력 받았을 경우만 1로 바꿔서 반환
		if(re == 'y' || re == 'Y') {
			restartResult = 1;
		}
		
		return restartResult;
	}

}
