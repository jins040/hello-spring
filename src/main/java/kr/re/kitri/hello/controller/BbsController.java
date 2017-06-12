package kr.re.kitri.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * /bbs ..전체보기
 * /bbs/15 ..상세보기(15번 글)
 * /bbs/15/modify ..수정(15번 글 수정)
 * /bbs/15/remove ..삭제(15번 글 삭제), http method 중에 delete가 있다.
 *
 * /bbs/write ..글 작성화면 요청
 * /bbs/write/do ..글 작성하기
 */

@Controller                     //컨트롤러 annotation 달고 diapatcher Servlet에 등록
public class BbsController {

    @RequestMapping("/bbs")
    public String viewAll() {
        return "bbs/view_all";
    }

    @RequestMapping("/bbs/{articleID}")             //경로 변수={요청변수}, DB에서 글을 조회해올 때 사용
    public ModelAndView viewDetail(@PathVariable("articleID") String articleID) {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/view_detail");
        mav.addObject("articleID", articleID);

        return mav;
    }

    @RequestMapping(value = "/bbs/write", method = RequestMethod.GET)
    public String write() {
        return "bbs/request_write";
    }

    @RequestMapping(value = "/bbs/write", method = RequestMethod.POST)
    public ModelAndView doWrite(@RequestParam("article_id") String articleId,
                          @RequestParam("title") String title,
                          @RequestParam("author") String author,
                          @RequestParam("content") String content) {

        System.out.println(articleId);
        System.out.println(title);
        System.out.println(author);
        System.out.println(content);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/do_write");                        //do_write.jsp 페이지로 아래 값들을 받는다.
        mav.addObject("articleId", articleId);
        mav.addObject("title", title);
        mav.addObject("author", author);
        mav.addObject("content", content);

        return mav;
    }

//    @RequestMapping("/bbs/write/do")                      // 많이 쓰는 방법은 아니다.
//    public String doWrite(HttpServletRequest request) {
//
//        String articleId = request.getParameter("article_id");  // jsp에서는 under-bar로, 자바 변수는 carmel표기법
//        String title = request.getParameter("title");
//        String author = request.getParameter("author");
//        String content = request.getParameter("content");
//
//        System.out.println(articleId);
//        System.out.println(title);
//        System.out.println(author);
//        System.out.println(content);
//
//        return "do_write";
//    }

}
