package racingcar.domain;

import java.util.Random;
import java.util.function.Supplier;

public class RandomUtil implements Supplier<Integer>{

    private static final int RANDOM_BOUND = 10;

    @Override
    public Integer get() {
        return new Random().nextInt(RANDOM_BOUND);
    }
    
}
