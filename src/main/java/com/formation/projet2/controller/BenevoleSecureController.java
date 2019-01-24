package com.formation.projet2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.formation.projet2.dto.BenevoleOne;
import com.formation.projet2.exception.UnauthorizedException;
import com.formation.projet2.service.IBenevoleService;
import com.formation.projet2.utils.AuthChecker;

@RestController
@RequestMapping(value="/api/private/benevole")
public class BenevoleSecureController {
	
	@Autowired IBenevoleService benevoleService;
	
	@Autowired private AuthChecker authChecker;
	
	@GetMapping(value = "/{id}")
	@ResponseBody
	public BenevoleOne findOne(@PathVariable long id) {
		if (authChecker.isBenevole() == null) throw new UnauthorizedException();
		return benevoleService.findOne(id);
	}
}
