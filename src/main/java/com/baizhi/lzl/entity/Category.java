package com.baizhi.lzl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category implements Serializable {
	private Integer cateid;
	private String catename;
}
