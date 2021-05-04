package racingcar.domain.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import java.util.List;

public class WinnerTest {

    private Cars cars;

    @BeforeEach
    void init(){
        cars = new Cars("tube","byc","jojo");
    }

    @Test
    void 우승자_한명(){
        List<Car> participants = cars.getCars();


        participants.get(0).tryMove(4);
        participants.get(0).tryMove(4);

        participants.get(1).tryMove(4);
        participants.get(1).tryMove(4);
        participants.get(1).tryMove(4);

        assertThat(cars.decideWinner()).isEqualTo("byc");

    }


}
