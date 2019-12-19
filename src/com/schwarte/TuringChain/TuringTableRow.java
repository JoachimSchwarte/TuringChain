package com.schwarte.TuringChain;

public class TuringTableRow {
	private int preInnerStatus;
	private int preCellContent;
	private int postInnerStatus;
	private int postCellContent;
	private TuringAction nextAction;
	
	public TuringTableRow(int preInnerStatus, int preCellContent, int postInnerStatus, int postCellContent,
			TuringAction nextAction) {
		super();
		this.preInnerStatus = preInnerStatus;
		this.preCellContent = preCellContent;
		this.postInnerStatus = postInnerStatus;
		this.postCellContent = postCellContent;
		this.nextAction = nextAction;
	}
	
	public int getPreInnerStatus() {
		return preInnerStatus;
	}
	public int getPreCellContent() {
		return preCellContent;
	}
	public int getPostInnerStatus() {
		return postInnerStatus;
	}
	public int getPostCellContent() {
		return postCellContent;
	}
	public TuringAction getNextAction() {
		return nextAction;
	}
}
