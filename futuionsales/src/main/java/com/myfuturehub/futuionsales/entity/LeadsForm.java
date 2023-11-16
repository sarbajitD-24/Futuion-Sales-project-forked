package com.myfuturehub.futuionsales.entity;

import com.myfuturehub.futuionsales.enums.LeadStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeadsForm extends MasterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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
    private String followUpBy;
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