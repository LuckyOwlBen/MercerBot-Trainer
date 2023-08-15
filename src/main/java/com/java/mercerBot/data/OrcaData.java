package com.java.mercerBot.data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrcaData {
	@JsonProperty("features")
	List<Features> features;

	@JsonProperty("rows")
	private List<Rows> rows;

	public List<Rows> getRows() {
		return rows;
	}

	public void setRows(List<Rows> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrcaData [");
		if (features != null)
			builder.append("features=").append(features).append(", ");
		if (rows != null)
			builder.append("rows=").append(rows);
		builder.append("]");
		return builder.toString();
	}
}
