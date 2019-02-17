package benchmark.homepage;

import org.springframework.core.Ordered;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configure the welcome page
 * 
 */

@Configuration
public class DefaultViewConfig implements WebMvcConfigurer {

	/**
	 * Redirect a user to the welcome page when he visits /home
	 */

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("/homepage.html");
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static.html").addResourceLocations("classpath:/static/");
		registry.addResourceHandler("/statik/**").addResourceLocations("classpath:/statik/");
	}
}
