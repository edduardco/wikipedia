package wikipedia.config;

import org.springframework.context.annotation.*;

@ComponentScan(basePackages = {"travelocity.config", "travelocity.pages", "travelocity.runner", "travelocity.steps", "travelocity.utils"})
@Configuration
public class SpringContextConfiguration {

}
