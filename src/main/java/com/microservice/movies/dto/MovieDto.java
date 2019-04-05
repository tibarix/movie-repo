package com.microservice.movies.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@JsonInclude(Include.NON_NULL)
public class MovieDto {
	
	private Long id;
	
	private String name;
	
	private String description;
	
	private Double rate = null;

}
