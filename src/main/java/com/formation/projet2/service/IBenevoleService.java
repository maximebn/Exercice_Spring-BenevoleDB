package com.formation.projet2.service;

import java.util.List;

import com.formation.projet2.dto.BenevoleLight;
import com.formation.projet2.dto.BenevoleOne;
import com.formation.projet2.persistence.entity.Benevole;

public interface IBenevoleService {
	List<BenevoleLight> findAll();
	BenevoleOne findOne(long id);
	Benevole authentif(String login, String password);
}
