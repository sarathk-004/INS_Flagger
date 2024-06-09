package com.insFlagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.insFlagger.model.ShipDetails;
import com.insFlagger.repositories.ShipDetailsRepository;

@Controller
public class ShipDetailsController {

	@Autowired
	ShipDetailsRepository shipDetailsRepository;
	
	@GetMapping("/shipDetails")
	public String getShipDetails(@ModelAttribute("shipDetails") ShipDetails shipDetails) {
		return "shipDetails";
	}
	
	@PostMapping("/shipDetails")
	public String saveShipDetails(@ModelAttribute("shipDetails") ShipDetails shipDetails, Model model) {
		shipDetailsRepository.save(shipDetails);
		model.addAttribute("message", "Ship Details is Created / Updated successfully");
		return "shipDetails";
	}
	
	@GetMapping("/shipsList") 
	public String shipsPage(Model model) {
	List<ShipDetails> listOfShips = shipDetailsRepository.findAll();
	model.addAttribute("shipDetails", listOfShips); return "shipsList"; 
	}
	
	@GetMapping("/shipsFlaggingDetails") 
	public String shipsFlaggingPage(Model model) {
	List<ShipDetails> listOfShips = shipDetailsRepository.findAll();
	model.addAttribute("shipDetails", listOfShips); 
	return "shipsFlaggingDetails"; 
	}
	
	@GetMapping("/shipsFlagging") 
	public String getShipsListFlaggingPage(@ModelAttribute("shipDetails") ShipDetails shipDetails) 
	{ 
		return "shipsFlagging"; 
	}
	
	@PostMapping("/shipsFlagging") 
	public String flagAShip(@ModelAttribute("shipDetails") ShipDetails shipDetails, Model model) {
		shipDetailsRepository.save(shipDetails);
		model.addAttribute("message", "Ship Details is Created / Updated successfully");
		return"shipsFlagging"; 
	}
	 

	
}
