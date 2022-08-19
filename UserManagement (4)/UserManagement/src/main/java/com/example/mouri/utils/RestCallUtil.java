/*
 * package com.example.mouri.utils;
 * 
 * import java.util.HashMap; import java.util.Map;
 * 
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.beans.factory.annotation.Value; import
 * org.springframework.core.ParameterizedTypeReference; import
 * org.springframework.http.HttpEntity; import
 * org.springframework.http.HttpHeaders; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.stereotype.Component; import
 * org.springframework.web.client.RestTemplate;
 * 
 * import com.example.mouri.dto.BookDto; import
 * com.example.mouri.utilse.GenericResponse;
 * 
 * @Component public class RestCallUtil {
 * 
 * @Autowired private RestTemplate restTemplate;
 * 
 * @Value("${module.libraryservice.url}") private String libraryurl;
 * 
 * Map<String, String> errors = null;
 * 
 * public GenericResponse<BookDto> getBookById(Long id) { HttpHeaders headers =
 * getHttpHeaders(); errors = new HashMap<>(); HttpEntity<Long> entity = new
 * HttpEntity<>(id, headers); ResponseEntity<GenericResponse<BookDto>> property
 * = restTemplate.exchange(libraryurl + "/api/book/{id}" + id, HttpMethod.GET,
 * entity, new ParameterizedTypeReference<GenericResponse<BookDto>>() { });
 * return property.getBody();
 * 
 * } public HttpHeaders getHttpHeaders() { HttpHeaders headers = new
 * HttpHeaders(); headers.add("Content-Type", "application/json"); return
 * headers; }
 * 
 * 
 * }
 */