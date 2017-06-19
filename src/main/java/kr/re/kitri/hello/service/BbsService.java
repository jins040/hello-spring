package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.ArticleDao;
import kr.re.kitri.hello.dao.ArticleDaoJdbc;
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
    //Interface 이름으로 그냥 Autowired 해도 된다, dao가 바꿔도 service 수정이 필요 없다.(dao에서 쓰는 쪽에 repository 있기 때문)
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

    public List<Article> getArticles() {

        return dao.selectAllArticles();

    }

    /**
     * 상세 글 보기
     * @param articleId 글 번호
     * @return 글 객체
     */
    public Article viewArticle(String articleId) {

        return dao.selectArticleById(articleId);
    }

    public void removeArticle(String articleId) {
        dao.deleteArticle(articleId);
    }

    public void modifyArticle(String articleId, Article article) {
        dao.updateArticle(articleId, article);
    }
}
