package me.ahngeunsu.springbootdeveloper.repository;

import me.ahngeunsu.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
/*
    이상의 코드를 통해 JpaRepository 클래스를 상속 받을 때, 엔티티 Article과 PK인 Long을
    argument로 받았습니다.

    해당 리포지토리를 사용할 때, 'JpaRepository'에서 제공하는 여러 메서드 사용 가능.

    블로그 글 작성을 위한 API 구현하기
        구현 과정 :
            Service 클래스에서 method 구현
            Controller 클래스에서 사용할 method 구현,
            API를 실제로 테스트 할겁니다.

                   요청                    save()                   save()
        클라이언트 <----> 2. 컨트롤러 <-------------------> 1. 서비스 <------> 리포지토리
                   응답  (BlogController.java)          (BlogService.java)  (BlogRepository.java)
                   POST
               /api/articles
 */