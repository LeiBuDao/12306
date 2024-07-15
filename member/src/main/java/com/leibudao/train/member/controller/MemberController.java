package com.leibudao.train.member.controller;


import com.leibudao.train.common.resp.CommonResp;
import com.leibudao.train.member.req.MemberRegisterReq;
import com.leibudao.train.member.service.MemberService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Resource
    private MemberService memberService;

    @PostMapping("/register")
    public CommonResp<Long> register(MemberRegisterReq req) {
        CommonResp<Long> commonResp = new CommonResp<>();
        long id = memberService.register(req);
        commonResp.setContent(id);
        return commonResp;
    }

}
