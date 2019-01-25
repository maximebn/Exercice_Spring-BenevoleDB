package com.formation.projet2.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.projet2.dto.BenevoleOne;
import com.formation.projet2.dto.BenevoleLight;
import com.formation.projet2.exception.NotFoundException;
import com.formation.projet2.persistence.entity.Benevole;
import com.formation.projet2.persistence.repository.BenevoleRepository;
import com.formation.projet2.service.IBenevoleService;

@Service
@Transactional
public class BenevoleService implements IBenevoleService {
	
	@Autowired BenevoleRepository benevoleRepository;
	
	@Override
	public List<BenevoleLight> findAll() {
	List<Benevole> benevoles = benevoleRepository.findAll();

	return benevoles.stream()
			.map(b -> new BenevoleLight(b))
			.sorted((b1, b2) -> b2.getMontantCotisation().compareTo(b1.getMontantCotisation()))
			.collect(Collectors.toList());
	}

	@Override
	public BenevoleOne findOne(long id) {
		BenevoleOne item = new BenevoleOne();
		Optional<Benevole> opt = benevoleRepository.findById(id);
		if (opt.isPresent()) {
			item.setId(opt.get().getId());
			item.setNom(opt.get().getNom());
			item.setPrenom(opt.get().getPrenom());
			item.setMail(opt.get().getMail());
			item.setTelephone(opt.get().getTelephone());
			item.setPortable(opt.get().getPortable());
			item.setType(opt.get().getType());
			
			item.setListeCotisation(opt.get().getListeCotisation());
			
			return item;			
		} else {
			throw new NotFoundException("USER " + id + " WAS NOT FOUND !");
		}
	}
	
		/**
	 * Method to find a benevole associated to a login and a password using a specific method from benevole repo
	 */
	@Override
	public Benevole authentif(String login, String password) {
		Benevole b = benevoleRepository.findByLoginPass(login, password);
		return b;
		}
}