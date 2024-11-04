package pe.bn.com.mgtt.transversal.configuration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pe.bn.com.mgtt.transversal.util.vista.ViewScope;

@Configuration
@ComponentScan(basePackages = { "pe.bn.com.mgtt.application.view",
		"pe.bn.com.mgtt.transversal.util.componentes" })
public class WebMvcConfig {

	@Bean(name = "scopes")
	public Map<String, Object> scopes() {
		Map<String, Object> scopes = new HashMap<String, Object>();
		scopes.put("view", new ViewScope());
		return scopes;
	}

	@Bean(name = "customScopeConfigurer")
	public CustomScopeConfigurer customScopeConfigurer() {
		CustomScopeConfigurer customScopeConfigurer = new CustomScopeConfigurer();
		customScopeConfigurer.setScopes(scopes());
		return customScopeConfigurer;
	}

}
