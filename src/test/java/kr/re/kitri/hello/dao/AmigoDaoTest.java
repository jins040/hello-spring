package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Amigo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by danawacomputer on 2017-06-15.
 */
public class AmigoDaoTest {

    private ApplicationContext context;

    @Before
    public void setup() {
        context = new ClassPathXmlApplicationContext(
                "classpath:spring/applicationContext.xml", "classpath:spring/db.xml"
        );
    }

    @Test
    public void testInsertAmigo() {

        AmigoDao dao = context.getBean("amigoDao", AmigoDao.class);

        Amigo amigo = new Amigo();
        amigo.setAmigoName("르브론");
        amigo.setPhoneNum("010-2314-4144");
        amigo.setEmail("nba@gmail.com");

        dao.insertAmigo(amigo);


    }
}
