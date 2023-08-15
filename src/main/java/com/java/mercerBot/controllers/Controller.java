package com.java.mercerBot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.mercerBot.data.OrcaData;
import com.java.mercerBot.service.TrainingDataService;

@RestController
@RequestMapping("/trainingData")
public class Controller {

	private TrainingDataService trainingDataService;

	@Autowired
	public Controller(TrainingDataService trainingDataService) {
		this.trainingDataService = trainingDataService;
	}

	@GetMapping("/getOrcaData")
	public OrcaData getOrcaData() {
		return trainingDataService.getOrcaData();
	}
}
