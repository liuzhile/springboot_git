package com.baizhi.lzl.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie implements Serializable {
	
	private Integer mid;
	private String mname;
	private String director;
	private String describe;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date openDate;
	private Integer cid;
	private Category category;

}
