package Util;

public enum Urls {
    HOME_PAGE("http://localhost:3000"),
    LOGIN_PAGE("http://localhost:3000/login"),
    REGISTRATION_PAGE("http://localhost:3000/userEntity-registration"),
    PROFILE_PAGE("http://localhost:3000/profile"),
    EXPLORE_PAGE("http://localhost:3000/explore");

    public final String url;

    Urls(String url) {
        this.url = url;
    }
}
