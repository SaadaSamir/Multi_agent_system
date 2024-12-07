import jade.core.Agent;

public class Myagent1 extends Agent {

	protected void setup() {
		// TODO Auto-generated method stub
			if (this.getLocalName().equals("S1")) {
				addBehaviour(new B1());
			}
	}
}
