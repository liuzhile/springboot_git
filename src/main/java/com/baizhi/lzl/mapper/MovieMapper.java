package com.baizhi.lzl.mapper;

import com.baizhi.lzl.entity.Category;
import com.baizhi.lzl.entity.Movie;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MovieMapper {
	
	public List<Movie> queryByPage(@Param("curPage") Integer curPage, @Param("pageSize") Integer pageSize);
	public Integer getTotalRows();
	public Movie query(Integer id);
	public void update(Movie m);
	public List<Category> getCategorys();
	
}
