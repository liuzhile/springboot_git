package com.baizhi.lzl.service;

import com.baizhi.lzl.dto.MoviePageDto;
import com.baizhi.lzl.entity.Category;
import com.baizhi.lzl.entity.Movie;

import java.util.List;

public interface MovieService {
	
	public MoviePageDto queryByPage(Integer curPage, Integer pageSize);
	public Movie query(Integer mid);
	public void update(Movie m);
	public List<Category> getCategorys();
}
