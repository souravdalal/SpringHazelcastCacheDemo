package com.blogspot.souravdalal.model;

import java.io.Serializable;
import java.util.List;

import com.google.common.collect.Lists;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String isbn;
	
	private String name;
	
	private List<String> authors = Lists.newArrayList();
	

}
