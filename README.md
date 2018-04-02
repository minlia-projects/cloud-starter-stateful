# API状态化  

为避免杂乱无章的 API 结构，规范化请求与返回体


## 项目结构说明  
```
body          请求体与返回体
code          API 业务返回码定义
generator     生成器
localization  本地化
```

## 添加依赖项:

```pom
<dependency>
  <groupId>com.minlia.cloud.starter</groupId>
  <artifactId>cloud-starter-stateful</artifactId>
  <version>2.0.0.RELEASE</version>
</dependency>
```

