# API状态化  

为避免杂乱无章的 API 结构，规范化请求与返回体，返回message已输出国际化后的结果


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
## 后端Endpoint层代码

```
  @PostMapping(value = "/api/status/post")
  @ApiOperation(value = "状态", notes = "测试提交", httpMethod = "POST")
  public StatefulBody postStatus(  @RequestBody WithIdBody body) {
    Assertion.is(true, ApiCode.ACCOUNT_DISABLED);
    return SuccessResponseBody.builder().build();
  }
```

## 返回报文示例

```
{
  "payload":{
    "id":33333333333,
    "balance":228866.00
  }
  "code": 1,//业务返回码
  "message": "OK",//业务返回释义
  "requestId": "cZCu5aAftUn2ivn2rcKb2YUhb6N7ijP420180402212405106502",//当前请求编号
  "status": 200,//请求的http状态码
  "timestamp": 1522675445311//当前请求时间戳
}
```

[![演示](http://g.recordit.co/oI67yn0jSj.gif)](http://minlia.com/)

