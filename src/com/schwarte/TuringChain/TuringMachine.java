package com.schwarte.TuringChain;

public class TuringMachine {

	private int position = 0;
	private int innerStatus = 0;
	private static TuringMachine instance = null;
	
	private TuringMachine() {
		super();
	}
	
	public static TuringMachine getInstance() {
		if (instance == null) {
			instance = new TuringMachine();
		}
		return instance; 
	}
	
	public void startMachine(TuringTable tt) {
		TuringAction ta = TuringAction.R;
		while (ta.equals(TuringAction.Stop)==false) {
			ta = TuringChainNode.getNode(position).activateNode(position, innerStatus, tt);
			if (ta.equals(TuringAction.R) == true) position++; 
			if (ta.equals(TuringAction.L) == true) position--; 
		}
	}

	public void setInnerStatus(int innerStatus) {
		this.innerStatus = innerStatus;
	}
}
