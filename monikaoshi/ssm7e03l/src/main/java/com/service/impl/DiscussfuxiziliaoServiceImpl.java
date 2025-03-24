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


import com.dao.DiscussfuxiziliaoDao;
import com.entity.DiscussfuxiziliaoEntity;
import com.service.DiscussfuxiziliaoService;
import com.entity.vo.DiscussfuxiziliaoVO;
import com.entity.view.DiscussfuxiziliaoView;

@Service("discussfuxiziliaoService")
public class DiscussfuxiziliaoServiceImpl extends ServiceImpl<DiscussfuxiziliaoDao, DiscussfuxiziliaoEntity> implements DiscussfuxiziliaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfuxiziliaoEntity> page = this.selectPage(
                new Query<DiscussfuxiziliaoEntity>(params).getPage(),
                new EntityWrapper<DiscussfuxiziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfuxiziliaoEntity> wrapper) {
		  Page<DiscussfuxiziliaoView> page =new Query<DiscussfuxiziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfuxiziliaoVO> selectListVO(Wrapper<DiscussfuxiziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfuxiziliaoVO selectVO(Wrapper<DiscussfuxiziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfuxiziliaoView> selectListView(Wrapper<DiscussfuxiziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfuxiziliaoView selectView(Wrapper<DiscussfuxiziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
