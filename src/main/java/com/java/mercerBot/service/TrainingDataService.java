package com.java.mercerBot.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.FileWriter;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.mercerBot.data.OrcaData;

@Service
public class TrainingDataService {
	public OrcaData getOrcaData() {
		String url = "https://datasets-server.huggingface.co/rows?dataset=Open-Orca%2FOpenOrca&config=Open-Orca--OpenOrca&split=train&offset=0&limit=100000";
		ObjectMapper objectMapper = new ObjectMapper();
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
		OrcaData orcaData = new OrcaData();
		try {
			HttpResponse<String> orcaResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
			orcaData = objectMapper.readValue(orcaResponse.body(), OrcaData.class);
			FileWriter writer = new FileWriter("D:\\gitrepos\\chatGPT\\privateGPT\\source_documents\\Orcas\\OrcaData.txt");
			writer.write(orcaData.toString());
			writer.close();
		} catch(Exception e) {
			System.out.println("It's Broken!");
		}
		return orcaData;
	}
}
