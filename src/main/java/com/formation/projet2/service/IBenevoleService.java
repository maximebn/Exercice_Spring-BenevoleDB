package com.formation.projet2.service;

import java.util.List;

import com.formation.projet2.dto.BenevoleLight;
import com.formation.projet2.dto.BenevoleOne;

public interface IBenevoleService {
	List<BenevoleLight> findAll();
	BenevoleOne findOne(long id);
}
