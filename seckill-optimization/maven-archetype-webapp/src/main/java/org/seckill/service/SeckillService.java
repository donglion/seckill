/**
 * D
 */
package org.seckill.service;

import java.util.List;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;

/**
 * 业务接口：站在“使用者”角度设计接口
 * 三个方面：方法定义粒度，参数，返回类型
 * @author dhs 2016年10月16日上午10:03:23
 */
public interface SeckillService {

	/**
	 * 查询所有秒杀记录
	 * @author D 2016年10月16日上午10:06:32
	 */
	List<Seckill> getSeckillList();
	
	/**
	 * 查询单个秒杀记录
	 * @author D 2016年10月16日上午10:07:01
	 */
	Seckill getByid(long seckillId);
	
	/**
	 * 秒杀开启是输出秒杀接口地址
	 * 否则输出系统时间和秒杀时间
	 * @author D 2016年10月16日上午10:07:30
	 */
	Exposer exportSeckillUrl(long seckillId);
	
	/**
	 * 执行秒杀操作
	 * @author D 2016年10月16日上午10:14:26
	 */
	SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
		throws SeckillException, RepeatKillException, SeckillCloseException;
	
	/**
	 * 执行秒杀操作 by 存储过程
	 * @author D 2016年10月16日上午10:14:26
	 */
	SeckillExecution executeSeckillProcedure(long seckillId, long userPhone, String md5)
		throws SeckillException, RepeatKillException, SeckillCloseException;
	
}
