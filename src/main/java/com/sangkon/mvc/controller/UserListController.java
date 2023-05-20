package com.sangkon.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class UserListController implements Controller {
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("users", List.of());
        return "/user/list.jsp";
    }
}