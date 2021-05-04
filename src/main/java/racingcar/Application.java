package racingcar;

import racingcar.domain.RandomUtil;
import racingcar.domain.Turn;
import racingcar.domain.car.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] main){
        Cars cars = InputView.getName();
        Turn turn = InputView.getTurn();

        RacingManager racingManager = new RacingManager(cars, turn, new RandomUtil());

        RacingResult racingResult = racingManager.gameStart();
        OutputView.printProgressResult(racingResult.getLog());
        OutputView.printWinner(racingResult.decideWinner(cars));
    }
}



