package wikipedia.utils;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
@Data
@EnableConfigurationProperties
public class ApplicationProperties {

    @Value("${url}")
    private String url;

    @Value("${browser}")
    private String browser;

    @Value("${dockerHost}")
    private String dockerHost;

    @Value("${seleniuimPort}")
    private String seleniumPort;

    @Value("${timeout}")
    private int timeout;

    @Value("${context}")
    private String context;

}
