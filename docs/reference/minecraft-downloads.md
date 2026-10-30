# Minecraft 1.21.1 파일 다운로드 경로

Mojang 공식 서버에서 Minecraft Java Edition 1.21.1의 jar와 매핑 파일을 받는 경로입니다.
이 문서는 Mojang의 공식 안내가 아니며, 파일은 모두 Mojang 서버에서 직접 받습니다.

- jar 파일은 이 저장소에 커밋하거나 다른 곳에 재배포하지 않습니다. ([Minecraft EULA](https://www.minecraft.net/en-us/eula): 게임 클라이언트·서버 소프트웨어의 배포 금지, 다운로드는 Mojang이 승인한 출처에서만)
- 파일을 받는 사람은 Minecraft를 구매하고 EULA와 [Minecraft Usage Guidelines](http://aka.ms/MCUsageGuidelines)를 따라야 합니다.
- 모드 빌드에는 따로 받을 필요가 없습니다. NeoGradle이 빌드 중에 내려받습니다.

## 직접 링크 (1.21.1)

| 파일 | URL | SHA-1 | 크기 (bytes) |
| --- | --- | --- | --- |
| 클라이언트 jar | https://piston-data.mojang.com/v1/objects/30c73b1c5da787909b2f73340419fdf13b9def88/client.jar | `30c73b1c5da787909b2f73340419fdf13b9def88` | 26,836,906 |
| 클라이언트 매핑 | https://piston-data.mojang.com/v1/objects/2244b6f072256667bcd9a73df124d6c58de77992/client.txt | `2244b6f072256667bcd9a73df124d6c58de77992` | 9,598,610 |
| 서버 jar | https://piston-data.mojang.com/v1/objects/59353fb40c36d304f2035d51e7d6e6baa98dc05c/server.jar | `59353fb40c36d304f2035d51e7d6e6baa98dc05c` | 51,627,615 |
| 서버 매핑 | https://piston-data.mojang.com/v1/objects/03f8985492bda0afc0898465341eb0acef35f570/server.txt | `03f8985492bda0afc0898465341eb0acef35f570` | 7,456,063 |

받은 파일의 SHA-1 확인 (Windows cmd):

```
certutil -hashfile client.jar SHA1
```

## 조회 경로 (다른 버전에도 사용)

1. 버전 목록: https://piston-meta.mojang.com/mc/game/version_manifest_v2.json
2. `versions` 배열에서 `id`가 원하는 버전인 항목의 `url`을 엽니다. 1.21.1은 https://piston-meta.mojang.com/v1/packages/018296bcb207bea6fd25b05f08eee3942dcec406/1.21.1.json
3. 그 JSON의 `downloads`에 `client`, `client_mappings`, `server`, `server_mappings`의 `url`, `sha1`, `size`가 있습니다.

확인일: 2026-10-30 (클라이언트 jar URL HEAD 요청 200 응답)
