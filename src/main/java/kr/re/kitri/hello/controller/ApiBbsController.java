package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-19.
 *
 * (API resful 에서는 url 경로에 동사를 쓰지 않는다.)
 *
 * /api/bbs             (GET{) .. 전체 보기
 * /api/bbs/{articleId} (GET) .. 상세 보기
 * /api/bbs             (POST) .. 글쓰기
 * /api/bbs/{articleId} (PUT) .. 글 수정
 * /api/bbs/{articleId} (DELETE) .. 글 삭제
 */
@RestController //모든 response가 json(@ResponseBody 필요 없다), 스프링 4.0 반영, 기존에 jsp로 넘어오던 data가 json으로 바뀐다.
@RequestMapping("/api/bbs")
public class ApiBbsController {

    @Autowired
    private BbsService bbsService;

    @GetMapping("")
    public List<Article> viewAll() {
        return bbsService.getArticles();
    }

    @GetMapping("/{articleId}")
    public Article viewDetail(@PathVariable String articleId) {
        return bbsService.viewArticle(articleId);
    }

    @PostMapping("")
    public String regist(@RequestBody Article article) {
        bbsService.registArticle(article);
        return "bbs/view_all";
    }

    @PutMapping("/{articleId}")
    public void modify(@PathVariable String articleId, @RequestBody Article article) {
        bbsService.modifyArticle(articleId, article);
    }

    @DeleteMapping("/{articleId}")
    public void remove(@PathVariable String articleId) {
        bbsService.removeArticle(articleId);
    }
}
