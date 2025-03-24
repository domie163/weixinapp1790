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


import com.dao.FuxiziliaoDao;
import com.entity.FuxiziliaoEntity;
import com.service.FuxiziliaoService;
import com.entity.vo.FuxiziliaoVO;
import com.entity.view.FuxiziliaoView;

@Service("fuxiziliaoService")
public class FuxiziliaoServiceImpl extends ServiceImpl<FuxiziliaoDao, FuxiziliaoEntity> implements FuxiziliaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuxiziliaoEntity> page = this.selectPage(
                new Query<FuxiziliaoEntity>(params).getPage(),
                new EntityWrapper<FuxiziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuxiziliaoEntity> wrapper) {
		  Page<FuxiziliaoView> page =new Query<FuxiziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuxiziliaoVO> selectListVO(Wrapper<FuxiziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuxiziliaoVO selectVO(Wrapper<FuxiziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuxiziliaoView> selectListView(Wrapper<FuxiziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuxiziliaoView selectView(Wrapper<FuxiziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
