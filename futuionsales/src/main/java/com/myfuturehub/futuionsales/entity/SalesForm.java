package com.myfuturehub.futuionsales.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Entity
@NoArgsConstructor@Data
public class SalesForm extends MasterEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String contact;
    private String email;
    private String linkedInURL;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private List<Product> product;
    private Double agreedSalesAmount;
    private Double paidAmount;
    private Date dueDate;
}
