package racingcar.domain.car;

public class Car implements Comparable<Car>{
    private final Name name;
    private Position position;
    private static final int MOVE_CONDITION = 4;


    public Car(final String name){
        this.name = new Name(name);
        this.position = new Position(0);
    }

    public String getName() {
        return name.get();
    }

    public void tryMove(int moveNum){
        if (moveNum >= MOVE_CONDITION){
            position = position.run();
        }
    }

    public int getPosition() {
        return position.get();
    }

    public boolean isEqualPosition(final Car car){
        return position.equals(car.position);
    }

    @Override
    public int compareTo(Car car) {
        return car.position.get() - position.get();
    }
}
