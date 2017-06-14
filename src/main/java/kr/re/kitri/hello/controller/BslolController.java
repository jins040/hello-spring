package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.common.BsMock;
import kr.re.kitri.hello.model.Bslol;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-13.
 */
@Controller
public class BslolController {

    @RequestMapping("/bs-sample")
    public ModelAndView test() {

        List<Bslol> list = new BsMock().getBsMock();

        return new ModelAndView("bslol/bs_sample").addObject("list", list);
    }

    @RequestMapping("/bs-sample/bs-read")
    public String bsRead() {
        return "bslol/bs_read";
    }

    @RequestMapping("/bs-sample/bs-write")
    public String bsWrite() {
        return "bslol/bs_write";
    }

    @RequestMapping("/bs-sample/{bsNum}")
    public ModelAndView viewDetail(@PathVariable("bsNum") String bsNum) {

        List<Bslol> bslol = new BsMock().getBsMock();

        ModelAndView mav = new ModelAndView();
        mav.setViewName("bslol/bs_read");
        mav.addObject("bslol", bslol);

        return mav;
    }
}
