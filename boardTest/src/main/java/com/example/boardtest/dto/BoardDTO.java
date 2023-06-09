package com.example.boardtest.dto;

import lombok.*;

import java.time.LocalDateTime;

// DTO(Data Transfer Object) 데이터를 전송할때 사용하는 객체
@Getter
@Setter
@ToString
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자

public class BoardDTO {

    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits; // 조회수
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;
}

