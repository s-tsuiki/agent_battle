package agent;

import core.Coordinate;

public interface IAction {

	public int act(Coordinate myPos, Coordinate ePos, AgentStatus[] s,
			int[][] map, int[][] event, double[][] p, int myScore, int eScore);

}
