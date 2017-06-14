package kr.re.kitri.hello.common;

import kr.re.kitri.hello.model.Bslol;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-13.
 */
public class BsMock {

    public List<Bslol> getBsMock() {

        List<Bslol> list = new ArrayList<>();

        Bslol data = new Bslol();
        data.setBsNum("1");
        data.setBsTitle("영구정지100프로피하는법 조회수 1등갑니다.");
        data.setBsWriter("이기봉");
        data.setBsClick("87");
        data.setBsRecommend("10");
        list.add(data);

        data = new Bslol();
        data.setBsNum("2");
        data.setBsTitle("단순히 못해서 브실골이 아님.");
        data.setBsWriter("페이커");
        data.setBsClick("10000000");
        data.setBsRecommend("1001");
        list.add(data);

        data = new Bslol();
        data.setBsNum("3");
        data.setBsTitle("진짜 브론즈애들은 뇌가없네 ㅋㅋㅋㅋㅋㅋ  ");
        data.setBsWriter("진하영");
        data.setBsClick("56");
        data.setBsRecommend("4");
        list.add(data);

        data = new Bslol();
        data.setBsNum("4");
        data.setBsTitle("1대1문의 메크로답변 노답");
        data.setBsWriter("메시");
        data.setBsClick("7");
        data.setBsRecommend("1");
        list.add(data);

        data = new Bslol();
        data.setBsNum("5");
        data.setBsTitle("리폿시스템");
        data.setBsWriter("르브론");
        data.setBsClick("11");
        data.setBsRecommend("13");
        list.add(data);


        return list;
    }
}
