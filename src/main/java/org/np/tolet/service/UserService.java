package org.np.tolet.service;

import org.np.tolet.domain.User;

import java.util.Scanner;

public interface UserService {
    User login(Scanner scanner) throws Exception;

    User registration(Scanner scanner) throws Exception;
}
