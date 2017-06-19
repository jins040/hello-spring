package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
public interface ArticleDao {

    //public은 default, implement 받을 클래스 메소드 명과 같아야 한다.
    void insertArticle(Article article);
    Article selectArticleById(String articleId);
    List<Article> selectAllArticles();

    void deleteArticle(String articleId);

    void updateArticle(String articleId, Article article);
}
