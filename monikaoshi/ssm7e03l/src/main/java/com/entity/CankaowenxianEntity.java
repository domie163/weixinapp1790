package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 参考文献
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-10 13:25:38
 */
@TableName("cankaowenxian")
public class CankaowenxianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CankaowenxianEntity() {
		
	}
	
	public CankaowenxianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 文献名称
	 */
					
	private String wenxianmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：文献名称
	 */
	public void setWenxianmingcheng(String wenxianmingcheng) {
		this.wenxianmingcheng = wenxianmingcheng;
	}
	/**
	 * 获取：文献名称
	 */
	public String getWenxianmingcheng() {
		return wenxianmingcheng;
	}
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
