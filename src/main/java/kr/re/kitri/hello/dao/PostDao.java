package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by danawacomputer on 2017-06-16.
 */
@Repository
public class PostDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertPost(Post post) {
        String query =
                "INSERT into post(title, content, write_date, member_seq)\n" +
                        "VALUES (?, ?, now(), ?);";

        jdbcTemplate.update(query, post.getTitle(), post.getContent(), post.getMemberSeq());
    }
}
