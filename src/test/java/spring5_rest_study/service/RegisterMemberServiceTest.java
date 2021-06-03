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
import org.springframework.test.context.web.WebAppConfiguration;

import spring5_rest_study.config.ContextRoot;
import spring5_rest_study.dto.Member;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ContextRoot.class})
@WebAppConfiguration
public class RegisterMemberServiceTest {

	private static final Log log = LogFactory.getLog(RegisterMemberServiceTest.class);
	
	@Autowired
	private RegisterMemberService service;
	
	@Autowired
	private RemoveMemberService remService;
	
	@After
	public void tearDown() throws Exception {
		System.out.println();
	}
 
	@Test
	public void testRegisterMember() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		Member member = new Member();
		member.setEmail("test16444@test.co.kr");
		member.setName("test16");
		member.setPassword("1111");
	
		int res = service.registerMember(member);
		Assert.assertEquals(1, res);
		
		log.debug("res > " + res);
		
//		remService.removeMember(member.getId());
		
		
	}

}
