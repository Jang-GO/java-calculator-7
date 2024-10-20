# [기능 목록] 문자열 덧셈 계산기
### 목표
- 입력된 문자열에서 구분자를 기준으로 숫자를 추출하여 합계 계산하기
- 구분자는 기본(쉼표, 콜론)구분자, 커스텀 구분자로 구분
- 커스텀 구분자는 `//`와 `/n`문자 사이에 있는 문자로함

### 📓 기능 구현 목록
- [ ] **문자열 입력 기능**
  - [ ] 빈 문자열인지 검증
  - [ ] 커스텀 구분자의 시작으로 시작하지 않으면 예외 발생
  
  <br>

- [ ] **문자열 파싱 기능**
  - [x] 커스텀구분자, 기본구분자 분리 기준 구분
    - [x] 커스텀구분자의 경우, 구분자 정의부분을 제외한 문자열 저장
  - [x] 분리한 구분자에 따라 문자열 파싱 후 저장
    - [ ] 음수 파싱 검증
    
    <br>
    
- [ ] **숫자 검증 기능**
  - [ ] 분리된 문자가 숫자인지 검증
  - [x] 숫자로변환 후 합산