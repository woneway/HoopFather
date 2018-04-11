package com.woneway.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woneway.domain.Skill;
import com.woneway.mapper.SkillMapper;
import com.woneway.service.SkillService;

@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	SkillMapper skillMapper;
	
	@Override
	public List<Skill> skillList() {
		// TODO Auto-generated method stub
		return skillMapper.skillList();
	}

	@Override
	public Skill skillMore(String skillId) {
		// TODO Auto-generated method stub
		return skillMapper.skillMore(skillId);
	}

}
