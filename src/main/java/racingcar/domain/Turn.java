package racingcar.domain;

import racingcar.exception.RacingCarErrorMsg;

public class Turn {
    private static final int MIN_NUM = 1;
    private final int turn;

    public Turn(final int turn){
        validateTurn(turn);
        this.turn = turn;
    }

    private void validateTurn(int turn) {
        if (turn < MIN_NUM){
            throw new IllegalStateException(RacingCarErrorMsg.TURN.getMsg());
        }
    }

    public int get() {
        return turn;
    }
}
