package com.schwarte.TuringChain;

import java.util.LinkedList;

import org.w3c.dom.NodeList;

public class TuringChainNode {
	
	private static int innerStatus = 0;
	private static TuringTable tt = new TuringTable();
	private static LinkedList<TuringChainNode> nodeList = new LinkedList<TuringChainNode>();
	
	private int cellContent;

	public TuringChainNode(int cellContent) {
		super();
		this.cellContent = cellContent;
		nodeList.add(this);
	}
	
	public void activateNode(int i) {
		int ttLength = tt.getRowcount();
		
	}
	
	
	
	

}
