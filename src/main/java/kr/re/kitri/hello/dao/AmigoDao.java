package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Amigo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public List<Amigo> selectAllAmigos() {

        String query =
                "select amigo_id, amigo_name, phone_num, email \n" +
                "from amigo;";

        try {
            //1. Connection 확보
            Connection conn = dataSource.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            List<Amigo> amigoList = new ArrayList<>();

            while (rs.next()) {
                amigoList.add(
                  new Amigo(
                          rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)
                  ));
            }

            conn.close();

            return amigoList;

        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public Amigo selectAmigoByName(String amigoName) {

        String query =
                "select amigo_id, amigo_name, phone_num, email\n" +
                        "from amigo\n" +
                        "where amigo_name = ?;";

        try {
            Connection conn = dataSource.getConnection();

            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, amigoName);
            ResultSet rs = pstmt.executeQuery();

            rs.next();

            Amigo amigo = new Amigo();
            amigo.setAmigoId(rs.getString(1));
            amigo.setAmigoName(rs.getString(2));
            amigo.setPhoneNum(rs.getString(3));
            amigo.setEmail(rs.getString(4));

            conn.close();

            return amigo;

        } catch (SQLException e) {
            e.printStackTrace();
            return new Amigo();
        }

    }
}
