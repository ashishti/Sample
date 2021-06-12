package com.docker.sample.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/get")
public class Welcome {

   @GetMapping
    public String Welcome()
    {
        return "============Testing Spring Web application =========== Thank you...!!!!========= ";

    }
}
