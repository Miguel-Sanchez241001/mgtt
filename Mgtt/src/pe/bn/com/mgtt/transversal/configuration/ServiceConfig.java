package pe.bn.com.mgtt.transversal.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"pe.bn.com.mgtt.infrastructure.service.external.impl",
		"pe.bn.com.mgtt.infrastructure.service.internal.impl",
		"pe.bn.com.mgtt.infrastructure.facade"})
public class ServiceConfig {

}