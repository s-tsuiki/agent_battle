package agent;

import core.Coordinate;
import main.Sfmt;

public class ActionA2 implements IAction {

	Sfmt rnd;

	//ここにフィールドを書く


	public ActionA2(Sfmt rnd) {
		this.rnd = rnd;
	}

	//この関数内に考えたアルゴリズムを記述する
	//乱数を使いたい場合はrnd.NextUnif()で0以上1未満の乱数を得られる
	//(他の範囲の乱数もある。main/Sfmt.java参照)
	@Override
	public int act(Coordinate myPos, Coordinate ePos, AgentStatus[] s, int[][] map, int[][] event, double[][] p,
			int myScore, int eScore) {

		return (int)(rnd.NextUnif()*9);
	}


	//必要に応じてここに追加のメソッドを書く



}
