package com.sangkon.mvc;

import com.sangkon.mvc.controller.*;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping {
    private Map<HandlerKey, Controller> mappings = new HashMap<>();

    void init() {
        mappings.put(new HandlerKey("/user/form", RequestMethod.GET), new ForwardController("/user/form.jsp"));
        mappings.put(new HandlerKey("/", RequestMethod.GET), new HomeController());
        mappings.put(new HandlerKey("/users", RequestMethod.GET), new UserListController());
        mappings.put(new HandlerKey("/users", RequestMethod.POST), new UserCreateController());
    }

    public Controller findHandler(HandlerKey urlPath) {
        return mappings.get(urlPath);
    }
}
