package change

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.{ComponentScan, Configuration}
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity

@Configuration
@EnableAutoConfiguration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@ComponentScan
class SampleConfig