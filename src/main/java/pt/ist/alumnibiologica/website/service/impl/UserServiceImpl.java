package pt.ist.alumnibiologica.website.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.ist.alumnibiologica.website.dto.UserDTO;
import pt.ist.alumnibiologica.website.mapper.UserMapper;
import pt.ist.alumnibiologica.website.repository.UserRepository;
import pt.ist.alumnibiologica.website.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDTO getUserById(Integer userId) {
		return UserMapper.entityToDto(userRepository.getOne(userId));
	}

	@Override
	public void saveUser(UserDTO userDto) {
		userRepository.save(UserMapper.dtoToEntity(userDto));
	}

	@Override
	public List<UserDTO> getAllUsers() {
		return userRepository.findAll().stream().map(UserMapper::entityToDto).collect(Collectors.toList());
	}

}
