package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.common.MockArticle;
import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

    @Autowired                  //멤버 변수를 자동으로 메모리에 할당해주는 설정, Dependency 생성
    private BbsService service; //service 패키지에서 @service 설정하여 managed되도록
                                //Controller는 무조건 service를 호출한다.

    @RequestMapping("/bbs")
    public ModelAndView viewAll() {

        //전체보기를 하기 위한 데이터를 가져온다.
        MockArticle mock = new MockArticle();
        List<Article> list = mock.getArticles();

        return new ModelAndView("bbs/view_all").addObject("list", list);    //선호되는 코드 방식, 한 번에 처리
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

    /*
     *  Commander 객체 (Naming Convention 맞춰줘야 한다, request_write에서 통일, do_write에서 ${article.변수} 형태로 해줘야 한다.)
     */
    @RequestMapping(value = "/bbs/write", method = RequestMethod.POST)
    public ModelAndView doWrite(Article article) {

        System.out.println(article);

        //BbsService service = new BbsService();를 컨트롤러의 멤버변수로(매번 new 하지 않기 위해)
        service.registArticle(article);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/do_write");
        mav.addObject("article", article);

        return mav;
    }


//    @RequestMapping(value = "/bbs/write", method = RequestMethod.POST)        //request_write에서 form에 method="post" 확인
//    public ModelAndView doWrite(@RequestParam("article_id") String articleId,
//                          @RequestParam("title") String title,
//                          @RequestParam("author") String author,
//                          @RequestParam("content") String content) {
//
//        System.out.println(articleId);
//        System.out.println(title);
//        System.out.println(author);
//        System.out.println(content);
//
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("bbs/do_write");                        //do_write.jsp 페이지로 아래 값들을 받는다.
//        mav.addObject("articleId", articleId);
//        mav.addObject("title", title);
//        mav.addObject("author", author);
//        mav.addObject("content", content);
//
//        return mav;
//    }


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
