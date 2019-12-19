package com.schwarte.TuringChain;

public class TuringTable {
	
	private static int rowcount = 0;
	
	private TuringTableRow[] tt = new TuringTableRow[1000];

	public void addRow(TuringTableRow ttr) {
		tt[rowcount] = ttr;
		++rowcount;
	}
	
	public TuringTableRow getRow(int row) {
		return tt[row];
	}
	
	public int getRowcount() {
		return rowcount;
	}
}
