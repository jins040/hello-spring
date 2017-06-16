package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
// 스프링 테스트(JUNIT 테스트보다 많이 사용)
@RunWith(SpringJUnit4ClassRunner.class)
//Bean 자동 생성(ApplicationContext), db.xml
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml", "classpath:spring/db.xml"})
public class ArticleDaoSpringJdbcTest {

    @Autowired
    private ArticleDaoSpringJdbc articleDao;

    @Test
    public void testInsertArticle() {
        Article article = new Article();
        article.setArticleId("8");
        article.setTitle("tc");
        article.setAuthor("kim");
        article.setContent("test case");
        articleDao.insertArticle(article);
    }

    @Test
    public void testSelectArticleById() {
        Article testArticle = articleDao.selectArticleById("3");
        System.out.println(testArticle);
        Assert.assertTrue(testArticle.getArticleId().equals("3"));
    }

    @Test
    public void testSelectAllArticles() {
        List<Article> testList = articleDao.selectAllArticles();
        Assert.assertTrue(testList.size() > 0);
        Assert.assertTrue(testList.get(0).getAuthor().equals("kim"));
    }
}
