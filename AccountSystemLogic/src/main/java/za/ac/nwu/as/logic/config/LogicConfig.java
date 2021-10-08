package za.ac.nwu.as.logic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import translator.config.TranslatorConfig;

@Import({TranslatorConfig.class})
@Configuration
public class LogicConfig {
}
