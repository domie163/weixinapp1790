package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusscankaowenxianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusscankaowenxianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusscankaowenxianView;


/**
 * 参考文献评论表
 *
 * @author 
 * @email 
 * @date 2021-01-10 13:25:38
 */
public interface DiscusscankaowenxianService extends IService<DiscusscankaowenxianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusscankaowenxianVO> selectListVO(Wrapper<DiscusscankaowenxianEntity> wrapper);
   	
   	DiscusscankaowenxianVO selectVO(@Param("ew") Wrapper<DiscusscankaowenxianEntity> wrapper);
   	
   	List<DiscusscankaowenxianView> selectListView(Wrapper<DiscusscankaowenxianEntity> wrapper);
   	
   	DiscusscankaowenxianView selectView(@Param("ew") Wrapper<DiscusscankaowenxianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusscankaowenxianEntity> wrapper);
   	
}

