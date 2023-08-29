public class Line {
	public Point start, end;

	public Line(Point p1, Point p2) {
		start = p1;
		end = p2;
	}

	public Point getPointFurtherFromOrigin() {
        //call compareto function
        int x = start.compareTo(end);

        // returns 0 , 1 and -1.
        // we now have to decode those numbers to send back the right point.
        // x = 1 means i am assigning 1 to x. x == 1 means i am checking whether x is 1 or not.

        if(x == 1)
            return start;
        else if(x == -1)
            return end;
        else 
            return start;

	}
}