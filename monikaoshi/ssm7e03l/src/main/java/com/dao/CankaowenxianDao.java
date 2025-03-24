package com.dao;

import com.entity.CankaowenxianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CankaowenxianVO;
import com.entity.view.CankaowenxianView;


/**
 * 参考文献
 * 
 * @author 
 * @email 
 * @date 2021-01-10 13:25:38
 */
public interface CankaowenxianDao extends BaseMapper<CankaowenxianEntity> {
	
	List<CankaowenxianVO> selectListVO(@Param("ew") Wrapper<CankaowenxianEntity> wrapper);
	
	CankaowenxianVO selectVO(@Param("ew") Wrapper<CankaowenxianEntity> wrapper);
	
	List<CankaowenxianView> selectListView(@Param("ew") Wrapper<CankaowenxianEntity> wrapper);

	List<CankaowenxianView> selectListView(Pagination page,@Param("ew") Wrapper<CankaowenxianEntity> wrapper);
	
	CankaowenxianView selectView(@Param("ew") Wrapper<CankaowenxianEntity> wrapper);
	
}
