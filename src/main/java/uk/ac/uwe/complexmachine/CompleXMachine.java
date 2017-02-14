package uk.ac.uwe.complexmachine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Clare Daly
 * @version alpha-0.1
 * @since alpha-0.1
 */
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan("uk.ac.uwe.complexmachine")
public class CompleXMachine {
    public static void main(String[] args) {
        SpringApplication.run(CompleXMachine.class, args);
    }
}
