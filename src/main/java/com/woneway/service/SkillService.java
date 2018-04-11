package com.woneway.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.woneway.domain.Skill;

@Service
public interface SkillService {

	List<Skill> skillList();

	Skill skillMore(String skillId);

}
