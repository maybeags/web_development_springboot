package me.ahngeunsu.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
5장. '데이터베이스' 조작이 편해지는 'ORM'
    1. 데이터베이스(database)란?
        데이터를 효율적으로 보관하고 꺼내볼 수 있는 곳.

        DBMS(DataBase Management System) : 기본적으로 데이터베이스는 많은 사람이 공유할 수 있어야 하고,
            동시 접근이 가능해야 하는 등 많은 요구 사항이 존재함.
                이를 만족시키면서도 효율적으로 데이터베이스를 관리하는 체계가 DBMS.
                대부분 개발자들이 편하게 DB라고 이야기하는 MySQL, Oracle, DBeaver와 같은 것들은
                실제로는 DB가 아니라 DBMS에 해당

            관계형 DBMS
                Relational DBMS을 줄여서 RDBMS라고 부름. 테이블 형태로 이루어진 데이터 저장소.

               회원 테이블
                1열           2열           3열
               +----------------------------------+
               | ID         | 이메일       | 나이  | - header / column
               ------------------------------------
               | 1          | a@test.com  | 10    | - 1행
               | 2          | b@test.com  | 20    | - 2행
               | 3          | c@test.com  | 30    | - 3행
               +----------------------------------+
                기본키(PK) :
                Prime Key

 */
@SpringBootApplication
public class SpringBootDeveloperApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }
}
