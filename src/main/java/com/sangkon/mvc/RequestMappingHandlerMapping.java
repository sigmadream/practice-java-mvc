package com.sangkon.mvc;

import com.sangkon.mvc.controller.Controller;
import com.sangkon.mvc.controller.HomeController;
import com.sangkon.mvc.controller.RequestMethod;
import com.sangkon.mvc.controller.UserListController;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping {
    private Map<HandlerKey, Controller> mappings = new HashMap<>();

    void init() {
        mappings.put(new HandlerKey("/", RequestMethod.GET), new HomeController());
        mappings.put(new HandlerKey( "/users", RequestMethod.GET), new UserListController());

    }

    public Controller findHandler(HandlerKey urlPath) {
        return mappings.get(urlPath);
    }
}
