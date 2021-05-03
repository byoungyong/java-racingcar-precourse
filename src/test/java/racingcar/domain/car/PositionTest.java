package racingcar.domain.car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PositionTest {
    
    @Test
    void run(){
        Position position = new Position(0);
        position = position.run();
        assertThat(position.get()).isEqualTo(1);
    }
}
