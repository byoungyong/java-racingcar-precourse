package racingcar.view;

import racingcar.domain.Turn;
import racingcar.domain.car.Cars;
import racingcar.exception.RacingCarErrorMsg;

import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String GET_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String GET_TURN_MESSAGE = "시도할 횟수는 몇회인가요?";
    private static final String NAME_DELIMITER = ",";

    public static Cars getName(){
        try {
            OutputView.printMsg(GET_CAR_NAME_MESSAGE);
            String names = scanner.nextLine().trim();
            return new Cars(names.split(NAME_DELIMITER));
        } catch (Exception e) {
            OutputView.printMsg(e.getMessage());
            return getName();
        }
    }

    public static Turn getTurn(){
        try {
            OutputView.printMsg(GET_TURN_MESSAGE);
            int turn = Integer.parseInt(scanner.nextLine().trim());
            return new Turn(turn);
        } catch (Exception e) {
            OutputView.printMsg(RacingCarErrorMsg.TURN.getMsg());
            return getTurn();
        }
    }

}
