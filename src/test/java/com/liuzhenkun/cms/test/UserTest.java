package com.liuzhenkun.cms.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liuzhenkun.cms.dao.SlideDao;
import com.liuzhenkun.cms.dao.UserDao;
import com.liuzhenkun.cms.entity.Slide;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class UserTest {
	@Autowired
	private UserDao userDao;
	@Autowired
	private SlideDao slideDao;
	@Test
	public void MyTest() {
	List<Slide> select = slideDao.select(null);
		for (Slide slide : select) {
			System.out.println("============"+slide);
		}
	}
	
}
