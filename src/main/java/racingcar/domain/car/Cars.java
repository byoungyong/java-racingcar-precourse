package racingcar.domain.car;

import java.util.Collections;
import java.util.List;

public class Cars {

    private List<Car> cars;

    public Cars(List<Car> userCars) {
        this.cars = userCars;
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }

}
