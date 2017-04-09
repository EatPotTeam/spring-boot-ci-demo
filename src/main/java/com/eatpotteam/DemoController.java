package com.eatpotteam;

import com.eatpotteam.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/demos")
public class DemoController {
    @GetMapping(path = "/newone")
    public Demo getDemo() {
        return new Demo("Demo");
    }
}
