/**
 * D
 */
package org.seckill.dto;

/**
 * 暴露秒杀地址Dto
 * @author dhs 2016年10月16日上午10:09:10
 */
public class Exposer {

	//是否开启秒杀
	private boolean exposed;
	private String md5;
	private long seckillId;
	private long now;
	private long start;
	private long end;
	
	/**
	 * @param exposed
	 * @param md5
	 * @param seckillId
	 */
	public Exposer(boolean exposed, String md5, long seckillId) {
		super();
		this.exposed = exposed;
		this.md5 = md5;
		this.seckillId = seckillId;
	}
	/**
	 * @param exposed
	 * @param now
	 * @param start
	 * @param end
	 */
	public Exposer(boolean exposed, long seckillId, long now, long start, long end) {
		super();
		this.exposed = exposed;
		this.seckillId = seckillId;
		this.now = now;
		this.start = start;
		this.end = end;
	}
	/**
	 * @param exposed
	 * @param seckillId
	 */
	public Exposer(boolean exposed, long seckillId) {
		super();
		this.exposed = exposed;
		this.seckillId = seckillId;
	}
	public boolean isExposed() {
		return exposed;
	}
	public void setExposed(boolean exposed) {
		this.exposed = exposed;
	}
	public String getMd5() {
		return md5;
	}
	public void setMd5(String md5) {
		this.md5 = md5;
	}
	public long getSeckillId() {
		return seckillId;
	}
	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}
	public long getNow() {
		return now;
	}
	public void setNow(long now) {
		this.now = now;
	}
	public long getStart() {
		return start;
	}
	public void setStart(long start) {
		this.start = start;
	}
	public long getEnd() {
		return end;
	}
	public void setEnd(long end) {
		this.end = end;
	}
	@Override
	public String toString() {
		return "Exposer [exposed=" + exposed + ", md5=" + md5 + ", seckillId="
				+ seckillId + ", now=" + now + ", start=" + start + ", end="
				+ end + "]";
	}
	
}
