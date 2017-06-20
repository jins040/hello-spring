package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Post;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml", "classpath:spring/db.xml"})
public class PostDaoTest {
    @Autowired PostDao postdao;

    @Test
    public void testSelectPostById() {
        List<Post> testList = postdao.selectPostById("2");
        System.out.println(testList);
        Assert.assertTrue(testList.get(0).getTitle().equals("어렵다"));
    }
}
