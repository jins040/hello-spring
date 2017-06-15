package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Amigo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by danawacomputer on 2017-06-15.
 */
@Repository
public class AmigoDao {

    @Autowired
    private DataSource dataSource;

    public void insertAmigo(Amigo amigo) {

        try {
            //1. Connection 확보
            Connection conn = dataSource.getConnection();

            //2. 쿼리 생성
            String query =
                    "insert into amigo(amigo_name, phone_num, email)\n" +
                    "VALUES (?, ?, ?);";
            PreparedStatement psmt = conn.prepareStatement(query);

            psmt.setString(1, amigo.getAmigoName());
            psmt.setString(2, amigo.getPhoneNum());
            psmt.setString(3, amigo.getEmail());

            psmt.executeUpdate();

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
