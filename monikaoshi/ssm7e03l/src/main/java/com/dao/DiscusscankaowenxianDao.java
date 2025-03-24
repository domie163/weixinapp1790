package com.dao;

import com.entity.DiscusscankaowenxianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusscankaowenxianVO;
import com.entity.view.DiscusscankaowenxianView;


/**
 * 参考文献评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-10 13:25:38
 */
public interface DiscusscankaowenxianDao extends BaseMapper<DiscusscankaowenxianEntity> {
	
	List<DiscusscankaowenxianVO> selectListVO(@Param("ew") Wrapper<DiscusscankaowenxianEntity> wrapper);
	
	DiscusscankaowenxianVO selectVO(@Param("ew") Wrapper<DiscusscankaowenxianEntity> wrapper);
	
	List<DiscusscankaowenxianView> selectListView(@Param("ew") Wrapper<DiscusscankaowenxianEntity> wrapper);

	List<DiscusscankaowenxianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusscankaowenxianEntity> wrapper);
	
	DiscusscankaowenxianView selectView(@Param("ew") Wrapper<DiscusscankaowenxianEntity> wrapper);
	
}
