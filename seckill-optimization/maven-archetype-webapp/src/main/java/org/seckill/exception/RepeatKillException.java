/**
 * D
 */
package org.seckill.exception;

/**
 * 重复秒杀异常（运行期异常）
 * @author dhs 2016年10月16日上午10:17:47
 */
public class RepeatKillException extends SeckillException {

	public RepeatKillException(String message) {
		super(message);
	}
	
	public RepeatKillException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
