package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
@Repository
public class MemberDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updatePoint(int memberSeq) {
        String query =
                "update member set point = point + 10\n" +
                        "where member_seq = ?;";
        jdbcTemplate.update(query, memberSeq);
    }

    public void insertMember(Member member) {
        String query =
                "insert into member(user_id, password, email, join_date)\n" +
                        "VALUES (?, ?, ?, now());";

        jdbcTemplate.update(query, member.getUserId(), member.getPassword(), member.getEmail());
    }

    public List<Member> selectAllMembers() {
        String query =
                "select member_seq, user_id, password, email, point, join_date\n" +
                        "from member;";

        return jdbcTemplate.query(query, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
                Member member = new Member();
                member.setMemberSeq(rs.getInt(1));
                member.setUserId(rs.getString(2));
                member.setPassword(rs.getString(3));
                member.setEmail(rs.getString(4));
                member.setPoint(rs.getInt(5));
                member.setJoinDate(rs.getString(6));
                return member;
            }
        });
    }
}
