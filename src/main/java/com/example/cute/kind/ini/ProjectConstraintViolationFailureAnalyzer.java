package com.example.cute.kind.ini;

import cn.hutool.json.JSONUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNotOfRequiredTypeException;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @author gu
 * @date 2022/6/16
 */
public class ProjectConstraintViolationFailureAnalyzer extends AbstractFailureAnalyzer<BeanNotOfRequiredTypeException>
        implements BeanFactoryAware, EnvironmentAware {
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, BeanNotOfRequiredTypeException ex) {

//        return null;
//        return new FailureAnalysis()
        String desc = String.format("The bean %s could not be injected as %s "
                        + "because it is of type %s",
                ex.getBeanName(),
                ex.getRequiredType().getName(),
                ex.getActualType().getName());
        FailureAnalysis failureAnalysis=new FailureAnalysis(desc, desc, ex);
        JSONUtil.toJsonStr(failureAnalysis);
        return failureAnalysis;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("aaa");
    }

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("aaa");
    }
}
