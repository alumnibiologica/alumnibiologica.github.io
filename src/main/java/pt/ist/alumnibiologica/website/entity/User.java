package pt.ist.alumnibiologica.website.entity;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class User implements Serializable {

	private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;

	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Id
	private Integer userId;

	@Column
	private String userName;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Post> posts = new LinkedList<>();

	public User() {

	}

	public User(String userName, List<Post> posts) {
		this.userName = userName;
		this.posts = posts;
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

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

}
