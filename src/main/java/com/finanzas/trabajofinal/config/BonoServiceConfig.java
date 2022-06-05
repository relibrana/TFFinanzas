package com.finanzas.trabajofinal.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BonoServiceConfig {
    @Bean
    public ModelMapper modelMapperPatient(){return new ModelMapper();}
}
