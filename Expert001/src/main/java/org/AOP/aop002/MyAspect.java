package org.AOP.aop002;
// 기존 @ 어노테이션 기반 - MyAspect.java가 스프링 프레임워크에 종속

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect // AOP에서 사용하겠다는 의미
public class MyAspect { 
    @Before("execution(* runSomething())") // 대상 메서드 실행 전에 이 메서드를 실행하겠다는 의미
    public void before(JoinPoint joinPoint){
        // JoinPoint : @Before에서 선언된 메서드인 aop002.Boy.runSomething()을 의미한다.
        System.out.println("얼굴 인식 확인: 문을 개방하라");
        //System.out.println("열쇠로 문을 열고 집에 들어간다.");
    }
}
