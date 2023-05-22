# 개발환경
1. IDE : Intellij IDEA Community
2. Spring Boot 2.6.13
3. JDK 17
4. mysql
5. spring Data JPA
6. Tymeleaf

# 게시판 주요기능
1. 글쓰기(/board/save)
2. 글목록(/board)
3. 글조회(/board/{id})
4. 글수정(/board/update/{id})
   - 상세화면에서 수정 버튼 클릭
   - 서버에서 해당 게시글의 정보를 가지고 수정 화면 출력
   - 제목, 내용 수정 
   
5. 글삭제(/board/delete/{id})
6. 페이징 처리(/board/paging)
   - /board/paging?page=2
   - /board/paging/2