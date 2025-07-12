package net.aisw.firstPro;

import org.springframework.stereotype.Controller; // spring type 의 컨트롤러를 만들기 위해서 
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 이 클래스가 스프링의 컨트롤러 컴포넌트임을 표시합니다
public class HelloSpringBoot {
//  @PostMapping("/hello") // POST 요청을 처리할 매핑 
    @GetMapping("/hello") // GET 요청을 처리할 매핑
    @ResponseBody // 반환 값을 뷰가 아닌 HTTP 응답 본문으로 직접 보내도록 지정합니다
    public String HelloMain() {
        System.out.print("hello spring boot");  // 콘솔에 LOG를 출력합니다 (첫 번째 출력)
        System.out.print("hello spring boot");  // 콘솔에 LOG을 출력합니다 (두 번째 출력)
        
        // 실행 방법:
        // 1> 브라우저에서 http://localhost:8080/hello 로 접속
        // 2> 브라우저에서 http://127.0.0.1:8080/hello 로 접속
        
        return "Hello Spring";
    }
}

/*
GetMapping 
 --> www.navar.com/abc?a=1&b=&c=11
 
 PostMapping
  --> (url 글자수 제한 255)
  --> URL뒤에 어떠한 인자를 보내지 않고, form 태그 내의 값을 전송 
 	<form>
  		<input type="hidden" >
*/



