package com.woneway.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.woneway.domain.News;

@Service
public interface NewsService {

	public List<News> newsList();

	public News newsMore(String newsId);

}
