package com.example.nms.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class MessageConstants {

    public static final String USER_ID_NOT_FOUND = "User with id %s was not found";
    public static final String USER_USERNAME_NOT_FOUND = "User with username %s was not found";

    public static final String USERNAME_EMPTY = "Username cannot be empty";
    public static final String USERNAME_LENGTH = "Username length must be between 2 and 255 characters";
    public static final String USERNAME_ALREADY_TAKEN = "Username %s is already taken";

    public static final String EMAIL_EMPTY = "Email cannot be empty";
    public static final String EMAIL_NOT_VALID = "Email should be valid";
    public static final String EMAIL_ALREADY_TAKEN = "Email %s is already taken";

    public static final String PASSWORD_EMPTY = "Password cannot be empty";

    public static final String NOTE_NOT_FOUND = "Note %s was not found";
    public static final String NOTE_TITLE_EMPTY = "Title cannot be empty or consist only of whitespace characters";
    public static final String NOTE_TITLE_LENGTH = "Title must be between 1 and 255 characters";
    public static final String NOTE_TITLE_EXISTS = "Note with title %s already exists";
    public static final String NOTE_SEARCH_TERM_EMPTY = "Search term cannot be empty";
    public static final String NOTE_CONTENT_LENGTH = "Note contents cannot exceed 10,000 characters";

    public static final String ROLE_NOT_FOUND = "Role %s was not found";
    public static final String ROLE_ID_NOT_FOUND = "Role with id %s was not found";
    public static final String ROLE_NAME_EMPTY = "Role name cannot be empty";
    public static final String ROLE_NAME_INVALID = "Role name must start with 'ROLE_'";
    public static final String ROLE_NAME_EXISTS = "Role with name %s already exists";
    public static final String ROLE_LENGTH = "Role name must be at least 6 characters long (including ROLE_)";

    public static final String AUTH_INVALID_CREDENTIALS = "Invalid username or password";
    public static final String AUTH_ACCOUNT_LOCKED = "Your account has been locked";
    public static final String AUTH_ACCOUNT_DISABLED = "Your account has been disabled";

    public static final String TOKEN_EMPTY = "JWT Token cannot be empty";
    public static final String TOKEN_UUID_CLAIM = "UUID claim is missing";
    public static final String TOKEN_INVALID = "Invalid JWT Token: %s";

}
