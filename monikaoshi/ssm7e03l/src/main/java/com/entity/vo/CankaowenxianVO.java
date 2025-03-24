package com.entity.vo;

import com.entity.CankaowenxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 参考文献
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-10 13:25:38
 */
public class CankaowenxianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 文献分类
	 */
	
	private String wenxianfenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 文献内容
	 */
	
	private String wenxianneirong;
		
	/**
	 * 文献附件
	 */
	
	private String wenxianfujian;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：文献分类
	 */
	 
	public void setWenxianfenlei(String wenxianfenlei) {
		this.wenxianfenlei = wenxianfenlei;
	}
	
	/**
	 * 获取：文献分类
	 */
	public String getWenxianfenlei() {
		return wenxianfenlei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：文献内容
	 */
	 
	public void setWenxianneirong(String wenxianneirong) {
		this.wenxianneirong = wenxianneirong;
	}
	
	/**
	 * 获取：文献内容
	 */
	public String getWenxianneirong() {
		return wenxianneirong;
	}
				
	
	/**
	 * 设置：文献附件
	 */
	 
	public void setWenxianfujian(String wenxianfujian) {
		this.wenxianfujian = wenxianfujian;
	}
	
	/**
	 * 获取：文献附件
	 */
	public String getWenxianfujian() {
		return wenxianfujian;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
