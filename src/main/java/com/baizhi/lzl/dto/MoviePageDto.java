package com.baizhi.lzl.dto;

import com.baizhi.lzl.entity.Movie;

import java.io.Serializable;
import java.util.List;

public class MoviePageDto implements Serializable {
	
	private Integer total;
	private List<Movie> rows;
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<Movie> getRows() {
		return rows;
	}
	public void setRows(List<Movie> rows) {
		this.rows = rows;
	}
	
}
