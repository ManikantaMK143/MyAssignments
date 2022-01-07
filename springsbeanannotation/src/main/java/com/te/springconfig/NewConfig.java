package com.te.springconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.te.springsbeanannotation","com.te.somthing","com.te.springtest"})
public class NewConfig {

}
