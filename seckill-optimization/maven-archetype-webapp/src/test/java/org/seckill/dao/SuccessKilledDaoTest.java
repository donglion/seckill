/**
 * D
 */
package org.seckill.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dhs 2016年10月16日上午1:30:17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

	@Autowired
	private SuccessKilledDao successKilledDao;
	
	@Test
	public void testInsertSuccessKilled() {
		long id = 1001L;
		long phone = 1350L;
		int ret = successKilledDao.insertSuccessKilled(id, phone);
		System.out.println(ret);
	}

	@Test
	public void testQueryByIdWithSeckill() {
		
		SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(1001L, 1350L);
		System.out.println(successKilled);
		System.out.println(successKilled.getSeckill());

	}

}
