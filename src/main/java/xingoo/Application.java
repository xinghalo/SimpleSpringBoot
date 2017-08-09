package xingoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import xingoo.configuration.ApplicationConfiguration;

/**
 * Created by xinghailong on 2017/7/21.
 */
@SpringBootApplication // 代替上面三个接口
@Import(ApplicationConfiguration.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
