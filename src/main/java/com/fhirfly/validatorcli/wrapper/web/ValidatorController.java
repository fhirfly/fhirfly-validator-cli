package com.fhirfly.validatorcli.wrapper.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.hl7.fhir.validatorcli.*;


@Controller
public class ValidatorController {

	@GetMapping("/validator")
	public String validator(Model model) {
		model.addAttribute("ig", ig);
		return "validator";
	}

	@PostMapping("/validator")
  	public String ValidatorSubmit(@ModelAttribute Validator ig, Model model) {
		model.addAttribute("ig", ig);
		model.addAttribute("fhirVersion", fhirVersion);
		model.addAttribute("fileName", fileName);
		//Use session Management on Validator
		validatorcli cli = new org.hl7.fhir.validatorcli();

		return "result";
  }

}