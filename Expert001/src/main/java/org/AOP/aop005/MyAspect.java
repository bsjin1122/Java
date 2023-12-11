package org.AOP.aop005;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect { 
    @Before("execution(* runSomething())")
    public void before(JoinPoint joinPoint){
        System.out.println("얼굴 인식 확인: 문을 개방하라");
        //System.out.println("열쇠로 문을 열고 집에 들어간다.");
    }

    @After("execution(* runSomething())")
    public void lockDoor(JoinPoint joinPoint){
        System.out.println("주인님 나갔다: 어이 문 잠가!");
    }
    // lockDoor에서 대상 메서드인 runSomething()의 반환값도 인자로 받을 수 있고, 프록시를 통해 최종 반환값을 조작하는 것도 가능하다.
}
