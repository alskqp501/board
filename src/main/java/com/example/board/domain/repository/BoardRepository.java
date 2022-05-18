package com.example.board.domain.repository;

import com.example.board.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//쿼리 정보 설정
//JPA의 대부분의 자동 쿼리 기능을 수행할 수 있음
//데이터 조작을 담당
//JpaRepository에는 일반적으로 많이 사용하는 데이터 조작을 다루는 함수가 정의되어 있기 때문에, CRUD 작업이 편해짐
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
/*
    해당 클래스 안에 메소드를 선언하고
    위에 @Query를 넣어주면
    JPA에서 커스텀 쿼리를 사용할 수 있게 된다
    파라미터는 :name 과 같이 :를 앞에 붙이는 것으로
    파라미터를 지정 가능
    메소드 호출시 @Param("파라미터") 데이터타입 데이터명 이런 방식으로 파라미터를 받아 사용할 수 있다

ex)
    @Query(value = "select name, age from sample_member where name=:name", nativeQuery = true)
       List<CrudEntity> searchParamRepo(@Param("name") String name);


      */

}
