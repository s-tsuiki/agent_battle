package agent;

import core.Coordinate;

public interface IAgent {

	public int action(Coordinate ePos, AgentStatus[] status,
			int[][] map, int[][] event, double[][] p, int myScore, int eScore);

	public void setPos(Coordinate c);
}
