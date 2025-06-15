package com.icecreamparlour.icecream.service;

import com.icecreamparlour.icecream.dto.request.FlavourRequest;
import com.icecreamparlour.icecream.entity.BrandEntity;
import com.icecreamparlour.icecream.entity.FlavourEntity;
import org.springframework.stereotype.Service;

@Service
public interface FlavourService {

    FlavourEntity saveFlavour(FlavourRequest flavourRequest);
}
