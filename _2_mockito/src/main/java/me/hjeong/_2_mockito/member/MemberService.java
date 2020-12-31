package me.hjeong._2_mockito.member;


import me.hjeong._2_mockito.domain.Member;
import me.hjeong._2_mockito.domain.Study;

import java.util.Optional;

public interface MemberService {
    void validate(Long memberId) throws InvalidMemberException;

    Member findById(Long memberId) throws MemberNotFoundException;

    Optional<Member> findByEmail(String email) throws MemberNotFoundException;

    void notify(Study newstudy);

    void notify(Member member);
}