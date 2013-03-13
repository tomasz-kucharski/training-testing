package testing;

import java.io.Serializable;

public class CompetitionInfo<T extends Number> implements Serializable {
	private static final long serialVersionUID = -9198798989954203301L;
	private Long place;
	private T points;

	public void setPlace(final Long pl) {
		this.place = pl;
	}

	public Long getPlace() {
		return place;
	}

	public void setPoints(final T pts) {
		this.points = pts;
	}

	public T getPoints() {
		return points;
	}

	@Override
	public String toString() {
		return "CompetitionInfo [place=" + place + ", points=" + points + "]";
	}
}
