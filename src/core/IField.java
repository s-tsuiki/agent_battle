package core;

public interface IField {

	public void happen_event();

	public int get_event(Coordinate c);

	public int getMapInfo(Coordinate c1, Coordinate c2);

	public int[][] getMap();

	public int[][] getEvent();

	public double[][] getP();

	public int getWidth();

	public int getHeight();

	public double[] get_p_set();

}
