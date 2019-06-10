package pt.ist.alumnibiologica.website.dto;

public class PostDTO {

    Integer postId;

    String PostName;

    public PostDTO(Integer postId, String postName) {

        this.postId = postId;

        PostName = postName;

    }

    public PostDTO() {

    }

    public Integer getPostId() {

        return postId;

    }

    public void setPostId(Integer postId) {

        this.postId = postId;

    }

    public String getPostName() {

        return PostName;

    }

    public void setPostName(String postName) {

        PostName = postName;

    }

}
