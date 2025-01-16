package me.ahngeunsu.springbootdeveloper.config.jwt;

import lombok.Builder;
import lombok.Getter;

import java.time.Duration;
import java.util.Date;
import java.util.Map;

import static java.util.Collections.emptyMap;

@Getter
public class JwtFactory {
    private String subject = "test@email.com";
    private Date isuuedAt = new Date();
    private Date expiration = new Date(new Date().getTime() +
            Duration.ofDays(14).toMillis());
    private Map<String, Object> claims = emptyMap(); //import static java.util.Collections.emptyMap;

    // 빌더 패턴을 사용해 설정이 필요한 데이터만 선택 설정
    @Builder
    public JwtFactory(String subject, Date isuuedAt,
                      Date expiration, Map<String, Object> claims) {
        this.subject = subject != null ? subject : this.subject;    // 삼항연산자
        this.isuuedAt = isuuedAt != null ? isuuedAt : this.isuuedAt;
        this.expiration = expiration != null ? expiration : this.expiration;
        this.claims = claims != null ? claims : this.claims;
    }

    public static JwtFactory withDefaultValues() {
        return JwtFactory.builder().build();
    }
}
