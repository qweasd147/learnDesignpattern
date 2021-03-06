﻿# Command Pattern.

# 1. 정의

    요청 내역을 객체로 캡슐화하여 클라이언트에서 서로 다른 요청 내역에 따라
    매개변수화 할수 있다. 요청을 큐에 저장하거나 로그로 기록할 수 있고,
    작업 취소기능을 하원할 수도 있다.

![ClassDiagram](./base/ClassDiagram.png)


# 2. 특징

* 커맨드 패턴을 이용하면 요청을 하는 객체와 그 요청을 수행하는 객체를 분리 시킬 수 있다.
* 이렇게 분리시키는 과정의 중심에는 커맨드 객체가 있으며 이 객체가 행동이 들어있는 `receiver`를 캡슐화 한다.
* `invoker`에서는 요청을 할 때는 커맨드 객체의 `execute` 메소드를 호출하면 된다. `execute` 메소드에서는 `receiver`에 있는 행동을 호출한다.
* `invoker`는 `Command`를 통해서 매개변수화 될수 있다. 이런 실행중에 동적으로 설정 할 수도 있다.

    `receiver`는 커맨드 객체에 넘겨줄 인자값으로, `invoker`와 `receiver`를 분리하고
    `receiver`를 이용해서 `Command`를 매개변수화 하는것이 가능하다.

# 3. Code

```java

```

# 4. invoker

### 4.1 클라이언트에서 커맨드 객체 생성
### 4.2 setCommand()를 호출하여 인보커에 커맨드 객체 저장
### 4.3 나중에 클라이언트에서 인보커한테 그 명령을 실행시켜 달라는 요청을 함
    일단 어떤 명령을 인보커에 로딩한 다음 한번만 작업을 처리하고 커맨드 객체를
    지우도록 할수도 있고, 저장해 둔 명령을 여러번 수행 할 수도 있음.

# 5. Code Class diagram

![ClassDiagram](./ClassDiagram.png)