package com.sangkon.mvc;

import com.sangkon.mvc.annotation.Controller;
import com.sangkon.mvc.annotation.Service;
import com.sangkon.mvc.controller.HomeController;
import com.sangkon.mvc.di.BeanFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BeanFactoryTest {
    private Reflections reflections;
    private BeanFactory beanFactory;

    @BeforeEach
    @SuppressWarnings("unchecked")
    public void setup() {
        reflections = new Reflections("com.sangkon.mvc");
        Set<Class<?>> preInstantiatedClazz = getTypesAnnotatedWith(Controller.class, Service.class);
        beanFactory = new BeanFactory(preInstantiatedClazz);
    }

    private Set<Class<?>> getTypesAnnotatedWith(Class<? extends Annotation>... annotations) {
        return Arrays.stream(annotations).flatMap(annotation -> reflections.getTypesAnnotatedWith(annotation).stream()).collect(Collectors.toSet());
    }

    @Test
    public void diTest() {
        HomeController homeController = new HomeController();
        assertNotNull(homeController);
    }
}
