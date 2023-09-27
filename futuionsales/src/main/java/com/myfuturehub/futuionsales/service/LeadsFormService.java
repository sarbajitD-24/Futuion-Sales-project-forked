package com.myfuturehub.futuionsales.service;

import com.myfuturehub.futuionsales.converters.DtoConverter;
import com.myfuturehub.futuionsales.dto.LeadsFormDto;
import com.myfuturehub.futuionsales.entity.LeadsForm;
import com.myfuturehub.futuionsales.repository.LeadsFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeadsFormService {

    @Autowired
    private LeadsFormRepository leadsFormRepository;

    @Autowired
    private DtoConverter dtoConverter;

    public LeadsForm save(LeadsFormDto leadsFormDto){
       if(leadsFormDto != null){
           LeadsForm leadsForm = dtoConverter.leadsFormDtoToLeadsForm(leadsFormDto);
           leadsFormRepository.save(leadsForm);
           return leadsForm;
       }
       return null;
    }
}
