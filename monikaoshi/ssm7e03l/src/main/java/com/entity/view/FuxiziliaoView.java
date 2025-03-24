package com.entity.view;

import com.entity.FuxiziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 复习资料
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-10 13:25:38
 */
@TableName("fuxiziliao")
public class FuxiziliaoView  extends FuxiziliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuxiziliaoView(){
	}
 
 	public FuxiziliaoView(FuxiziliaoEntity fuxiziliaoEntity){
 	try {
			BeanUtils.copyProperties(this, fuxiziliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
