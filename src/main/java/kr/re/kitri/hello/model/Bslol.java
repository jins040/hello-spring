package kr.re.kitri.hello.model;

/**
 * Created by danawacomputer on 2017-06-13.
 */
public class Bslol {

    private String bsNum;
    private String bsTitle;
    private String bsWriter;
    private String bsClick;
    private String bsRecommend;


    public String getBsNum() {
        return bsNum;
    }

    public void setBsNum(String bsNum) {
        this.bsNum = bsNum;
    }

    public String getBsTitle() {
        return bsTitle;
    }

    public void setBsTitle(String bsTitle) {
        this.bsTitle = bsTitle;
    }

    public String getBsWriter() {
        return bsWriter;
    }

    public void setBsWriter(String bsWriter) {
        this.bsWriter = bsWriter;
    }

    public String getBsClick() {
        return bsClick;
    }

    public void setBsClick(String bsClick) {
        this.bsClick = bsClick;
    }

    public String getBsRecommend() {
        return bsRecommend;
    }

    public void setBsRecommend(String bsRecommend) {
        this.bsRecommend = bsRecommend;
    }

    @Override
    public String toString() {
        return "Bslol{" +
                "bsNum='" + bsNum + '\'' +
                ", bsTitle='" + bsTitle + '\'' +
                ", bsWriter='" + bsWriter + '\'' +
                ", bsClick='" + bsClick + '\'' +
                ", bsRecommend='" + bsRecommend + '\'' +
                '}';
    }
}
