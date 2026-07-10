package org.example.milk_more.controller;

import org.example.milk_more.wrapper.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("milkmore/test")
public class TestController {

    @GetMapping("/health-check")
    public ApiResponse<String> checkHealth(){
        return new ApiResponse<>("Health result",
                "Server running...healthy");
    }

}
