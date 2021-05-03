package racingcar.domain.car;

public class Car {
    private final Name name;

    public Car(final String name){
        this.name = new Name(name);
    }

    public Name getName() {
        return name;
    }
}
