package pe.bn.com.mgtt.transversal.configuration.init;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"pe.bn.com.mgtt.transversal.configuration",
		"pe.bn.com.mgtt.transversal.util.anotaciones"})
public class ApplicationContextInitializer {

}

