package com.schwarte.TuringChain;

import java.util.LinkedList;

public class TuringTable {

	private static TuringTable instance = null;
	private LinkedList<TuringTableRow> tt = new LinkedList<TuringTableRow>();
	
	private TuringTable() {
		super();
	}
	
	public static TuringTable getInstance() {
		if (instance == null) {
			instance = new TuringTable();
		}
		return instance; 
	}

	public void addRow(TuringTableRow ttr) {
		this.tt.add(ttr);
	}
	
	public TuringTableRow getRow(int row) {
		return tt.get(row);
	}
	
	public LinkedList<TuringTableRow> getTable() {
		return tt;
	}
}
