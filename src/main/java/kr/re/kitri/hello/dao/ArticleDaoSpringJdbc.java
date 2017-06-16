package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

        String query =
                "select article_id, title, author, content\n" +
                        "from article\n" +
                        "where article_id = ?;";

        return jdbcTemplate.queryForObject(query, new RowMapper<Article>() {        //익명 클래스
            @Override
            public Article mapRow(ResultSet rs, int rowNum) throws SQLException {
                Article article = new Article();
                article.setArticleId(rs.getString(1));
                article.setTitle(rs.getString(2));
                article.setAuthor(rs.getString(3));
                article.setContent(rs.getString(4));
                return article;
            }
        }, Integer.parseInt(articleId));

//        //람다식 표현
//        return jdbcTemplate.queryForObject(query,
//                (rs, rowNum) -> {
//                    Article article = new Article();
//                    article.setArticleId(rs.getString(1));
//                    article.setTitle(rs.getString(2));
//                    article.setAuthor(rs.getString(3));
//                    article.setContent(rs.getString(4));
//                    return article;
//                }, Integer.parseInt(articleId));
    }

    @Override
    public List<Article> selectAllArticles() {

        String query = "select article_id, title, author, content from article;";

        return jdbcTemplate.query(query, (rs, rowNum) -> {
                Article article = new Article();
                article.setArticleId(rs.getString(1));
                article.setTitle(rs.getString(2));
                article.setAuthor(rs.getString(3));
                article.setContent(rs.getString(4));
                return article;
            });
    }

}
