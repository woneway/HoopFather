package com.woneway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woneway.domain.News;
import com.woneway.service.NewsService;

@Controller
@RequestMapping("/news")
public class NewsController {
	@Autowired
	NewsService newsService;
	
	@RequestMapping("")
	public String newsList(Model model){
		List<News> newsList = newsService.newsList();
		model.addAttribute("newsList",newsList);
		return "news";
	}
	
	@RequestMapping("/{newsId}")
	public String newsMore(@PathVariable(value="newsId") String newsId,Model model){
		News news = newsService.newsMore(newsId);
		model.addAttribute("news", news);
		return "newsMore";
	}
}
