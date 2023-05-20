package com.sangkon.mvc.view;

public interface ViewResolver {
    View resolveViewName(String viewName);
}