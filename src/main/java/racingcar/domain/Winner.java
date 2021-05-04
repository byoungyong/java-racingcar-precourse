package racingcar.domain;

import racingcar.domain.car.Car;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Winner {
    private static final String WINNER_DELIMITER = ", ";
    private final List<Car> cars;

    public Winner(final List<Car> cars){
        this.cars = cars;
    }

    public String getWinnerName(){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0; i < cars.size(); i++){

            stringBuilder.append(cars.get(i).getName());

            if (i != 0 || i == cars.size()){
                stringBuilder.append(WINNER_DELIMITER);
            }
        }

        return stringBuilder.toString();
    }
}
