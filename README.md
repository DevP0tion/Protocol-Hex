# Protocol Hex

Minecraft 1.21.1 NeoForge 모드.

| 항목 | 값 |
| --- | --- |
| Minecraft | 1.21.1 |
| NeoForge | 21.1.264 |
| 빌드 플러그인 | NeoGradle (`net.neoforged.gradle.userdev` 7.1.38) |
| Gradle | 9.2.1 (wrapper) |
| Java | 21 |
| 매핑 | Mojang 공식 매핑 + Parchment 2024.11.17 |
| Mod ID | `protocolhex` |
| 패키지 | `com.devp0tion.protocolhex` |

버전 값은 `gradle.properties`에서 관리합니다.

## 요구 사항

- JDK 21 (Gradle toolchain이 없으면 자동으로 내려받습니다)

## 주요 명령 (Windows cmd)

프로젝트 루트에서 실행합니다.

| 명령 | 설명 |
| --- | --- |
| `gradlew.bat build` | 모드 jar 빌드 → `build\libs\protocolhex-<version>.jar` |
| `gradlew.bat runClient` | 개발용 클라이언트 실행 (작업 폴더 `run\client`) |
| `gradlew.bat runServer` | 개발용 서버 실행 (작업 폴더 `run\server`) |
| `gradlew.bat runData` | 데이터 생성 → `src\generated\resources` |
| `gradlew.bat runGameTestServer` | GameTest 실행 후 종료 (등록된 테스트가 없으면 실패) |
| `gradlew.bat --refresh-dependencies` | 의존성 캐시 갱신 |
| `gradlew.bat clean` | 빌드 결과물 초기화 (소스에는 영향 없음) |

첫 실행 시 Minecraft 디컴파일·재컴파일 때문에 시간이 걸립니다.

## 구조

```
src/main/java/com/devp0tion/protocolhex/
  ProtocolHex.java        메인 클래스 (@Mod), DeferredRegister(BLOCKS/ITEMS/CREATIVE_MODE_TABS), Config 등록
  ProtocolHexClient.java  클라이언트 전용 진입점, 모드 목록의 Config 화면 등록
  Config.java             COMMON config 스펙 (값을 하나 이상 정의해야 config 파일이 생성됨)
src/main/resources/
  META-INF/neoforge.mods.toml       모드 메타데이터 (빌드 시 gradle.properties 값으로 치환)
  assets/protocolhex/lang/en_us.json
src/generated/resources/            runData 출력 위치
```

## 매핑 라이선스

Minecraft 코드의 메서드·필드 이름은 Mojang 공식 매핑을 사용하며, 해당 이름에는 별도 라이선스가 적용됩니다.
https://github.com/NeoForged/NeoForm/blob/main/Mojang.md

## 라이선스

이 모드의 코드는 [MIT](LICENSE) 라이선스입니다.
NeoForged MDK에서 가져온 템플릿 파일에는 [TEMPLATE_LICENSE.txt](TEMPLATE_LICENSE.txt)가 적용됩니다.

## 참고

- NeoForge 문서: https://docs.neoforged.net/
- NeoGradle: https://github.com/neoforged/NeoGradle
- 원본 MDK: https://github.com/NeoForgeMDKs/MDK-1.21.1-NeoGradle
