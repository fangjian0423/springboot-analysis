package spring.study.beanpostproessor.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/6/22.
 */
@Aspect
@Component
public class MyAspect {

    @Around("execution(public * spring.study.beanpostproessor.embedded.BeanForAop.*(..))")
    public Object declareJointPointExpression(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("before aop");
        Object result = null;
        try {
            result = proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("after aop");
        return result;
    }


}
