# Configuration Management Module for ChatApp

配置管理构件. 本模块提供以下这些功能:
- 从配置文件中读取配置信息.
- 将配置信息转换成配置类Java对象.

## 约定的配置文件格式

所有的配置文件应该满足如下格式:

### Server

Configuration file name example: `src/main/resources/demoConfig.conf`

```
# 样例配置文件

server {
  port=8077
  maxConnection=100
}

db {
  host="localhost"
  port=3307
  name="demoDB"
  username="root"
  password="123456"
}

```

字段解释:
```
server.port: 服务端绑定的端口号
maxConnection: 最大接入连接数
db.host: 数据库host
db.port: 数据库端口号
db.name: 数据库名称
db.username: 登录用户名
db.password: 登录密码
```

## 使用的第三方库

- <a href="https://github.com/typesafehub/config">typesafe.config</a>
