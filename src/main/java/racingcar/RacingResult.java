package racingcar;

import racingcar.domain.car.Cars;

public class RacingResult {
    private final StringBuilder log = new StringBuilder();
    private static final String DISTANCE_SIGN = "-";
    private static final String ENTER = System.lineSeparator();
    private static final String LOG_FORM = "%s : %s" + ENTER;

    public void appendLog(final Cars cars){
        cars.getCars()
                .forEach(car -> log.append(
                        String.format(LOG_FORM, car.getName(), getDistanceSign(car.getPosition()))
                ));
    }

    private String getDistanceSign(int position) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0;i < position; i++){
            stringBuilder.append(DISTANCE_SIGN);
        }

        return stringBuilder.toString();
    }

    public String getLog(){
        return log.toString();
    }

    public String decideWinner(Cars cars){
        return cars.decideWinner();
    }
}
