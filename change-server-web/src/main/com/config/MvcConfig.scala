package config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.{ViewControllerRegistry, WebMvcConfigurerAdapter}

@Configuration
class MvcConfig extends WebMvcConfigurerAdapter {
  override def addViewControllers(registry: ViewControllerRegistry) {
    //registry.addViewController("/home").setViewName("home");
    //registry.addViewController("/login").setViewName("login");
  }
}