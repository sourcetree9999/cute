package com.example.cute.kind.ini;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * @author gu
 * @date 2022/6/16
 */
public class ProjectConstraintViolationFailureAnalyzer extends AbstractFailureAnalyzer {
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, Throwable cause) {
//        String desc =S
//        return new FailureAnalysis()
        System.out.println("aa");
        return null;
    }
}
