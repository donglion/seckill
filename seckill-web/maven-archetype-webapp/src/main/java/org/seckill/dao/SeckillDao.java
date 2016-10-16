/**
 * D
 */
package org.seckill.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

/**
 * @author dhs 2016年10月15日下午10:49:15
 */
public interface SeckillDao {
	
	/**
	 * 减库存，
	 * @return 如果影响行数>1，表示更新的记录行数
	 */
	int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);
	
	/**
	 * 根据id查询秒杀对象
	 * @author D 2016年10月15日下午10:50:19
	 */
	Seckill queryById(long seckillId);
	
	/**
	 * 根据偏移量查询秒杀商品
	 * @author D 2016年10月15日下午10:50:54
	 */
	List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	
}
