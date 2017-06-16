package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
@Repository //사용할 Dao 클래스만 repository 사용해주고 나머지는 풀어준다.
public class ArticleDaoSpringJdbc implements ArticleDao{

    @Autowired                          //사전 등록한 bean 자동 주입
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertArticle(Article article) {

        String query =
                "insert into article(article_id, title, author, content)\n" +
                        "VALUES (?, ?, ?, ?);";

        jdbcTemplate.update(query,
                Integer.parseInt(article.getArticleId()),
                article.getTitle(),
                article.getAuthor(),
                article.getContent());

    }

    @Override
    public Article selectArticleById(String articleId) {
        return null;
    }

    @Override
    public List<Article> selectAllArticles() {
        return null;
    }
}
