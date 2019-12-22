package com.schwarte.TuringChain;

import java.util.LinkedList;

public class TuringChainNode {
	
	private static int innerStatus = 0;
    static LinkedList<TuringChainNode> nodeList = new LinkedList<TuringChainNode>();
	
	private int cellContent;

	public TuringChainNode(int cellContent) {
		super();
		this.cellContent = cellContent;
		nodeList.add(this);
	}
	
	public static TuringChainNode getNode(int i) {
		return nodeList.get(i);
	}
	
	public void activateNode(int i, TuringTable tt) {
		int ttLength = tt.getRowcount();
		for (int j=0; j<ttLength; ++j) {
			System.out.println("i= " + i
					+ " innerStatus: " + innerStatus 
					+ " cellContent: " + cellContent
					);
			if ((tt.getRow(j).getPreInnerStatus() == innerStatus) &&
					(tt.getRow(j).getPreCellContent() == cellContent)) {
				cellContent = tt.getRow(j).getPostCellContent();
				innerStatus = tt.getRow(j).getPostInnerStatus();
				System.out.println("i= " + i
						+ " innerStatus: " + innerStatus 
						+ " cellContent: " + cellContent
						);
				System.out.println("i= " + i 
						+ " IV: " + tt.getRow(j).getPreInnerStatus() 
						+ " BV: " + tt.getRow(j).getPreCellContent()
						+ " IN: " + tt.getRow(j).getPostInnerStatus()
						+ " BN: " + tt.getRow(j).getPostCellContent()
						);
				if (tt.getRow(j).getNextAction().equals(TuringAction.R)) {
					System.out.println("Node: " + i + "   Action: R");
					getNode(i+1).activateNode(i+1, tt);
				}
				if (tt.getRow(j).getNextAction().equals(TuringAction.L)) {
					System.out.println("Node: " + i + "   Action: L");
					getNode(i-1).activateNode(i-1, tt);	
				}
				if (tt.getRow(j).getNextAction().equals(TuringAction.Stop)) {
					System.out.println("Node: " + i + "   Action: Stop");
				}
				System.out.println("Node: " + i + "   return");
				return;
			}			
		}		
	}

	public int getCellContent() {
		return cellContent;
	}
}
