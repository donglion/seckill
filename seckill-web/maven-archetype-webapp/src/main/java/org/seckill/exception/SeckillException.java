/**
 * D
 */
package org.seckill.exception;

/**
 * @author dhs 2016年10月16日上午10:21:36
 */
public class SeckillException extends RuntimeException {

	public SeckillException(String message, Throwable cause) {
		super(message, cause);
	}

	public SeckillException(String message) {
		super(message);
	}

}
