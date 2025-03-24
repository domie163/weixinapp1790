package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CankaowenxianDao;
import com.entity.CankaowenxianEntity;
import com.service.CankaowenxianService;
import com.entity.vo.CankaowenxianVO;
import com.entity.view.CankaowenxianView;

@Service("cankaowenxianService")
public class CankaowenxianServiceImpl extends ServiceImpl<CankaowenxianDao, CankaowenxianEntity> implements CankaowenxianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CankaowenxianEntity> page = this.selectPage(
                new Query<CankaowenxianEntity>(params).getPage(),
                new EntityWrapper<CankaowenxianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CankaowenxianEntity> wrapper) {
		  Page<CankaowenxianView> page =new Query<CankaowenxianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CankaowenxianVO> selectListVO(Wrapper<CankaowenxianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CankaowenxianVO selectVO(Wrapper<CankaowenxianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CankaowenxianView> selectListView(Wrapper<CankaowenxianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CankaowenxianView selectView(Wrapper<CankaowenxianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
