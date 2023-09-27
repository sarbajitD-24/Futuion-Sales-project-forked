package com.myfuturehub.futuionsales.converters;

import com.myfuturehub.futuionsales.dto.LeadsFormDto;
import com.myfuturehub.futuionsales.entity.LeadsForm;
import org.springframework.stereotype.Component;

@Component
public class DtoConverter {
    public LeadsForm leadsFormDtoToLeadsForm(LeadsFormDto leadsFormDto) {
        return new LeadsForm(null, leadsFormDto.getName(), leadsFormDto.getContact(), leadsFormDto.getEmail(),
                leadsFormDto.getLinkedInURL(), leadsFormDto.getPurpose(), leadsFormDto.getReminderCall1(),
                leadsFormDto.getReminderCallMessage1(), leadsFormDto.getReminderCall2(), leadsFormDto.getReminderCallMessage2(),
                leadsFormDto.getReminderCall3(), leadsFormDto.getReminderCallMessage3(),
                leadsFormDto.getStatus(), leadsFormDto.getCurrentDomain(), leadsFormDto.getEnquiryDate(),
                leadsFormDto.getFollowUpBy(), leadsFormDto.getFollowUpDate(), leadsFormDto.getEnquirySource(), leadsFormDto.getLocation(), leadsFormDto.getPassedOutYear(),
                leadsFormDto.getGraduatedStream(), leadsFormDto.getLastCompanyName(), leadsFormDto.getYearOfExperience(), leadsFormDto.getIsTrained(),
                leadsFormDto.getTrainedOn(), leadsFormDto.getCertifications(), leadsFormDto.getRemark());
    }
}
