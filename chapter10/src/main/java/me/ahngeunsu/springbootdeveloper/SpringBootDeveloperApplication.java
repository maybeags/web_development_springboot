package me.ahngeunsu.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBootDeveloperApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }
}
/*
    사전 지식 : OAuth
        - 제 3의 서비스에 계정 관리를 맡기는 방식. naver/Google/kakao로 로그인하기와 같은 예시

        관련 용어 정리
            리소스 오너(Resource Owner) : 인증 서버에 자신의 정보를 사용하도록 허용하는 주체.
                서비스를 이용하는 사용자가 리소스 오너에 해당.
            리소스 서버(Resource Server) : 리소스 오너의 정보를 가지며, 리소스 오너의 정보를
                보호하는 주체를 의미하고, 네이버, 구글, 카카오, 페이스북이 리소스 서버에 해당.
            인증 서버(Authorization Server) : 클라이언트에게 리소스 오너의 정보에 접근할 수 있는
                토큰을 발급하는 역할을 하는 애플리케이션을 의미
            클라이언트 애플리케이션(Client Application) : 인증 서버에게 인증을 받고 리소스 오너의
                리소스를 사용하는 주체를 의미.

        OAuth를 사용하면 인증 서버에서 발급받은 토큰을 사용해서 리소스서버에
            리소스오너의 정보를 요청하고 응답 받아 사용 가능.
            그렇다면 리소스오너의 정보를 어떻게 취득할 수 있는지에 대한 방법이 필요.

            리소스 오너 정보를 취득하는 네 가지 방법
                1) 권한 부여 코드 승인 타입(Authorization Code Grant Type) :
                    OAuth 2.0에서 가장 대중적인 인증 방법. 클라이언트가 리소스에 접근하는 데 사용.
                    권한에 접근할 수 있는 코드와 리소스 오너에 대한 액세스 토큰을 발급받는 방식.

                2) 암시적 승인(Implicit Grant Type) :
                    서버가 없는 자바스크립트 웹 애플리케이션 클라이언트에서 주로 사용.
                    클라이언트가 요청을 보내면 리소스 오너의 인증 과정 이외에는 권한 코드 교환 등의
                    별다른 인증 과정을 거치지 않고 액세스 토큰을 제공 받는 형식

                3) 리소스 소유자 암호 자격증명 승인 타입(Resource Owner Password Credentials) :
                    클라이언트의 패스워드를 이용해서 액세스 토큰에 대한 사용자의 자격 증명을 교환하는 방식

                4) 클라이언트 자격 증명 승인 타입(Client Credentials Grant) :
                    클라이언트가 컨텍스트 외부에서 액세스 토큰을 얻어 특정 리소스에 접근을 요청할 때 사용하는 방식

                권한 부여 코드 승인 타입이란?
                    애플리케이션 / 리소스 오너(사용자) / 리소스 서버 / 인증 서버가 어떤 순서로 인증을 하는지 알 필요가 있습니다.

                                3. 인증 코드 발급
                애플리케이션 ----------------------------→ 인증 서버
                    ↑   \      4. 액세스 토큰으로 발급           ↑
                    |    \                                  |
                    |     \                                 |
                    |      \                                |
     1. 권한 요청    |       5. 액세스 토큰으로 데이터에 접근    | 인증 서버에
                    |                              \        | 인증 작업 위임
                    |                               \       |
                    |                                \      |
                    |                                 \     |
                    |                                   ↘︎  |
                리소스 오너 ←---------------------------- 리소스 서버
                              2. 데이터 접근용 권한 부여

 */