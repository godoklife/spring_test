package WEBSITENAME;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // 어노테이션과 class 사이에 줄바꿈 있으면 안됨.
public class Start {

    public static void main(String[] args) {
        SpringApplication.run(Start.class);
            // SpringApplication : 스프링 어플리케이션 클래스
                // .run(현재클래스명); : 스프링 어플리케이션을 실행
    }
}

// Springboot 패키지 구성 규칙
    // ** src/main/java 부터 path 가 시작.
    // 1. 최상단(root)의 패키지가 필요. ->> 패키지명은 일반적으로 웹 사이트의 이름을 명칭으로 함.
    // 2. Springboot 시작 클래스는 최상단(root)에 존재해야 함.
    // 3. 이 path 에 컨트롤, 서비스, DTO패키지, DAO패키지 구성할것.

// @ : 어노테이션
    // @ VS extend vs implement
    // 1. extend : 하나의 클래스로부터 메모리를 상속 받음
    // 2. implement : 여러개의 인터페이스를 구현
    // 3. @[어노테이션] : 해당 클레스에 메타데이터[프로그램] 주입

// 어노테이션
    // 1. @SpringBootApplication : 스프링부트 실행 & 설정 어노테이션
        // 1) 스프링부트를 실행하는데 필요한 기본 설정값을 로드 [ MVC 컴포넌트 로드드]
        // 2) 내장 서버(탐켓)와 클래스를 연결
            // s내장 서버는 기본 포트 번호가 8080->>
            // 포트 변경?? ->>  resources/application.properties 파일 생성 후, server.port=**** 으로 변경 가능.

// 프론트엔드 [ html, css, js 등 ] 
    // src/main/resources/분류 에 작성
        // static : js, css, img 파일 등등
        // templates : html