package com.schwarte.TuringChain;

import java.util.LinkedList;

public class TuringChainNode {
	
    private static LinkedList<TuringChainNode> nodeList = new LinkedList<TuringChainNode>();
	
	private int cellContent;

	public TuringChainNode(int cellContent) {
		super();
		this.cellContent = cellContent;
		nodeList.add(this);
	}
	
	public static TuringChainNode getNode(int i) {
		return nodeList.get(i);
	}
	
	public TuringAction activateNode(int i, int innerStatus, TuringTable tt) {
		int ttLength = tt.getRowcount();
		for (int j=0; j<ttLength; ++j) {
			if ((tt.getRow(j).getPreInnerStatus() == innerStatus) &&
					(tt.getRow(j).getPreCellContent() == cellContent)) {
				cellContent = tt.getRow(j).getPostCellContent();
				TuringMachine.getInstanceTuringMachine().setInnerStatus(tt.getRow(j).getPostInnerStatus());
				innerStatus = tt.getRow(j).getPostInnerStatus();
				return tt.getRow(j).getNextAction();
			}			
		}
		return null;			
	}

	public int getCellContent() {
		return cellContent;
	}
}
