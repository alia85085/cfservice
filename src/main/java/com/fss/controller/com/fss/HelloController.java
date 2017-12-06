package com.fss.controller.com.fss;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by asif on 10/12/17.
 */

@RestController
public class HelloController {

    @Autowired
    Environment environment;
    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value="/message", method = RequestMethod.GET)
    public String index(@RequestParam("name") String name, @RequestParam("description") String desc)  {
        logger.info("Inside service message");
        return name + " " + desc;

    }

    class Message{
        public Message (String name, String description){
            this.name = name;
            this.description = description;
        }

        String name;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        String description;


    }
}
