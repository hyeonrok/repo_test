package com.example.demo.infra.codegroup;

import java.util.List;

public interface CodeGroupDao {

	//사다리에 dto 넣
	public List<CodeGroupDto> selectList();
	
	public CodeGroupDto selectOne();
}
