package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.AmigoDao;
import kr.re.kitri.hello.model.Amigo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-15.
 */
@Service
public class AmigoService {

    @Autowired
    private AmigoDao dao;

    /**
     * 글 쓰기
     * @param amigo
     */
    public void registAmigo(Amigo amigo) {

        dao.insertAmigo(amigo);

    }

    /**
     * 글 전체 보기
     * @return
     */
    public List<Amigo> getAmigos() {

        return dao.selectAllAmigos();
    }

    /**
     * 글 상세 보기
     * @param amigoName
     * @return
     */
    public Amigo viewDetailAmigo(String amigoName) {

        return dao.selectAmigoByName(amigoName);
    }
}
