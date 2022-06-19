package com.example.cute.kind.ini;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author gu
 * @date 2022/6/16
 */
@Component
public class ListenerConfig {

    @EventListener(classes = { ApplicationStartingEvent.class, ContextStoppedEvent.class })
    public void handleMultipleEvents() {
        System.out.println("Multi-event listener invoked");
    }

    @EventListener
    public void handleContextRefreshEvent(ContextRefreshedEvent ctxStartEvt) {
        System.out.println("Context Start Event received.");
    }
}
