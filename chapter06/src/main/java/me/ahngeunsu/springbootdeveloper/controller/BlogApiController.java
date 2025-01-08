package me.ahngeunsu.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.ahngeunsu.springbootdeveloper.domain.Article;
import me.ahngeunsu.springbootdeveloper.dto.AddArticleRequest;
import me.ahngeunsu.springbootdeveloper.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BlogApiController {

    private final BlogService blogService;

    // HTTP 메서드가 POST 일 때 전달 받은 URL과 동일하면 지금 정의하는 메서드와 매핑
    @PostMapping("/api/articles")
    // @RequestBody로 요청 본문 값 매핑
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {
        Article savedArticle = blogService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedArticle);
    }
    /*
        1. @RestController : 클래스에 붙이면 HTTP 응답으로 객체 데이터를 "JSON" 형식으로 반환
        2. @PostMapping() : HTTP 메서드가 POST일 때 요청 받은 URL과 동일한 메서드와 매핑.
            지금의 경우 /api/articles는 addArticle() 메서드와 매핑.
        3. @RequestBody : HTTP 요청을 할 때, 응답에 해당하는 값을 @RequestBody 애너테이션이 붙은
            대상 객체은 AddArticleRequest에 매핑.
        4. ResponseEntity.status().body()는 응답 코드로 201, 즉 Created를 응답하고
            테이블에 저장된 객체를 반환합니다.

        200 OK : 요청이 성공적으로 수행되었음
        201 Created : 요청이 성공적으로 수행되었고, 새로운 리소스가 생성되었음
        400 Bad Request : 요청 값이 잘못되어 요청에 실패했음
        403 Forbidden : 권한이 없어 요청에 실패했음
        404 Not Found : 요청 값으로 찾은 리소스가 없어 요청에 실패했음
        500 Internal Server Error : 서버 상에 문제가 있어 요청에 실패했음
     */
}
