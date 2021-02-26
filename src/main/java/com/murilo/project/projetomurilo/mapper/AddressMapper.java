package com.murilo.project.projetomurilo.mapper;

import org.mapstruct.Mapper;

import com.murilo.project.projetomurilo.domain.Address;
import com.murilo.project.projetomurilo.dto.AddressAllDTO;
import com.murilo.project.projetomurilo.dto.AddressRegisterDTO;

@Mapper(componentModel = "spring")
public interface AddressMapper {

	
	public Address toAddress(AddressAllDTO addressAllDTO);
	
	public Address toAddress(AddressRegisterDTO addressRegisterDTO);
	
	public AddressAllDTO toAddressAllDTO(Address address);
	
	public AddressRegisterDTO toAddressRegisterDTO(Address address);
	
	
}
