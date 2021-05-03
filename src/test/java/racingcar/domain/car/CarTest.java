package racingcar.domain.car;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarTest {

    private Car car;

    @Test
    public void nothing(){

    }

    @ParameterizedTest
    @ValueSource(strings = {"", "dsafsdfasdfasdf"})
    @DisplayName("이름 길이가 0 이하 또는 5 이상일 때 에러 확인")
    void 차_이름_5자(String name){
        assertThatThrownBy(() -> new Car(name))
            .isInstanceOf(IllegalStateException.class);
    }
}
