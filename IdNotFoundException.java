package com.mini.project;

import javax.persistence.NoResultException;

public class IdNotFoundException extends NoResultException {
	
	@Override
	public String getMessage()
	{
		return "there is no student with this roll no";
	}

	
}
