package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

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


    public List<Map<String, Object>> selectPostById(String memberSeq) {
        String query =
                "select post_seq, title, content, write_date, member_seq\n" +
                    "from post\n" +
                    "where member_seq = ?;";
        return jdbcTemplate.queryForList(query, memberSeq);
    }

//    public Post selectPostById(String memberSeq) {
//        String query =
//                "select post_seq, title, content, write_date, member_seq\n" +
//                        "from post\n" +
//                        "where member_seq = ?;";
//
//        return jdbcTemplate.queryForObject(query, (rs, rowNum) -> {
//            Post post = new Post();
//            post.setPostSeq(rs.getInt(1));
//            post.setTitle(rs.getString(2));
//            post.setContent(rs.getString(3));
//            post.setWriteDate(rs.getString(4));
//            post.setMemberSeq(rs.getInt(5));
//            return post;
//        }, Integer.parseInt(memberSeq));
//    }
}
