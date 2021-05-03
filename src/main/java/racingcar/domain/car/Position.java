package racingcar.domain.car;

public class Position {

	private final int position;

	public Position(final int position){
		this.position = position;
	}
	
	public Position run() {
		return new Position(position + 1);
	}

	public int get() {
		return position;
	}

}
