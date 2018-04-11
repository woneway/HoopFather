package com.woneway.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.woneway.domain.News;

@Component
@Mapper
public interface NewsMapper {

	@Select("select * from site_news")
	List<News> newsList();

	@Select("select * from site_news where newsId=#{newsId}")
	News newsMore(String newsId);

}
