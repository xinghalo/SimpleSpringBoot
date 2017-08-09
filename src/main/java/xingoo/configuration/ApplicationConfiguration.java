package xingoo.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 应用主配置
 */
@Configuration
@EnableAutoConfiguration
@ImportResource(locations={"classpath:application-context.xml"})
public class ApplicationConfiguration {

}
