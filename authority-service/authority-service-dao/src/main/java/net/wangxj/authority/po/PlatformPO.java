
package net.wangxj.authority.po;

import java.math.BigDecimal;
import java.util.Date;

/**
 * created by	: wangxj
 * created time	: 2016-12-26 18:06:44
 */
public class PlatformPO{
	
    // 主键 	
	private String platformUuid;
    // 平台名 	
	private String platformName;
    // 平台标识 	
	private String platformSign;
    // 平台域名 	
	private String platformDomainName;
    // 添加时间 yyyy-MM-dd HH:mm:ss 	
	private String platformAddTime;
    // 添加人uuid 	
	private String platformAddBy;
    // 删除时间 yyyy-MM-dd HH:mm:ss 	
	private String platformDelTime;
    // 删除人uuid 	
	private String platformDelBy;
    // 平台状态： 初始化: 0 激活: 1 注销: 2 	
	private java.lang.Integer platformStatus;
    // 是否已被删除: 0：未 1：已被删除 	
	private java.lang.Integer platformIsDelete;
	
	public PlatformPO(){
		super();
	}
	
	public PlatformPO(String platformUuid,String platformName,String platformSign,String platformDomainName,String platformAddTime,String platformAddBy,String platformDelTime,String platformDelBy,java.lang.Integer platformStatus,java.lang.Integer platformIsDelete){
			this.platformUuid = platformUuid;
			this.platformName = platformName;
			this.platformSign = platformSign;
			this.platformDomainName = platformDomainName;
			this.platformAddTime = platformAddTime;
			this.platformAddBy = platformAddBy;
			this.platformDelTime = platformDelTime;
			this.platformDelBy = platformDelBy;
			this.platformStatus = platformStatus;
			this.platformIsDelete = platformIsDelete;
	}

	public void setPlatformUuid(String value) {
		this.platformUuid = value;
	}
	
	public String getPlatformUuid() {
		return this.platformUuid;
	}
	public void setPlatformName(String value) {
		this.platformName = value;
	}
	
	public String getPlatformName() {
		return this.platformName;
	}
	public void setPlatformSign(String value) {
		this.platformSign = value;
	}
	
	public String getPlatformSign() {
		return this.platformSign;
	}
	public void setPlatformDomainName(String value) {
		this.platformDomainName = value;
	}
	
	public String getPlatformDomainName() {
		return this.platformDomainName;
	}
	public void setPlatformAddTime(String value) {
		this.platformAddTime = value;
	}
	
	public String getPlatformAddTime() {
		return this.platformAddTime;
	}
	public void setPlatformAddBy(String value) {
		this.platformAddBy = value;
	}
	
	public String getPlatformAddBy() {
		return this.platformAddBy;
	}
	public void setPlatformDelTime(String value) {
		this.platformDelTime = value;
	}
	
	public String getPlatformDelTime() {
		return this.platformDelTime;
	}
	public void setPlatformDelBy(String value) {
		this.platformDelBy = value;
	}
	
	public String getPlatformDelBy() {
		return this.platformDelBy;
	}
	public void setPlatformStatus(java.lang.Integer value) {
		this.platformStatus = value;
	}
	
	public java.lang.Integer getPlatformStatus() {
		return this.platformStatus;
	}
	public void setPlatformIsDelete(java.lang.Integer value) {
		this.platformIsDelete = value;
	}
	
	public java.lang.Integer getPlatformIsDelete() {
		return this.platformIsDelete;
	}
}
