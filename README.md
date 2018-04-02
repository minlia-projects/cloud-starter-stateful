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

## 返回报文示例

```
{
  "code": 50004,//业务返回码
  "message": "Account Unavailable: Please confirm that the status of your credential.",//业务返回释义
  "requestId": "cZCu5aAftUn2ivn2rcKb2YUhb6N7ijP420180402212405106502",//当前请求编号
  "status": 200,//请求的http状态码
  "payload":{
    "id":33333333333,
    "balance":2288772.00
  }
  "timestamp": 1522675445311//当前请求时间戳
}
```