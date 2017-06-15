package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Amigo;
import kr.re.kitri.hello.service.AmigoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-12.
 *
 * /amigo .. 친구 전체 보기
 * /amigo/regist (GET) .. 친구 등록 화면으로 이동
 * /amigo/regist (POST) .. 친구 등록
 * /amigo/{id} .. 친구 상세 보기
 * /amigo/{id}/modify (GET) .. 친구 수정하기 화면으로 이동
 * /amigo/{id}/modify (POST) .. 친구 수정하기
 * /amigo/{id}/remove (GET) .. 친구 삭제하기
 */
@Controller
@RequestMapping("/amigo")
public class AmigoController {

    @Autowired
    private AmigoService service;

    @RequestMapping("")
    public ModelAndView amigoInit() {

        List<Amigo> amigoList = service.getAmigos();

        return new ModelAndView("amigo/amigo_init").addObject("amigoList", amigoList);
    }

    @RequestMapping("/{amigoName}")
    public ModelAndView amigoDetail(@PathVariable("amigoName") String amigoName) {

        Amigo amigo = service.viewDetailAmigo(amigoName);

        return new ModelAndView("amigo/amigo_detail").addObject("amigo", amigo);
    }

    /**
     * 친구 등록 화면 이동
     */
    @GetMapping("/regist")
    public String amigoReg() {
        return "amigo/amigo_regist";
    }

    /**
     * 친구 등록 수행
     * @param amigo
     */
    @PostMapping("/regist")
    public ModelAndView amigoGo(Amigo amigo) {

        service.registAmigo(amigo);

        return new ModelAndView("amigo/regist_ok").addObject("amigo", amigo);

    }

//    //원래 Default는 GET 방식, 둘 다 세팅 가능(GET, POST로)
//    @RequestMapping(value = "/amigo/regist", method = RequestMethod.GET)
//    public String amigoReg() {
//        return "amigo/amigo_regist";
//    }
//
//    //이대로 하면 한글 깨진다(톰캣에 한글 쓰려면 필터 필요하다, web.xml에서 <filter> 설정)
//    @RequestMapping(value = "/amigo/regist", method = RequestMethod.POST)   //amigo_regist에서 form도 바꿔줘야 한다.
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
//        mav.setViewName("amigo/amigo_go");
//        mav.addObject("amigoName", amigoName);
//        mav.addObject("phoneNum", phoneNum);
//        mav.addObject("email", email);
//
//        return mav;
//    }

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
