package com.zb.demo.api;

import com.zb.demo.sample.Hzro;
import com.zb.demo.sample.zero.Diana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banner")
public class BannerController {

    @Autowired
    private Hzro skill;

    @GetMapping("/test")
    public String test() {
        skill.r();
        return "Hello, zb";
    }
}
