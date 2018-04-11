package com.woneway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woneway.domain.Skill;
import com.woneway.service.SkillService;

@Controller
@RequestMapping("/skill")
public class SkillController {

	@Autowired
	SkillService skillService;
	
	@RequestMapping("")
	public String skillList(Model model){
		List<Skill> skillList = skillService.skillList();
		
		model.addAttribute("skillList",skillList);
		
		return "skill";
	}
	
	@RequestMapping("/{skillId}")
	public String skillMore(@PathVariable(value="skillId") String skillId,Model model){
		Skill skill = skillService.skillMore(skillId);
		model.addAttribute("skill", skill);
		return "skillMore";
	}
}
