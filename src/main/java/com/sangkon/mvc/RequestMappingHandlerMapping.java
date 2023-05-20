package com.sangkon.mvc;

import com.sangkon.mvc.controller.Controller;
import com.sangkon.mvc.controller.HomeController;
import com.sangkon.mvc.controller.UserListController;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping {
    private Map<String, Controller> mappings = new HashMap<>();

    void init() {
        mappings.put("/", new HomeController());
        mappings.put("/user", new UserListController());
    }

    public Controller findHandler(String urlPath) {
        return mappings.get(urlPath);
    }
}
