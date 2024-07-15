package com.leibudao.train.member.service;

import com.leibudao.train.member.domain.Member;
import com.leibudao.train.member.mapper.MemberMapper;
import com.leibudao.train.member.req.MemberRegisterReq;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private static final Logger LOG = LoggerFactory.getLogger(MemberService.class);

    @Resource
    private MemberMapper memberMapper;

    public long register(MemberRegisterReq req) {
        String mobile = req.getMobile();
        Member member = new Member();
        member.setId(System.currentTimeMillis());
        member.setMobile(mobile);
        memberMapper.insert(member);
        return member.getId();
    }
}
