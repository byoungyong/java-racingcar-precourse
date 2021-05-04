package racingcar.domain.car;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

//import racingcar.domain.RandomUtil;

public class CarTest {
    
    @Test
    public void nothing(){

    }

    @ParameterizedTest
    @ValueSource(strings = {"", "testcar"})
    @DisplayName("이름 길이가 0 이하 또는 5 이상일 때 에러 확인")
    void 차_이름_5자(String name){
        assertThatThrownBy(() -> new Car(name))
            .isInstanceOf(IllegalStateException.class);
    }

    @Test
    public void 차_이동(){
        Car car = new Car("pobi");
        car.tryMove(5);
        assertThat(car.getPosition()).isEqualTo(1);
    } 
}
