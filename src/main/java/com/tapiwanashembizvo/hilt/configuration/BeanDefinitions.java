package com.tapiwanashembizvo.hilt.configuration;


import com.tapiwanashembizvo.hilt.mappers.BranchMapper;
import com.tapiwanashembizvo.hilt.mappers.BusinessUnitMapper;
import com.tapiwanashembizvo.hilt.mappers.EmployeeMapper;
import com.tapiwanashembizvo.hilt.mappers.ProductCategoryMapper;
import com.tapiwanashembizvo.hilt.services.messaging.BusinessCoreMessaging;
import com.tapiwanashembizvo.hilt.services.messaging.impl.SendEmailService;
import com.tapiwanashembizvo.hilt.services.messaging.impl.SendSMSService;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDefinitions {


    @Bean("emailMessaging")
    public BusinessCoreMessaging businessEmailMessaging() {
        return new SendEmailService();
    }

    @Bean("smsMessaging")
    public BusinessCoreMessaging businessSMSMessaging() {
        return new SendSMSService();
    }

    @Bean
    public BusinessUnitMapper businessUnitMapper() {

        return Mappers.getMapper(BusinessUnitMapper.class);
    }

    @Bean
    public BranchMapper branchMapper() {

        return Mappers.getMapper(BranchMapper.class);
    }

    @Bean
    public EmployeeMapper employeeMapper() {

        return Mappers.getMapper(EmployeeMapper.class);
    }@Bean
    public ProductCategoryMapper productCategoryMapper() {

        return Mappers.getMapper(ProductCategoryMapper.class);
    }
}
