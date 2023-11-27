package org.np.tolet.service;

import org.np.tolet.domain.Post;
import org.np.tolet.domain.User;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public interface PostService {
    Post createPost(Scanner scanner, User user) throws IOException;

    Post deletePost(Post post) throws IOException;

    TreeSet<Post> getAllPost() throws IOException;

    TreeSet<Post> getAllPostByArea(int areaId) throws IOException;

    TreeSet<Post> getAllPostByUser(String userName) throws IOException;
}
