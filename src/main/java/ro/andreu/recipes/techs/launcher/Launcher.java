package ro.andreu.recipes.techs.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "ro.andreu.recipes.techs")
public class Launcher {
    public static void main( String[] args )
    {
        SpringApplication.run(Launcher.class, args);
    }
}
