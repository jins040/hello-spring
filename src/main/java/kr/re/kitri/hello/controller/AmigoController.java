package kr.re.kitri.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by danawacomputer on 2017-06-12.
 */
@Controller
public class AmigoController {

    @RequestMapping("/amigo")
    public String amigoInit() {
        return "amigo/amigo_init";
    }

    @RequestMapping("/amigo/{articleId}")
    public ModelAndView amigoDetail(@PathVariable("articleId") String articleId) {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("amigo/amigo_detail");
        mav.addObject("articleID", articleId);

        return mav;
    }

    //원래 Default는 GET 방식, 둘 다 세팅 가능(GET, POST로)
    @RequestMapping(value = "/amigo/regist", method = RequestMethod.GET)
    public String amigoReg() {
        return "amigo/amigo_regist";
    }

    //이대로 하면 한글 깨진다(톰캣에 한글 쓰려면 필터 필요하다, web.xml에서 <filter> 설정)
    @RequestMapping(value = "/amigo/regist", method = RequestMethod.POST)   //amigo_regist에서 form도 바꿔줘야 한다.
    public ModelAndView amigoGo(
            @RequestParam("amigo_name") String amigoName,
            @RequestParam("phone_num") String phoneNum,
            @RequestParam("email") String email         //모든 Naming Convention을 똑같이 하면 (" ")부분 생략 가능
    ) {

        System.out.println(amigoName);
        System.out.println(phoneNum);
        System.out.println(email);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("amigo/amigo_go");
        mav.addObject("amigoName", amigoName);
        mav.addObject("phoneNum", phoneNum);
        mav.addObject("email", email);

        return mav;
    }

//    @RequestMapping("/amigo/regist/go")
//    public ModelAndView amigoGo(
//            @RequestParam("amigo_name") String amigoName,
//            @RequestParam("phone_num") String phoneNum,
//            @RequestParam("email") String email         //모든 Naming Convention을 똑같이 하면 (" ")부분 생략 가능
//    ) {
//
//        System.out.println(amigoName);
//        System.out.println(phoneNum);
//        System.out.println(email);
//
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("amigo_go");
//        mav.addObject("amigoName", amigoName);
//        mav.addObject("phoneNum", phoneNum);
//        mav.addObject("email", email);
//
//        return mav;
//    }
}
