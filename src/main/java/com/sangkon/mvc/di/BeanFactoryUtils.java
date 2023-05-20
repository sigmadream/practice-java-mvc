package com.sangkon.mvc.di;

import com.sangkon.mvc.annotation.Inject;
import org.reflections.util.ReflectionUtilsPredicates;

import java.lang.reflect.Constructor;
import java.util.Set;

import static org.reflections.ReflectionUtils.getAllConstructors;

public class BeanFactoryUtils {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static Constructor<?> getInjectedConstructor(Class<?> clazz) {
        Set<Constructor> injectedConstructors = getAllConstructors(clazz, ReflectionUtilsPredicates.withAnnotation(Inject.class));
        if (injectedConstructors.isEmpty()) {
            return null;
        }
        return injectedConstructors.iterator().next();
    }
}

