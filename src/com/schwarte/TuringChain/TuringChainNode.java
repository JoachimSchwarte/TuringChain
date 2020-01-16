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

	public static TuringAction activateNode(int i) {
		int innerStatus = TuringMachine.getInstance().getInnerStatus();
		TuringTable tt = TuringTable.getInstance();
		for (int j=0; j<tt.getTable().size(); ++j) {
			if ((tt.getRow(j).getPreInnerStatus() == innerStatus) &&
					(tt.getRow(j).getPreCellContent() == TuringChainNode.getNode(i).getCellContent())) {
				TuringChainNode.getNode(i).setCellContent(tt.getRow(j).getPostCellContent());
				TuringMachine.getInstance().setInnerStatus(tt.getRow(j).getPostInnerStatus());
				return tt.getRow(j).getNextAction();
			}			
		}
		return null;			
	}

	public int getCellContent() {
		return cellContent;
	}
	
	public void setCellContent(int cellContent) {
		this.cellContent = cellContent;
	}
}
