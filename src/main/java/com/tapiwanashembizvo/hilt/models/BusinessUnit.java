package com.tapiwanashembizvo.hilt.models;


import jakarta.persistence.*;

@Entity
@Table(name = "business_unit")
public class BusinessUnit {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer businessId;
    private String businessName;
    private String businessAddress;
    private String businessEmail;
    private String businessPhone;
    private  String businessWebsite;



}
