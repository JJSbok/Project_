1. 회원 가입 
- 파일업로드 수정, 리스트, 삭제
- (입력 받을 데이터) uid, pw, uname, uphoto


2. 로그인 : 인터셉터 /board/** << 세션을 확인
- / login : get | post

3. tbl_board 
- 컬럼추가 idx 외래키
- Member 테이블의 idx 참조

4. 게시물 작성 시 idx에는 로그인 한 사용자의 idx값을 입력

5. 게시물의 리스트 
- tbl_board와 member 테이블 Join

6. 상세보기 페이지
- 작성자 idx와 로그인한 사용자의 idx 비교
- 수정