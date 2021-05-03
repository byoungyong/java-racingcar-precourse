package racingcar.domain.car;

public class Car {
    private final Name name;
    private Position position;
    private static final int MOVE_CONDITION = 4;


    public Car(final String name){
        this.name = new Name(name);
        this.position = new Position(0);
    }

    public Name getName() {
        return name;
    }

    public void tryMove(int moveNum){
        if (moveNum >= MOVE_CONDITION){
            position = position.run();
        }
    }

    public int getPosition() {
        return position.get();
    }
}
