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


import com.dao.DiscusscankaowenxianDao;
import com.entity.DiscusscankaowenxianEntity;
import com.service.DiscusscankaowenxianService;
import com.entity.vo.DiscusscankaowenxianVO;
import com.entity.view.DiscusscankaowenxianView;

@Service("discusscankaowenxianService")
public class DiscusscankaowenxianServiceImpl extends ServiceImpl<DiscusscankaowenxianDao, DiscusscankaowenxianEntity> implements DiscusscankaowenxianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusscankaowenxianEntity> page = this.selectPage(
                new Query<DiscusscankaowenxianEntity>(params).getPage(),
                new EntityWrapper<DiscusscankaowenxianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusscankaowenxianEntity> wrapper) {
		  Page<DiscusscankaowenxianView> page =new Query<DiscusscankaowenxianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusscankaowenxianVO> selectListVO(Wrapper<DiscusscankaowenxianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusscankaowenxianVO selectVO(Wrapper<DiscusscankaowenxianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusscankaowenxianView> selectListView(Wrapper<DiscusscankaowenxianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusscankaowenxianView selectView(Wrapper<DiscusscankaowenxianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
