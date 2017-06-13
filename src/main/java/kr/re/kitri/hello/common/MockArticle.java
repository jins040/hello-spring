package kr.re.kitri.hello.common;

import kr.re.kitri.hello.model.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-13.
 */
public class MockArticle {

    public List<Article> getArticles() {
        List<Article> list = new ArrayList<>();

        Article a = new Article();
        a.setArticleId("1");
        a.setTitle("1번 게시물입니다.");
        a.setAuthor("박찬호");
        a.setContent("메이저리그 선수 박찬호");
        list.add(a);

        a = new Article();
        a.setArticleId("2");
        a.setTitle("2번 게시물입니다.");
        a.setAuthor("박세리");
        a.setContent("LPGA 선수 박세리");
        list.add(a);

        a = new Article();
        a.setArticleId("3");
        a.setTitle("3번 게시물입니다.");
        a.setAuthor("스칼렌 요한슨");
        a.setContent("할리우드 영화배우");
        list.add(a);

        a = new Article();
        a.setArticleId("4");
        a.setTitle("4번 게시물입니다.");
        a.setAuthor("리오넬 메시");
        a.setContent("FC바르셀로나 축구 선수");
        list.add(a);

        a = new Article();
        a.setArticleId("5");
        a.setTitle("5번 게시물입니다.");
        a.setAuthor("에바 그린");
        a.setContent("강사님께서 좋아하시는 영화배우");
        list.add(a);

        return list;

    }
}
