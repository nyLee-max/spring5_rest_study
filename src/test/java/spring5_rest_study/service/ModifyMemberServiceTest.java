package spring5_rest_study.service;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring5_rest_study.config.ContextRoot;
import spring5_rest_study.dto.Member;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContextRoot.class })
public class ModifyMemberServiceTest {

	private static final Log log = LogFactory.getLog(ModifyMemberServiceTest.class);

	@Autowired
	private RegisterMemberService regService;

	@Autowired
	private ModifyMemberService service;

	@Autowired
	private RemoveMemberService remService;

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void testModifyMember() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		Member member = new Member("test4545@test.co.kr", "1111", "test45");
		regService.registerMember(member);

		int res = service.modifyMember(member);
		Assert.assertEquals(1, res);

		log.debug("res > " + res);

		remService.removeMember(member.getId());

	}

}
