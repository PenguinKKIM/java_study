# 조건문



#### 조건문은 조건에 따라 실행을 나누어 주는 문법을 말한다.



#### 1. if 문

- 조건문에서 가장 기본적인 문법

  - 조건 절/than 절로 구분되며 조건 절 에는 true 나 false 만 올 수 있다.

  ```java
  if( 조건을 의미하는 ***조건절*** ){
      than 절 - 조건절에 true 가온다면 이 부분의 문법이 실행되고
          	 false 면 실행되질 않는다.	
  }
  ```

  

#### 2. if - else

- if의 조건절이 true 면 than 절을 실행시키고, false 라면 else 의 뒤따라오는 구간이 실행된다.

  ```java
  if(false){
      //이부분은 실행이 되질 않습니다
  } else {
      System.out.println("이 부분이 실행됩니다")
  }
  ```



#### 3. if - else if

- 첫 if 의 조건 절 이 false라면 else if 로 여러 개 의 조건을 걸어 한번 더 true/ false 판별 을 한다.

  ```java
  if(false){
      //이 부분은 실행이 되질 않습니다
  } else if (true){
       System.out.println("첫 if 의 조건절이 false라면 이 부분이 실행됩니다")
  } else {
      System.out.println("if/ else if 가 모두 false 라면 실행됩니다")
  }
  ```

  

#### 4 . 알아 둬야 할 사항들

- else if 는 여러 개 올 수 있다.

- if가 무조건 참이라면 else if/ else 는 모두 생략 할 수 있다.

- if문 안에 if 문을 더 쓸 수 있다.

  