package com.sangkon.examples.web;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RequestLineTest {

    @Test
    void create() {
        RequestLine requestLine1 = new RequestLine("GET /calculate?operand1=11&operator=*&operand2=55 HTTP/1.1");
        RequestLine requestLine2 = new RequestLine("GET", "/calculate", "operand1=11&operator=*&operand2=55");

        assertThat(requestLine1).isNotNull();
    }
}
