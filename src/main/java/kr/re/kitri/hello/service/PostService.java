package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.MemberDao;
import kr.re.kitri.hello.dao.PostDao;
import kr.re.kitri.hello.model.Member;
import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
@Service
public class PostService {

    @Autowired
    private MemberDao memberDao;
    @Autowired
    private PostDao postDao;

    /**
     * 글을 등록하고, 멤버에게 point를 10점 부여한다.
     * @param post
     */
    public void registPost(Post post) {
        //둘 다 실행되거나(Commit) Rollback 시켜야 한다.(둘 중 하나만 기능하면 안된다.)
        postDao.insertPost(post);
        memberDao.updatePoint(post.getMemberSeq());
    }

    public void registMember(Member member) {
        memberDao.insertMember(member);
    }

    public List<Member> getMembers() {
        return memberDao.selectAllMembers();
    }
}
