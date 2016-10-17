/**
 * D
 */
package org.seckill.dto;

import org.seckill.entity.SuccessKilled;
import org.seckill.enums.SeckillStatEnum;

/**
 * 封装秒杀执行后接口
 * @author dhs 2016年10月16日上午10:14:49
 */
public class SeckillExecution {

	private long seckillId;
	//秒杀执行结果状态
	private int state;
	//状态表示
	private String stateInfo;
	//秒杀成功对象
	private SuccessKilled successKilled;
	
	
	/**
	 * @param seckillId
	 * @param state
	 * @param stateInfo
	 */
	public SeckillExecution(long seckillId, SeckillStatEnum statEnum) {
		this.seckillId = seckillId;
		this.state = statEnum.getState();
		this.stateInfo = statEnum.getStateInfo();
	}


	/**
	 * @param seckillId
	 * @param state
	 * @param stateInfo
	 * @param successKilled
	 */
	public SeckillExecution(long seckillId, SeckillStatEnum statEnum, SuccessKilled successKilled) {
		this.seckillId = seckillId;
		this.state = statEnum.getState();
		this.stateInfo = statEnum.getStateInfo();
		this.successKilled = successKilled;
	}


	public long getSeckillId() {
		return seckillId;
	}


	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}


	public int getState() {
		return state;
	}


	public void setState(int state) {
		this.state = state;
	}


	public String getStateInfo() {
		return stateInfo;
	}


	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}


	public SuccessKilled getSuccessKilled() {
		return successKilled;
	}


	public void setSuccessKilled(SuccessKilled successKilled) {
		this.successKilled = successKilled;
	}
	
}