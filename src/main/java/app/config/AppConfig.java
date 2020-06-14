package app.config;

import app.model.Animal;
import app.model.AnimalsCage;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean(name="Dog")
    public Animal Dog() {
        return new Dog();
    }

    @Bean(name="Timer")
    public Timer getTime() {
        return new Timer();
    }

}
