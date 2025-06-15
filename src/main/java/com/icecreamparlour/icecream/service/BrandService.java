package com.icecreamparlour.icecream.service;

import com.icecreamparlour.icecream.dto.request.BrandRequest;
import com.icecreamparlour.icecream.entity.BrandEntity;
import com.icecreamparlour.icecream.entity.CategoryEntity;
import com.icecreamparlour.icecream.service.impl.BrandServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BrandService  {

    BrandEntity saveBrand(BrandRequest brandRequest);
}
