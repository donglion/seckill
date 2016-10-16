/**
 * D
 */
package org.seckill.exception;

/**
 * 秒杀关闭异常
 * @author dhs 2016年10月16日上午10:20:38
 */
public class SeckillCloseException extends SeckillException {

	public SeckillCloseException(String message) {
		super(message);
	}
	
	public SeckillCloseException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
