package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.AmigoDao;
import kr.re.kitri.hello.model.Amigo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
