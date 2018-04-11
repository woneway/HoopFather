package com.woneway.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.woneway.domain.Skill;

@Mapper
@Component
public interface SkillMapper {

	@Select("select * from site_skill")
	List<Skill> skillList();
	@Select("select * from site_skill where skillId=#{skillId}")
	Skill skillMore(String skillId);

}
