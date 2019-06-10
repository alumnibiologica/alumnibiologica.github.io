package pt.ist.alumnibiologica.website.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Post {

	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer postId;

	@Column
	private String postName;

	@ManyToOne
	private User user;

	public Post() {

	}

	public Post(String postName, User user) {
		this.postName = postName;
		this.user = user;
	}

	public Post(String postName) {
		this.postName = postName;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
