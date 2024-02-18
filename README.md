### 요구사항
- 프로젝트 환경 설정하기
  - servlet
  - spring
  - mybatis
  - logback
- index.html -> login.jsp 로 변환
- css, js 파일 resources tag 설정
- Servlet 구성 및 접속
  - 회원가입 페이지 : /loginPage.do
  - 회원가입 : /join.do
    - 회원 테이블에 정보 입력하기
- 회원가입 성공/실패에 따른 Alert 노출하기


```
docker run -p 45432:5432 -e PGDATA=/var/lib/postgresql/pgdata -e POSTGRES_PASSWORD=admin_123 --restart unless-stopped --name postgres-sample -d jyeory/postgres-jdbc-01:0.0.5
```
