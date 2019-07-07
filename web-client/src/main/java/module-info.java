module rent.auto.web.client {


    requires java.sql;
    requires undertow.core;
    requires undertow.servlet;
    requires spring.web;
    requires spring.beans;
    requires spring.context;
    requires spring.webmvc;
    requires beta.jboss.servlet.api_4_0;


    opens ro.ubbcluj.webclient to spring.core;

    exports ro.ubbcluj.webclient;
}