package racingcar;

import racingcar.domain.Turn;
import racingcar.domain.car.Cars;

import java.util.function.Supplier;

public class RacingManager {
    private final Cars cars;
    private final Turn turn;
    private final Supplier<Integer> random;

    public RacingManager(final Cars cars, final Turn turn, Supplier<Integer> random){
        this.cars = cars;
        this.turn = turn;
        this.random = random;
    }

    public RacingResult gameStart(){
        RacingResult racingResult = new RacingResult();

        for (int i=0; i < turn.get(); i++){
            race(racingResult);
        }

        return racingResult;
    }

    private void race(RacingResult racingResult) {
        cars.getCars().forEach(car -> car.tryMove(random.get()));
        racingResult.appendLog(cars);
    }
}
