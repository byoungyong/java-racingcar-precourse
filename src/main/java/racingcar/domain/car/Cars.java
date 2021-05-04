package racingcar.domain.car;

import racingcar.domain.Winner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(final List<Car> userCars) {
        this.cars = new ArrayList<>(userCars);
    }

    public Cars(final String... names){
        cars = new ArrayList<>();
        for (String name : names){
            cars.add(new Car(name));
        }
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }

    public String decideWinner() {
        List<Car> winners = new ArrayList<>();

        Collections.sort(cars);
        Car winnerCar = cars.get(0);


        for (int i=0; i < cars.size(); i++){
            if (winnerCar.isEqualPosition(cars.get(i))){
                winners.add(cars.get(0));
            }
        }

        return new Winner(winners).getWinnerName();
    }
}
