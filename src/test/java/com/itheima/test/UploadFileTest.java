package com.itheima.test;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.spi.LoggerContext;
import org.junit.jupiter.api.Test;

@Slf4j
public class UploadFileTest {
    @Test
    public void test1(){
        String fileName = "ererewe.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }

    @Test
    public void testLogLevel(){
        System.out.println(Level.INFO.intLevel());
        System.out.println(Level.DEBUG.intLevel());
        System.out.println(Level.WARN.intLevel());
        System.out.println(Level.TRACE.intLevel());
        log.info("info");
        log.debug("debug");
        log.warn("warn");
        log.trace("trace");
    }
}
