package com.hw2.question3and7emlakcepte.model;

import com.hw2.question3and7emlakcepte.model.enums.SearchType;

public class Search {

    private SearchType searchType;
    private User user;
    private String searchedWord;

    public Search(SearchType searchType, User user, String searchedWord) {
        this.searchType = searchType;
        this.user = user;
        this.searchedWord = searchedWord;
    }

    public SearchType getSearchType() {
        return searchType;
    }

    public void setSearchType(SearchType searchType) {
        this.searchType = searchType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSearchedWord() {
        return searchedWord;
    }

    public void setSearchedWord(String searchedWord) {
        this.searchedWord = searchedWord;
    }

    @Override
    public String toString() {
        return "Search{" +
                "searchType=" + searchType +
                ", user=" + user.getName() +
                ", searchedWord='" + searchedWord + '\'' +
                '}';
    }
}
