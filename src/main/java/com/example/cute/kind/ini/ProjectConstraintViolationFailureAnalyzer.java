package com.example.cute.kind.ini;

import org.springframework.beans.factory.BeanNotOfRequiredTypeException;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * @author gu
 * @date 2022/6/16
 */
public class ProjectConstraintViolationFailureAnalyzer extends AbstractFailureAnalyzer<BeanNotOfRequiredTypeException> {
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, BeanNotOfRequiredTypeException ex) {

//        return null;
//        return new FailureAnalysis()
        String desc = String.format("The bean %s could not be injected as %s "
                        + "because it is of type %s",
                ex.getBeanName(),
                ex.getRequiredType().getName(),
                ex.getActualType().getName());
        return new FailureAnalysis(desc, desc, ex);
    }
}
