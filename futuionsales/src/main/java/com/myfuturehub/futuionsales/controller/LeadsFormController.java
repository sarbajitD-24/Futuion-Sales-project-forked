package com.myfuturehub.futuionsales.controller;

import com.myfuturehub.futuionsales.dto.AppResponse;
import com.myfuturehub.futuionsales.dto.LeadsFormDto;
import com.myfuturehub.futuionsales.entity.LeadsForm;
import com.myfuturehub.futuionsales.service.LeadsFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lead/")
public class LeadsFormController {

    @Autowired
    private LeadsFormService leadsFormService;

    @PostMapping("/save")
    @PreAuthorize("hasAuthority('admin')")
    public AppResponse saveLeadsForm(@RequestBody LeadsFormDto leadsFormDto){
        LeadsForm leadsForm = leadsFormService.save(leadsFormDto);
        if(leadsForm != null){
            return new AppResponse(HttpStatus.CREATED, "Leads Form created successfully");
        }
        return new AppResponse(HttpStatus.BAD_REQUEST, "Invalid Form");
    }

}
