package com.sangkon.mvc;

import com.sangkon.mvc.annotation.Controller;
import com.sangkon.mvc.model.User;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Annotation;
import java.util.*;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class ReflectionTest {
    private static final Logger logger = LoggerFactory.getLogger(ReflectionTest.class);

    @Test
    void controllerScan() {
        Set<Class<?>> beans = getTypesAnnotatedWith(List.of(Controller.class, Service.class));
        logger.debug("beans: [{}]", beans);
    }

    @Test
    void showClass() {
        Class<User> clazz = User.class;
        logger.debug(clazz.getName());
        logger.debug("User all declared fields: [{}]", Arrays.stream(clazz.getDeclaredFields()).collect(Collectors.toList()));
        logger.debug("User all declared constructors: [{}]", Arrays.stream(clazz.getDeclaredConstructors()).collect(Collectors.toList()));
        logger.debug("User all declared methods: [{}]", Arrays.stream(clazz.getDeclaredMethods()).collect(Collectors.toList()));
    }

    @Test
    void load() throws ClassNotFoundException {
        // Case1
        Class<User> clazz1 = User.class;

        // Case2
        User user = new User("Hello", "World");
        Class<? extends User> clazz2 = user.getClass();

        // Case3
        Class<?> clazz3 = Class.forName("com.sangkon.mvc.model.User");

        assertThat(clazz1 == clazz2).isTrue();
        assertThat(clazz2 == clazz3).isTrue();
        assertThat(clazz3 == clazz1).isTrue();
    }

    private Set<Class<?>> getTypesAnnotatedWith(List<Class<? extends Annotation>> annotations) {
        Reflections reflections = new Reflections("com.sangkon.mvc");
        Set<Class<?>> beans = new HashSet<>();
        annotations.forEach(annotation -> beans.addAll(reflections.getTypesAnnotatedWith(annotation)));
        return beans;
    }


}