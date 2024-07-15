package com.leibudao.train.member.controller;


import com.leibudao.train.common.resp.CommonResp;
import com.leibudao.train.member.req.MemberRegisterReq;
import com.leibudao.train.member.service.MemberService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Resource
    private MemberService memberService;

    @PostMapping("/register")
    public CommonResp<Long> register(@Valid MemberRegisterReq req) {
        long id = memberService.register(req);
        return new CommonResp<>(id);
    }

}
