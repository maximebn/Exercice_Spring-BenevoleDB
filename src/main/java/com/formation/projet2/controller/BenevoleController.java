package com.formation.projet2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.formation.projet2.dto.BenevoleLight;
import com.formation.projet2.service.IBenevoleService;

@RestController
@RequestMapping(value="/api/public/benevole")
public class BenevoleController {
	@Autowired IBenevoleService benevoleService;
	
	@GetMapping
	@ResponseBody
	public List<BenevoleLight> findAll() {
		return benevoleService.findAll();
}
}