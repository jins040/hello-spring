package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.ArticleDao;
import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 기능을 수행하는 클래스
 * 각 메소드는 해당 기능을 수행한다.
 */

@Service //관리받을 수 있도록 설정
public class BbsService {

    //sevice는 dao(repository, Data Access Object)를 호출한다.
    @Autowired
    private ArticleDao dao;

    // /**하고 enter
    /**
     * 글쓰기
     * @param article
     */
    public void registArticle(Article article) {

//        ArticleDao dao = new ArticleDao();
        dao.insertArticle(article);

    }

    /**
     * 글 전체 보기
     * @return 전체 글
     */
    public List<Article> viewArticles() {


        return null;
    }

    /**
     * 상세 글 보기
     * @param articleID 글 번호
     * @return 글 객체
     */
    public Article viewArticle(String articleID) {

        return null;
    }

}
