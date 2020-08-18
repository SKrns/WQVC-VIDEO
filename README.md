# Video Conference
WQVC(WebRTC-QUIC Video Conference)의 Video Conference 마이크로서비스.

## 사전 설치 요구사항
위 서비스를 사용하기 전에 `https://github.com/SKrns/WQVC-AUTH`와 `https://github.com/Pororo-droid/WQVC-eurkeaServer`가 필요하다.

## 설치 방법
### 1) 컨테이너 실행

Dockerfile을 빌드 한다.

```
docker build -t [생성할 이미지 이름] .
```

이 후, 생성한 이미지를 실행한다.

```
docker run --link [유레카 컨테이너 이름] -p 7001:7001 -t [생성한 이미지 이름]
```


### 2) 일반 실행

깃 레포를 다운로드한다 

`git clone https://github.com/SKrns/WQVC-VIDEO.git`.

레포지토리를 다운로드 한후, src/main/java/com/pororo/webrtc/WebrtcApplication.java를 실행시킨다.
로컬 접속은 `https://localhost:7001/index.html`또는 `https://localhost:7001/index.html?roomName=[방 id]&userName=[유저 이름]`으로 시작한다.

```
cd WQVC-VIDEO/

./mvnw package && java -jar target/webrtc-0.0.1-SNAPSHOT.jar
```

## 실행방법

### 마이크 및 카메로 허용
`https://github.com/SKrns/WQVC-AUTH`에서 만든 회의에서 회의 참가를 누른다. 회의 참가를 누르고 다음과 같은 화면에서 카메라 및 마이크를 허용한다.
![1](images/1.png)

### 카메라 조절
카메라를 끄고 싶은 상황이 있을 경우 아래의 버튼들 중 Video off를 누르면 된다. 반면, 카메라를 다시 키고 싶을 경우, Video On을 누르면 된다.
![mic](images/off.png)

### 마이크 조절
마이크 조절 역시 키고 싶으면 audio on, 끄고 싶은 경우 audion off를 누르면 된다.
![audio](images/audio_off.png)