package com.woneway.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woneway.domain.News;
import com.woneway.mapper.NewsMapper;
import com.woneway.service.NewsService;

@Service
public class NewServiceImpl implements NewsService {

	@Autowired
	NewsMapper newsMapper;
	
	@Override
	public List<News> newsList() {
		// TODO Auto-generated method stub
		List<News> newsList = newsMapper.newsList();
		
		return newsList;
	}

	@Override
	public News newsMore(String newsId) {
		// TODO Auto-generated method stub
		return newsMapper.newsMore(newsId);
	}

}
