package racingcar.view;

public class OutputView {
    private static final String PROGRESS_RESULT = "실행 결과";
    private static final String WINNER_PRINT_FROM = "%s가 최종 우승했습니다.";

    public static void printMsg(final String msg){
        System.out.println(msg);
    }

    public static void printProgressResult(final String log){
        System.out.println();
        System.out.println(PROGRESS_RESULT);
        System.out.print(log);
    }

    public static void printWinner(final String winners) {
        System.out.printf(WINNER_PRINT_FROM, winners);
    }

}
