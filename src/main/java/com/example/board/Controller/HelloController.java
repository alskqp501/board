package com.example.board.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 줌
// @Controller와 @ResponseBody 두 개를 합친 어노테이션
public class HelloController {
    @GetMapping("/test")
    public String test(){
        return "Hell World";
    }
}
