package com.example.boardtest.service;

import com.example.boardtest.dto.BoardDTO;
import com.example.boardtest.entity.BoardEntity;
import com.example.boardtest.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//Service의 역할
// DTO >> Entity 로 변환
// Entity >> DTO 로 변환

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;
    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}
