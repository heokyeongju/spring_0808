package com.ll.exam.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/sbb")
    //  @ResponseBody : 함수의 return값을 화면에 보여줌
    @ResponseBody
    public String index(){
        System.out.println("hi there"); // 서버에서 출력
        return "hello"; // 브라우저에서 출력
    }
}
