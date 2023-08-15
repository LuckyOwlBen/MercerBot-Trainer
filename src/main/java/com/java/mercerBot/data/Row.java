package com.java.mercerBot.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Row {
	@JsonProperty("id")
	private String id;

	@JsonProperty("system_prompt")
	private String systemPrompt;

	@JsonProperty("question")
	private String question;

	@JsonProperty("response")
	private String response;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSystemPrompt() {
		return systemPrompt;
	}
	public void setSystemPrompt(String systemPrompt) {
		this.systemPrompt = systemPrompt;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Row [");
		if (id != null)
			builder.append("id=").append(id).append(", ");
		if (systemPrompt != null)
			builder.append("systemPrompt=").append(systemPrompt).append(", ");
		if (question != null)
			builder.append("question=").append(question).append(", ");
		if (response != null)
			builder.append("response=").append(response);
		builder.append("]");
		return builder.toString();
	}

}
