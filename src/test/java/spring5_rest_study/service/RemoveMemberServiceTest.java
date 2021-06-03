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
public class RemoveMemberServiceTest {

	private static final Log log = LogFactory.getLog(RemoveMemberServiceTest.class);
	
	@Autowired
	private RegisterMemberService regService;
	
	@Autowired
	private RemoveMemberService service;
	
	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void testRemoveMember() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Member member = new Member("12121asdsad2@test.co.kr", "1111", "test100");
		regService.registerMember(member);
		
		System.out.println(member.getId());
		
		int res = service.removeMember(member.getId());
		Assert.assertEquals(1, res);
		
		log.debug("res > " + res);
		
	}
 
}
