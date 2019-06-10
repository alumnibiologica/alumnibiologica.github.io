package pt.ist.alumnibiologica.website.mapper;

import pt.ist.alumnibiologica.website.dto.PostDTO;
import pt.ist.alumnibiologica.website.entity.Post;

public class PostMapper {

	public static Post dtoToEntity(PostDTO PostDTO) {

		Post Post = new Post(PostDTO.getPostName(), null);
		Post.setPostId(PostDTO.getPostId());
		return Post;

	}

	public static PostDTO entityToDto(Post post) {

		return new PostDTO(post.getPostId(), post.getPostName());

	}

}
