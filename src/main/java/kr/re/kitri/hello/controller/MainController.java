package kr.re.kitri.hello.controller;

import org.springframework.stereotype.Controller;               //@Controller하면 자동 생성
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by danawacomputer on 2017-06-09.
 */

@Controller                     //다 만들고 dispatchersurvlet에 MainController bean 등록
public class MainController {   //잘 등록되었으면 좌측에 초록색 bean으로 나온다.

    @RequestMapping("/")        //요청하는 주소(/는 root), 톰캣은 localhost 8080에 떠있다. (404에러는 인식 못했다는 것)
    public String index() {
        return "index";         //index.jsp파일 요청(dispatcherServlet에서 suffix로 세팅, /WEB-INF/views/경로에 있는, WEB-INF 아래 views 디렉토리 만들고 index.jsp파일 만들어줘야 한다.)
    }                           //root를 요청하면 index 응답

    @RequestMapping
    public String test() {
        return "test";
    }



}
