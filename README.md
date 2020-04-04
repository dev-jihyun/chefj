# ChefJ
* 셰프제이은 레시피 공유 및 식자재 구매 원스톱 플랫폼 프로그램입니다. 1인 가구가 증가하며 바쁘더라도 모두 함께 건강한 식단을 섭취하자는 취지를 살려 프로그램으로 만들었습니다. 식자재 장바구니에서 구매까지, 레시피 등록, 조회, 댓글기능, 일반게시판 조회 및 글쓰기, 삭제, 관리자페이지, 고객센터 기능  제공됩니다.
* 제작기간 : 한달 반
* 제작인원 : 4명

## Supported Modules
* OS : window10
* 개발환경 : Java 1.8, eclipse 2018-09, oracle 11g R2, JSP/Servlet, HTML5, CSS, JavaScript, Ajax
* DB : Oracle 11g, sql Developer
* WAS : Apache Tomcat 8
* DB-design Tool : Erdcloud
* UI-design Tool : kakaoOven
* Library : Maven, Bootstrap4, jQuery 3.4.1
* version control system : GitHub
* API : quillAPI(텍스트 에디터), 아인포트(결제 API), 도로명주소API

## 주요이슈
* 관리센터 : 답변을 여러개 달 수 있도록 구현하였습니다.
  - 오늘 날짜보다 과거인 경우 예약 불가
  - 하루에 한 번만 예약 가능
  - 트레이너 휴가인 경우 예약 불가
  - 당일 예약 취소 및 등록 불가
  - 다른 회원의 일정 선택 불가
  - 또한, 이벤트마다 아이디를 추가하여야 했는데, 일반적으로 일정고유번호(기본키)만 추가해서는 안되고, 일정고유번호와 유저고유번호를 통합하여 이벤트 아이디로 만들었습니다(ex- 1N13)
* LONG TYPE 검색 기능 구현
  - 게시판의 dataType이 LONG형으로, vachar2형을 검색하는 것과는 달랐습니다. database에 인덱스를 생성하여 검색하는 방법으로 구현하였습니다.

* 건강정보
  - 트레이너와 일반회원의 정보테이블은 따로 있습니다. 그러나 건강정보 테이블은 트레이너와 일반회원이 공유합니다. 또한 건강정보 db는 회원가입할 때 만들어지지 않고, 회원이 직접 건강정보를 입력할 때 해당 유저번호로 데이터가 있으면 update를 하고, 없으면 insert를 하는 방식으로 구현하였습니다.
  - 위의 내용을 전제로 해서 건강정보 db에 접근할 때 회원가입은 했지만 건강정보가 없는 회원들의 경우 조회가 안되거나, 또는 트레이너와 유저 번호가 같은경우 함께 조회되는 경우가 이슈가 있었습니다. 따라서 먼저 join문을 쓰지않고 회원정보를 조회한 후에 유저번호를 통해 건강정보 테이블을 조회해 오는 형식으로 변경하여 구현하였습니다.
  
## 구현내용
* 메인메뉴
  - 접속한 회원마다 뷰 다르게 변경
* 로그인/회원가입
  - 유효성검사, 이메일인증, 도로명주소
* 고객센터/관리센터
  - 회원관리 - 회원정보 조회, 등급변경
  - 1대1문의게시판 :
  - 공지사항
* PT일정 : 내 트레이너의 예약 조회, 예약 추가, 예약 삭제
* 트레이너 일정 : 내가 관리하는 회원의 예약 조회, 삭제
  
## Overview
* **main** - 원핏은 로그인을 해야 서비스 이용이 가능합니다.
  ![main](doc/images/메인.png)
  
* **일정** - 트레이너와 PT일정을 연동하여 예약 등록 및 취소가 가능하게 구현하였습니다.
  ![schedule](doc/images/트레이너일정view.png)
  ![schedule2](doc/images/일정view.png)
  ![code2](doc/images/일정조회view2.png)
  
* **게시판** - 1대1문의게시판과 공지사항게시판이 있습니다. 문의할 때에는 개인트레이너 또는 관리자 중 선택하여 문의가 가능합니다. 텍스트 에디터 API를 사용하여 글 내용의 dataType은 LONG형 입니다. 검색할 때 일반 방법으로는 검색이 되지 않아 인덱스를 따로 생성하여 구현하였습니다.
  ![board](doc/images/게시판view.png)
  ![code3](doc/images/공지사항검색view.png)  
  
* **게시판** - 개인정보 수정시 ajax활용하여 비밀번호 입력 후 정보수정 페이지로 갈 수 있습니다.  
  ![code1](doc/images/비밀번호재확인viewpng.png)



