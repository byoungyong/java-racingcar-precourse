package racingcar.domain.car;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import racingcar.domain.car.Car;

import org.junit.jupiter.api.Test;

public class CarsTest {
    @Test
    void create(){
        List<Car> userCars = new ArrayList<>(Arrays.asList(new Car("bora"), new Car("pobi")));

        Cars cars = new Cars(userCars);
        assertThat(cars.getCars()).extracting("name").contains("bora", "pobi");
    }
}
