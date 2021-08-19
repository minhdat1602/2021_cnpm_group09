package com.nlu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlu.entity.CardEntity;
import com.nlu.repository.CardRepository;
import com.nlu.service.ICardService;

@Service
public class CardService implements ICardService {
	@Autowired
	CardRepository cardRepository;

	@Override
	public CardEntity saveAndFush(CardEntity cardEntity) {
		// TODO Auto-generated method stub
		return cardRepository.saveAndFlush(cardEntity);
	}

}
