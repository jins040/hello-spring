package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by danawacomputer on 2017-06-14.
 */
public class ArticleDaoTest {

    //공통되는 부분 수행 함수(먼저 수행된다, @Before 설정)
    private ApplicationContext context;

    @Before
    public void setup() {

        //ApplicationContext가 Spring Container
        //설정 파일 경로를 정할 때 dispatcherServlet.xml 파일 경로를 반영해야 하는데 실제로는 resources 패키지에 있어야 한다
        // => web/service 등에서 사용 하는 것들 분리 필요(web.xml에는 web에 대한 설정만)
        //dao는 applicationContext에 설정파일 존재
        context = new ClassPathXmlApplicationContext(
                        "classpath:spring/applicationContext.xml", "classpath:spring/db.xml"
        ); //설정 파일 경로

    }

    @Test
    public void testGetSum() {
        ArticleDao dao = context.getBean("articleDao", ArticleDao.class);

        //결과가 8이면 test 통과(getSum 클래스가 합 연산 수행하는 클래스)
        int result = dao.getSum(3, 5);

        Assert.assertEquals(8, result);

    }

    //테스트하려면 Junit library 필요, 스프링 버전이랑 맞춰줘야 한다(버전 4 이상)
    //좌측 녹색 화살표 누르면 실행, 문제 없으면 녹색 동그라미(실패하면 빨간색)
    @Test
    public void testInsertArticle() {

        ArticleDao dao = context.getBean("articleDao", ArticleDao.class);   //Spring container(context)에서 articleDao 가져오는 것

        Article article = new Article();
        article.setArticleId("3");
        article.setTitle("테스트케이스");
        article.setAuthor("tc");
        article.setContent("테스트입니다.");

        dao.insertArticle(article);   // Article이 들어가는지 테스트

    }

}
