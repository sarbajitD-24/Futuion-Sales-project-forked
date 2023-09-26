package com.myfuturehub.futuionsales.entity;

import com.myfuturehub.futuionsales.enums.LeadStatus;
import com.myfuturehub.futuionsales.enums.ReminderCall;
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
    private ReminderCall RC1; //reminder call
    private ReminderCall RC2;
    private ReminderCall RC3;
    private LeadStatus status;
    private String currentDomain;
    private Date enquiryDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_name")
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
