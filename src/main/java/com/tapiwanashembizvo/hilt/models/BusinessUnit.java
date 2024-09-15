package com.tapiwanashembizvo.hilt.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Entity
@Table(name = "business_unit")
@Getter
@Setter
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
