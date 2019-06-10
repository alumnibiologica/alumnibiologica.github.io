package pt.ist.alumnibiologica.website.mapper;

import java.util.stream.Collectors;

import pt.ist.alumnibiologica.website.dto.UserDTO;
import pt.ist.alumnibiologica.website.entity.User;

public class UserMapper {

	public static User dtoToEntity(UserDTO userDto) {

		User user = new User(userDto.getUserName(), null);
		user.setUserId(userDto.getUserId());
		user.setPosts(userDto.getPostDTOs().stream().map(PostMapper::dtoToEntity).collect(Collectors.toList()));

		return user;

	}

	public static UserDTO entityToDto(User user) {

		UserDTO userDto = new UserDTO(user.getUserId(), user.getUserName(), null);
		userDto.setPostDTOs(user.getPosts().stream().map(PostMapper::entityToDto).collect(Collectors.toList()));
		return userDto;

	}

}
