package com.ramjava.lente.bonen.scopes.singleton;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton") -- not necessary
//@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON) -- standard way
public class SingletonDemonstratie {
    // The default scope for a bean is Singleton
}
