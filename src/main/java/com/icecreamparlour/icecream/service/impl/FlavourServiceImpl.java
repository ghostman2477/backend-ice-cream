package com.icecreamparlour.icecream.service.impl;

import com.icecreamparlour.icecream.dto.request.FlavourRequest;
import com.icecreamparlour.icecream.entity.FlavourEntity;
import com.icecreamparlour.icecream.repository.FlavourRepository;
import com.icecreamparlour.icecream.service.FlavourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlavourServiceImpl implements FlavourService {
    @Autowired
    private FlavourRepository flavourRepository;

    @Override
    public FlavourEntity saveFlavour(FlavourRequest flavourRequest) {
        FlavourEntity flavourEntity = new FlavourEntity();
        flavourEntity.setFlavour(flavourRequest.getFlavour());
        return flavourRepository.save(flavourEntity);
    }
}
