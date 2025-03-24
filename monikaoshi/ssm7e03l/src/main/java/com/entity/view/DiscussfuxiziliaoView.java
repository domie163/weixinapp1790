package com.entity.view;

import com.entity.DiscussfuxiziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 复习资料评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-10 13:25:38
 */
@TableName("discussfuxiziliao")
public class DiscussfuxiziliaoView  extends DiscussfuxiziliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfuxiziliaoView(){
	}
 
 	public DiscussfuxiziliaoView(DiscussfuxiziliaoEntity discussfuxiziliaoEntity){
 	try {
			BeanUtils.copyProperties(this, discussfuxiziliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
