public class Point {
	public int x, y;

	public Point(int _x, int _y) {
		x = _x;
		y = _y;
	}

	public double distanceFromOrigin() {
		return Math.sqrt(x*x + y*y);
	}

	public int compareTo(Point other) { //compare based on distance from origin
		double d1 = this.distanceFromOrigin();
		double d2 = other.distanceFromOrigin();
		if(d1 > d2)
			return 1;
		if(d1 < d2)
			return -1;
		return 0;
	}
}