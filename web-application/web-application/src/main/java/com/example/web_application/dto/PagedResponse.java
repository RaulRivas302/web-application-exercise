package com.example.web_application.dto;

import java.util.List;

public class PagedResponse<T> {
    private List<T> content;
    private boolean hasNextPage;

    public PagedResponse(List<T> content, boolean hasNextPage) {
        this.content = content;
        this.hasNextPage = hasNextPage;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }
}
