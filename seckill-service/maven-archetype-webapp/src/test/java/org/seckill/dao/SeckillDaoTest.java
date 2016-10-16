/**
 * D
 */
package org.seckill.dao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 * @author dhs 2016年10月16日上午12:25:07
 * spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {
	
	//注入Dao实现类依赖
	@Autowired
	private SeckillDao seckillDao;
	
	@Test
	public void testQueryById() {
		long id = 1000;
		Seckill seckill = seckillDao.queryById(id);
		System.out.println(seckill.getName());
		System.out.println(seckill);
	}
	
	@Test
	public void testQueryAll() {
		
		List<Seckill> seckills = seckillDao.queryAll(0, 100);
		for (int i = 0; i < seckills.size(); i++) {
			System.out.println(seckills.get(i));
		}
		
		
	}
	
	@Test
	public void testReduceNumber() {
		
		Date killTime = new Date();
		int reduceNumber = seckillDao.reduceNumber(1000L, killTime);
		System.out.println(reduceNumber);
		
	}

}
