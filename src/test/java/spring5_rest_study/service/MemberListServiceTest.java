package spring5_rest_study.service;

import java.util.List;

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
import spring5_rest_study.mapper.MemberMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ContextRoot.class})
public class MemberListServiceTest {

	private static final Log log = LogFactory.getLog(MemberListServiceTest.class);
	
	@Autowired
	private MemberListService service;
	
	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void testGetLists() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Member> list = service.getLists();
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
	}

}
