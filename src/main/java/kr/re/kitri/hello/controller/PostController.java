package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Member;
import kr.re.kitri.hello.model.Post;
import kr.re.kitri.hello.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */

/**
 * /post/write (GET) .. 글쓰기 화면
 * /post/write (POST) .. 글 쓰기
 */
@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("")
    public ModelAndView init() {

        //전체보기를 위한 data
        List<Member> memberList = postService.getMembers();

        return new ModelAndView("post/init").addObject("memberList", memberList);
    }

    @RequestMapping("/view-all")
    public String viewAll() {
        return "post/view_all";
    }

    @GetMapping("view-all/write")
    public String write() {
        return "post/write";
    }

    @PostMapping("view-all/write")
    public ModelAndView doWrite(Post post) {
        postService.registPost(post);
        return new ModelAndView("post/display_write").addObject("post", post);
    }

    @GetMapping("/sign-up")
    public String signup() {
        return "post/sign_up";
    }

    @PostMapping("/sign-up")
    public ModelAndView doSignUp(Member member) {

        postService.registMember(member);

        return new ModelAndView("post/display_signup").addObject("member", member);
    }
}
