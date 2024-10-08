# 프록시 패턴(Proxy Pattern)
![img.png](img.png)
## 정의
- 다른 객체에 대한 접근을 제어하기 위해 그 객체인 대리인(Proxy) 역할을 하는 클래스를 사용하는 디자인패턴.
- 프록시 객체는 원본 객체와 동일한 인터페이스를 구현하여, 클라이언트가 원본 객체를 사용하듯이 프록시를 사용할 수 있도록 합니다.
## 목적
- 실제 객체에 대한 접근을 제어하거나, 추가적인 기능을 제공하는 데 대리 객체를 사용하는 패턴
### 구조
- 실제 객체 대신 클라이언트와 실제 객체 사이에 프록시를 두어 요청을 처리합니다.


## 이름의 의미
- `Proxy`는 대리인, 대변자를 의미합니다. 
- 이 패턴에서 프록시 객체는 실제 객체에 대한 대리자 역할을 하며, 클라이언트가 실제 객체와 상호작용 하는 방식을 중개합니다.

## 사용 이유
### 1. 접근 제어
- 원본 객체에 대한 접근을 제한하거나 제어할 때, 예를 들어 원격 객체에 대한 접근을 캡슐화합니다.
### 2. 지연 초기화 (Lazy Initializaition)
- 실제 객체를 미리 생성하지 않고, 필요할 때까지 생성을 지연합니다.
### 3. 로깅 및 캐싱
- 원본 객체에 대한 접근 전후에 추가적인 작업(ex: 로깅, 캐싱, 인증)을 수행할 때 유용하다.

## 유형
### 가상 프록시(Virtual Proxy)
- 실제 객체의 생성과 초기화를 지연시킨다.
### 원격 프록시 (Remote Proxy)
- 원격 서버에 위치한 객체에 접근하는 역할
### 보호 프록시(Protection Proxy)
- 객체에 대한 접근을 제어하고, 권한을 관리한다.
### 스마트 프록시(Smart Proxy)
- 추가적인 행동을 수행한다. (예: 참조횟수 관리, 캐싱, 로깅 등)


## 순서 및 설명
1. Subject 인터페이스
- RealSubject와 Proxy가 구현해야 하는 공통 인터페이스로, 동일한 메서드 request를 정의합니다.
2. RealSubject 클래스
- 실제로 작업을 수행하는 클래스입니다. 여기서는 request 메서드가 클라이언트의 요청을 처리합니다.
3. Proxy 클래스
- RealSubject에 대한 대리 역할을 수행합니다. request 메서드를 통해 RealSubject에 대한 접근을 제어하며, 
- 필요할 때만 RealSubject 객체를 생성합니다. 추가적으로, RealSubject의 작업 전후에 추가적인 작업(예: 로깅)을 수행할 수 있습니다.
4. Main 클래스
- 클라이언트 코드로, Proxy 객체를 생성하고 request 메서드를 호출하여 실제 작업을 수행합니다. 프록시를 사용함으로써 RealSubject의 생성 및 접근을 제어할 수 있습니다.


### 정리
- 프록시 패턴은 클라이언트 코드의 변경 없이 실제 객체에 대한 접근 제어, 최적화, 추가 기능 구현을 가능하게 해주며, 
- 시스템의 구조와 동작을 명확히 하는 데 도움을 줍니다.