package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by danawacomputer on 2017-06-14.
 */
@Repository
public class ArticleDao {

    @Autowired
    private DataSource dataSource;

    /*
     * Controller에서 service 호출하고 service에서 다시 dao 호출 순서
     */

    public int getSum(int a, int b) {
        return a + b;
    }

    public void insertArticle(Article article) {

        try {

            //1. Connection 확보
            Connection conn = dataSource.getConnection();
            System.out.println("connection ok...");

            //2. 쿼리 생성 = PreparedStatement 생성
            String query =
                    "insert into article(article_id, title, author, content)\n" +
                    "VALUES (?, ?, ?, ?);";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setInt(1, Integer.parseInt(article.getArticleId()));
            pstmt.setString(2, article.getTitle());
            pstmt.setString(3, article.getAuthor());
            pstmt.setString(4, article.getContent());

            pstmt.executeUpdate();

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
