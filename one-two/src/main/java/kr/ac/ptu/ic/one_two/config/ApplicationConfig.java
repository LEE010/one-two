package kr.ac.ptu.ic.one_two.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = { "kr.ac.ptu.ic.one_two.dao",  "kr.ac.ptu.ic.one_two.service"})
@Import({ DBConfig.class })
public class ApplicationConfig {

}