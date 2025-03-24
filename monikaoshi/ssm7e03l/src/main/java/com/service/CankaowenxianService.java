package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CankaowenxianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CankaowenxianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CankaowenxianView;


/**
 * 参考文献
 *
 * @author 
 * @email 
 * @date 2021-01-10 13:25:38
 */
public interface CankaowenxianService extends IService<CankaowenxianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CankaowenxianVO> selectListVO(Wrapper<CankaowenxianEntity> wrapper);
   	
   	CankaowenxianVO selectVO(@Param("ew") Wrapper<CankaowenxianEntity> wrapper);
   	
   	List<CankaowenxianView> selectListView(Wrapper<CankaowenxianEntity> wrapper);
   	
   	CankaowenxianView selectView(@Param("ew") Wrapper<CankaowenxianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CankaowenxianEntity> wrapper);
   	
}

