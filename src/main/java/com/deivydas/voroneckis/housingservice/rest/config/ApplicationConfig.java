/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deivydas.voroneckis.housingservice.rest.config;

/**
 *
 * @author vdeiv
 */
import com.deivydas.voroneckis.service.HousingFacade;
import com.deivydas.voroneckis.service.IHousingFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.deivydas.voroneckis.housingservice.rest.controller")
@EnableWebMvc
public class ApplicationConfig {

    @Bean(destroyMethod="closeConnection")
    public IHousingFacade service() {
        return new HousingFacade("JSP");
    }
}

