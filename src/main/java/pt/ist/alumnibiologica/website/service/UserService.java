package pt.ist.alumnibiologica.website.service;

import java.util.List;

import pt.ist.alumnibiologica.website.dto.UserDTO;

public interface UserService {

	UserDTO getUserById(Integer userId);
	void saveUser(UserDTO userDto);
	List<UserDTO> getAllUsers();

}

