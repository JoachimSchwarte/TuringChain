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
	
	public void startMachine() {
		TuringAction ta = TuringAction.R;
		while (ta.equals(TuringAction.Stop)==false) {
			ta = TuringChainNode.activateNode(position);
			if (ta.equals(TuringAction.R) == true) position++; 
			if (ta.equals(TuringAction.L) == true) position--; 
		}
	}

	public void setInnerStatus(int innerStatus) {
		this.innerStatus = innerStatus;
	}
	
	public int getInnerStatus() {
		return innerStatus;
	}
}
