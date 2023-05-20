package com.sangkon.mvc;

public interface HandlerMapping {
    Object findHandler(HandlerKey handlerKey);
}
