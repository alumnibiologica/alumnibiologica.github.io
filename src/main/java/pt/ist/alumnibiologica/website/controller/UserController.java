package pt.ist.alumnibiologica.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pt.ist.alumnibiologica.website.dto.UserDTO;
import pt.ist.alumnibiologica.website.service.UserService;
import pt.ist.alumnibiologica.website.utils.Constants;

@RequestMapping("/user")
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(Constants.GET_USER_BY_ID)
	public UserDTO getUserById(@PathVariable Integer userId) {
		return userService.getUserById(userId);
	}

	@RequestMapping(Constants.GET_ALL_USERS)
	public List<UserDTO> getAllUsers() {
		return userService.getAllUsers();
	}

	@RequestMapping(value = Constants.SAVE_USER, method = RequestMethod.POST)
	public void saveUser(@RequestBody UserDTO userDto) {
		userService.saveUser(userDto);
	}

}
