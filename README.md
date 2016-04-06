# Configuration Management Module for ChatApp

配置管理构件. 本模块提供以下这些功能:
- 从配置文件中读取配置信息.
- 将配置信息转换成配置类Java对象.

## 约定的配置文件格式

所有的配置文件应该满足如下格式:

### Server

Configuration file name example: `server-conf.json`

```
{
  "port": 8077,
  "maxConnection": 100,
  "dbAddress": "127.0.0.1",
  "dbPort": 3307
}
```

字段解释:
```
port: 服务端绑定的端口号
maxConnection: 最大接入连接数
dbAddress: MySQL数据库地址
dbPort: MySQL数据库端口号
```

... TODO