package org.endless.fanli.component.game.eve.ui.driving.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class test {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
