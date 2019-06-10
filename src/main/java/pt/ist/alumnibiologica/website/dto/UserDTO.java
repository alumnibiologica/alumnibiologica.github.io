package pt.ist.alumnibiologica.website.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {
	
	Integer userId;
	String userName;
	List<PostDTO> postDtos = new ArrayList<>();

	public UserDTO(Integer userId, String userName, List<PostDTO> postDtos) {

        this.userId = userId;
        this.userName = userName;
        this.postDtos = postDtos;

    }

	public UserDTO() {

    }

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<PostDTO> getPostDTOs() {
		return postDtos;
	}

	public void setPostDTOs(List<PostDTO> postDtos) {
		this.postDtos = postDtos;
	}
}
