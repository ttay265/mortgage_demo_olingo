package com.morgage.repository;

public interface SearchRepository {
    String SEARCH_QUERY = "select *" +
            "from shop sh" +
            "where sh.name like '%:input%'";

}
