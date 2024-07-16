package com.leibudao.train.member.controller;


import com.leibudao.train.common.resp.CommonResp;
import com.leibudao.train.member.req.MemberLoginReq;
import com.leibudao.train.member.req.MemberRegisterReq;
import com.leibudao.train.member.req.MemberSendCodeReq;
import com.leibudao.train.member.resp.MemberLoginResp;
import com.leibudao.train.member.service.MemberService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/send-code")
    public CommonResp<Long> sendCode(@Valid @RequestBody MemberSendCodeReq req) {
        memberService.sendCode(req);
        return new CommonResp<>();
    }

    @PostMapping("/login")
    public CommonResp<MemberLoginResp> login(@Valid MemberLoginReq req) {
        MemberLoginResp resp = memberService.login(req);
        return new CommonResp<>(resp);
    }



}
