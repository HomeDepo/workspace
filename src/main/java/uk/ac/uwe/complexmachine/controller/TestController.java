package uk.ac.uwe.complexmachine.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Clare Daly
 * @version alpha-0.1
 * @since alpha-0.1
 */
@RestController
public class TestController {
    @RequestMapping("/welcome")
    public String index() {
        return "Welcome to compleX-Machine";
    }
}
