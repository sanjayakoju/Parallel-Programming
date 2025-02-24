package util;

public class Distance implements Comparable<Distance> {
	private int index;
	private double distance;
	@Override
	public int compareTo(Distance other) {
		if (this.distance < other.getDistance()) {
			return -1;
		} else if (this.distance > other.getDistance()) {
			return 1;
		}
		return 0;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
}
