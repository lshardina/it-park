package lesson29.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Locale;

@Data
@Component
@Validated //проверять значения, вводимые пользователем
@ConfigurationProperties("application") // указываем раздел в application.yaml
public class ApplicationProperties {

    @NotNull // обязательность, проверяется валидацией
    private Integer value;  //это берется из application.yaml

    private SettingsProperties setting; //это берется из application.yaml

    @Data
//    @ConfigurationProperties("settings")
    public static class SettingsProperties {
        private String name;  //это берется из application.yaml
        private Resource file;//это берется из application.yaml
        private Locale locale; //это берется из application.yaml
        private List<String> lines; //это берется из application.yaml
    }
}