package agent;

import core.Coordinate;
import main.Sfmt;

public class ActionB2 implements IAction {

	Sfmt rnd;

	public ActionB2(Sfmt rnd) {
		this.rnd = rnd;
	}

	@Override
	public int act(Coordinate myPos, Coordinate ePos, AgentStatus[] s, int[][] map, int[][] event, double[][] p,
			int myScore, int eScore) {

		return (int)(rnd.NextUnif()*9);
	}

}
