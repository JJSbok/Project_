package com.hi.board.mapper;

import com.hi.board.domain.BoardDTO;
import com.hi.board.domain.RequestModifyRequest;
import com.hi.board.domain.RequestRegBoard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {


    List<BoardDTO> selectList(int startNum, int count);
    // selectList(0, 5)   #{param1} => 0, #{param2} => 5

    int selectTotalCount();

    List<BoardDTO> selectAll();

    BoardDTO selectByBno(int bno);


    int insertBoard(RequestRegBoard regBoard);

    int updateBoard(RequestModifyRequest modifyRequest);

    int deleteBoard(int bno);

}
