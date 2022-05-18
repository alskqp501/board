package com.example.board.domain.entity;
//DB테이블과 매핑되는 객체를 정의하는 Entity 구현
//테이블 정보 설정

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name="board")
public class BoardEntity extends TimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false)
    private String writer;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Builder
    public BoardEntity(Long id, String title, String content, String writer){
      this.id=id;
      this.writer=writer;
      this.content=content;
      this.title=title;
    }


}
