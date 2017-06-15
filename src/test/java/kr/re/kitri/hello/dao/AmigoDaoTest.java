package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Amigo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-15.
 */
// 스프링 테스트(JUNIT 테스트보다 많이 사용)
@RunWith(SpringJUnit4ClassRunner.class)
//Bean 자동 생성(ApplicationContext), db.xml
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml", "classpath:spring/db.xml"})
public class AmigoDaoTest {

    @Autowired
    private AmigoDao amigoDao;

    @Test
    public void testInsertAmigo() {
        Amigo amigo = new Amigo();
        amigo.setAmigoName("르브론");
        amigo.setPhoneNum("010-2314-4144");
        amigo.setEmail("nba@gmail.com");

        amigoDao.insertAmigo(amigo);
    }

    @Test
    public void testSelectAllAmigos() {
        List<Amigo> testList = amigoDao.selectAllAmigos();

        Assert.assertTrue(testList.size() > 0);
        Assert.assertTrue(testList.get(0).getAmigoName().equals("이진석"));
    }

    @Test
    public void testSelectAmigoByName() {
        Amigo amigo = amigoDao.selectAmigoByName("이진석");
        Assert.assertTrue(amigo.getPhoneNum().equals("010-1234-1234"));

    }
}
