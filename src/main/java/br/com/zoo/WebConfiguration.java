package br.com.zoo;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "br.com.zoo")
@Configuration
public class WebConfiguration {

}