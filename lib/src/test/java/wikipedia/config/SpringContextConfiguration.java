package wikipedia.config;

import org.springframework.context.annotation.*;

@ComponentScan(basePackages = {"wikipedia.config", "wikipedia.pages", "wikipedia.runner", "wikipedia.steps", "wikipedia.utils"})
@Configuration
public class SpringContextConfiguration {

}
