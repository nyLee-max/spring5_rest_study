package spring5_rest_study.mapper;

import java.util.List;

import spring5_rest_study.config.controller.ListCommand;
import spring5_rest_study.dto.Member;

public interface MemberMapper {

	Member selectMemberById(long memId);

	List<Member> selectMemberAll();

	int insertMember(Member member);

	int updateMember(Member member);

	int deleteMember(Member member);
}
