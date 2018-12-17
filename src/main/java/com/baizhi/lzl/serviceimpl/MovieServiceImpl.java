package com.baizhi.lzl.serviceimpl;

import com.baizhi.lzl.dto.MoviePageDto;
import com.baizhi.lzl.entity.Category;
import com.baizhi.lzl.entity.Movie;
import com.baizhi.lzl.mapper.MovieMapper;
import com.baizhi.lzl.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieMapper movieMapper;
	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public MoviePageDto queryByPage(Integer curPage, Integer pageSize) {
		MoviePageDto dto = new MoviePageDto();
		dto.setRows(movieMapper.queryByPage(curPage, pageSize));
		dto.setTotal(movieMapper.getTotalRows());
		return dto;
	}
	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public Movie query(Integer mid) {
		return movieMapper.query(mid);
	}
	@Override
	public void update(Movie m) {
		movieMapper.update(m);
	}
	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public List<Category> getCategorys() {
		return movieMapper.getCategorys();
	}

}
