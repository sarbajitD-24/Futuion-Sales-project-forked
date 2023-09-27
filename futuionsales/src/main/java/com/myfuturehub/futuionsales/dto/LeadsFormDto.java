package com.myfuturehub.futuionsales.dto;

import com.myfuturehub.futuionsales.entity.User;
import com.myfuturehub.futuionsales.enums.LeadStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeadsFormDto {
    private String name;
    private String contact;
    private String email;
    private String linkedInURL;
    private String purpose;
    private Date reminderCall1;
    private String reminderCallMessage1;
    private Date reminderCall2;
    private String reminderCallMessage2;
    private Date reminderCall3;
    private String reminderCallMessage3;
    private LeadStatus status;
    private String currentDomain;
    private Date enquiryDate;
    private User followUpBy;
    private Date followUpDate;
    private String enquirySource;
    private String location;
    private String passedOutYear;
    private String graduatedStream;
    private String lastCompanyName;
    private String yearOfExperience;
    private Boolean isTrained;
    private String trainedOn;
    private String certifications;
    private String remark;

}
