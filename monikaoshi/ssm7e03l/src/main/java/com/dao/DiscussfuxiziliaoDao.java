package com.dao;

import com.entity.DiscussfuxiziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfuxiziliaoVO;
import com.entity.view.DiscussfuxiziliaoView;


/**
 * 复习资料评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-10 13:25:38
 */
public interface DiscussfuxiziliaoDao extends BaseMapper<DiscussfuxiziliaoEntity> {
	
	List<DiscussfuxiziliaoVO> selectListVO(@Param("ew") Wrapper<DiscussfuxiziliaoEntity> wrapper);
	
	DiscussfuxiziliaoVO selectVO(@Param("ew") Wrapper<DiscussfuxiziliaoEntity> wrapper);
	
	List<DiscussfuxiziliaoView> selectListView(@Param("ew") Wrapper<DiscussfuxiziliaoEntity> wrapper);

	List<DiscussfuxiziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfuxiziliaoEntity> wrapper);
	
	DiscussfuxiziliaoView selectView(@Param("ew") Wrapper<DiscussfuxiziliaoEntity> wrapper);
	
}
