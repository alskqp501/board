package com.example.board.domain.repository;

import com.example.board.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//데이터 조작을 담당
//JpaRepository에는 일반적으로 많이 사용하는 데이터 조작을 다루는 함수가 정의되어 있기 때문에, CRUD 작업이 편해짐
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

}
