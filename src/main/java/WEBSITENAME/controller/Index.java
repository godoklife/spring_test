package WEBSITENAME.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // @Controller : 컨트롤 어노테이션 : MVC 중 C에 해당하는 데이터 주입
public class Index {
    @GetMapping("/")    // @GetMapping : URL 매핑 어노테이션 [ 클라이언트가 요청한 URL와 연결 ]
    public String index(Model model){  // main문자열을 리턴하는 메서드
        // 인수에 모델 인터페이스 넣어줄것.
        model.addAttribute("data","java데이터");

        return "main";  // 실제로는 단순한 문자열이 아닌, html 파일명이 위치해야 함. ->> 타임리프를 사용할 경우
            // 1. 클라이언트가 localhost:8080 요청 시 Spring이 controll내에서 매핑된 url을 찾음.
            // 2. 찾으면 매핑된 메서드 실행되면서 html 파일명 반환
    }
    // http 요청 메서드 
        // @GetMapping("/")
        // @PostMapping("/")


    @GetMapping("/getdata")
    @ResponseBody
    public String getdata(){
        return "java데이타";
    }
}
