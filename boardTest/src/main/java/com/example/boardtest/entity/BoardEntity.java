package com.example.boardtest.entity;


// DB의 테이블 역할을 하는 클래스

import com.example.boardtest.dto.BoardDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "board_table")
public class BoardEntity extends BaseEntity {
    @Id // pk 컬럼 지정, 필수
    @GeneratedValue(strategy = GenerationType.IDENTITY) //mysql로 봤을때 auto_increment
    private Long id;

    @Column(length = 20, nullable = false) // 널값을 가질 수 있고 컬럼 20개
    private String boardWriter;

    @Column // 크기 255, null 가능
    private String boardPass;

    @Column
    private String boardTitle;

    @Column(length = 500)
    private String boardContents;

    @Column
    private int boardHits;

    public static BoardEntity toSaveEntity(BoardDTO boardDTO){

        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setBoardWriter(boardDTO.getBoardWriter());
        boardEntity.setBoardPass(boardDTO.getBoardPass());
        boardEntity.setBoardTitle(boardDTO.getBoardTitle());
        boardEntity.setBoardContents(boardDTO.getBoardContents());
        boardEntity.setBoardHits(0); //조회수 0으로 초기화
        return boardEntity;
    }
}
