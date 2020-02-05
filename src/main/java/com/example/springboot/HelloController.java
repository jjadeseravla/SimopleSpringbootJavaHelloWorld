package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController //meaning it is ready for use by Spring MVC to handle web requests.
// @RestController combines @Controller and @ResponseBody, two annotations that
// results in web requests returning data rather than a view.
public class HelloController {

    @RequestMapping("/api")
    public String index() {
        return "Hello World";
    }

}
