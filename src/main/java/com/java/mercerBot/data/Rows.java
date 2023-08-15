package com.java.mercerBot.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rows {

	@JsonProperty("row_idx")
	private int rowIdx;

	@JsonProperty("row")
	private Row row;

	public int getRowIdx() {
		return rowIdx;
	}

	public void setRowIdx(int rowIdx) {
		this.rowIdx = rowIdx;
	}

	public Row getRow() {
		return row;
	}

	public void setRow(Row row) {
		this.row = row;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rows [rowIdx=").append(rowIdx).append(", ");
		if (row != null)
			builder.append("row=").append(row);
		builder.append("]");
		return builder.toString();
	}

}
