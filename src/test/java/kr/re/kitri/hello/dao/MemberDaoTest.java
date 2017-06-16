package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Member;
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
public class MemberDaoTest {

    @Autowired
    private MemberDao memberDao;

    @Test
    public void testInsertMember() {
        Member member = new Member();
        member.setUserId("james");
        member.setPassword("1234");
        member.setEmail("james@nba.com");
        memberDao.insertMember(member);
    }

    @Test
    public void testSelectAllMembers() {
        List<Member> testList = memberDao.selectAllMembers();
        Assert.assertTrue(testList.size() > 0);
        Assert.assertTrue(testList.get(0).getUserId().equals("kim"));
    }

}
