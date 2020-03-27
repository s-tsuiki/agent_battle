package core;

import agent.ActionA2;
import agent.ActionB2;
import agent.Agent;
import agent.IAction;
import main.Sfmt;
import tools.LogExporter;

public class VirtualEnvironment2 extends VirtualEnvironment {

	public VirtualEnvironment2(Sfmt rnd, int sim_number, LogExporter lex, boolean print_battle_field, boolean print_score) {
		this.rnd = rnd;
		this.sim_number = sim_number;
		this.lex = lex;
		this.print_battle_field = print_battle_field;
		this.print_score = print_score;
		//変更
		field = new Field2(width, height, rnd);
		agentManager = new AgentManager();

		//環境出力
		graphWriter = this.lex.createWriter("graph");
		printGraph();

		scoreWriter = this.lex.createWriter("score");
		if(print_score)
			scoreWriter.writeLine("time,score1,score2");
	}

	@Override
	public void createAgent() {

		//自分のエージェント
		Sfmt rnd1 = new Sfmt(7);
		IAction action1 = new ActionA2(rnd1);
		player1 = new Agent(action1);
		agentManager.addAgent(player1, 0, 0);

		//相手のエージェント
		Sfmt rnd2 = new Sfmt(11);
		IAction action2 = new ActionB2(rnd2);
		player2 = new Agent(action2);
		agentManager.addAgent(player2, width-1, height-1);

	}

}
