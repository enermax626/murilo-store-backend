package com.murilo.project.projetomurilo.mapper;

import org.mapstruct.Mapper;
import com.murilo.project.projetomurilo.domain.User;
import com.murilo.project.projetomurilo.dto.UserAllDTO;
import com.murilo.project.projetomurilo.dto.UserRegisterDTO;

@Mapper(componentModel = "spring")
public interface UserMapper {
	

	
	public User toUser(UserRegisterDTO userRegisterDTO);
	
	public UserRegisterDTO toUserRegisterDTO(User user);
	

	public User toUser(UserAllDTO userRegisterDTO);
	
	public UserAllDTO toUserAllDTO(User user);
}
