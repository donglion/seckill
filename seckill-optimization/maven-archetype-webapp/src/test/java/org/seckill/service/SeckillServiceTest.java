/**
 * D
 */
package org.seckill.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dhs 2016年10月16日上午11:47:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
					   "classpath:spring/spring-service.xml"})
public class SeckillServiceTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SeckillService seckillService;
	
	@Test
	public void testGetSeckillList() {
		List<Seckill> list = seckillService.getSeckillList();
		logger.info("list={}", list);
	}

	@Test
	public void testGetByid() {
		long id = 1000;
		Seckill seckill = seckillService.getByid(id);
		logger.info("seckill={}", seckill);
	}

	@Test
	public void testSeckillLogic() {
		long id = 1001;
		Exposer exposer = seckillService.exportSeckillUrl(id);
		if(exposer.isExposed()) {
			long phone = 135135124;
			String md5 = exposer.getMd5();
			try {
				SeckillExecution executeSeckill = seckillService.executeSeckill(id, phone, md5);
				logger.info("executeSeckill={}", executeSeckill);
			} catch (RepeatKillException e) {
				logger.error(e.getMessage());
			} catch (SeckillCloseException e) {
				logger.error(e.getMessage());
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {
			logger.warn("exposer={}", exposer);
		}
		logger.info("exposer={}", exposer);
	}

	@Test
	public void executeSeckillProcedure() {
		long seckillId = 1001;
		long phone = 13666400700L;
		Exposer exposer = seckillService.exportSeckillUrl(seckillId);
		if(exposer.isExposed()) {
			String md5 = exposer.getMd5();
			SeckillExecution seckillExecution = seckillService.executeSeckillProcedure(seckillId, phone, md5);
			logger.info(seckillExecution.getStateInfo());
		}
	}
	
}
