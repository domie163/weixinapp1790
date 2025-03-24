package com.entity.view;

import com.entity.CankaowenxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 参考文献
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-10 13:25:38
 */
@TableName("cankaowenxian")
public class CankaowenxianView  extends CankaowenxianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CankaowenxianView(){
	}
 
 	public CankaowenxianView(CankaowenxianEntity cankaowenxianEntity){
 	try {
			BeanUtils.copyProperties(this, cankaowenxianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
