package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfuxiziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfuxiziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfuxiziliaoView;


/**
 * 复习资料评论表
 *
 * @author 
 * @email 
 * @date 2021-01-10 13:25:38
 */
public interface DiscussfuxiziliaoService extends IService<DiscussfuxiziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfuxiziliaoVO> selectListVO(Wrapper<DiscussfuxiziliaoEntity> wrapper);
   	
   	DiscussfuxiziliaoVO selectVO(@Param("ew") Wrapper<DiscussfuxiziliaoEntity> wrapper);
   	
   	List<DiscussfuxiziliaoView> selectListView(Wrapper<DiscussfuxiziliaoEntity> wrapper);
   	
   	DiscussfuxiziliaoView selectView(@Param("ew") Wrapper<DiscussfuxiziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfuxiziliaoEntity> wrapper);
   	
}

