package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuxiziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuxiziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuxiziliaoView;


/**
 * 复习资料
 *
 * @author 
 * @email 
 * @date 2021-01-10 13:25:38
 */
public interface FuxiziliaoService extends IService<FuxiziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuxiziliaoVO> selectListVO(Wrapper<FuxiziliaoEntity> wrapper);
   	
   	FuxiziliaoVO selectVO(@Param("ew") Wrapper<FuxiziliaoEntity> wrapper);
   	
   	List<FuxiziliaoView> selectListView(Wrapper<FuxiziliaoEntity> wrapper);
   	
   	FuxiziliaoView selectView(@Param("ew") Wrapper<FuxiziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuxiziliaoEntity> wrapper);
   	
}

