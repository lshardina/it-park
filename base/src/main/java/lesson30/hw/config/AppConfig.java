package lesson30.hw.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("lesson30.hw.model")
public class AppConfig {
}
