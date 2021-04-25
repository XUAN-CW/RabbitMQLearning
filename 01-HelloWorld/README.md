# 关于 RabbitMQ

-  [官网](https://www.rabbitmq.com/) 
-  [RabbitMQ-getstarted.html](references\RabbitMQ-getstarted.html) 

# 安装 rabbitmq

## linux 下 docker 安装

### 下载镜像

下载镜像（有时候网络问题超时，多尝试几次即可。我这里选择的是可以访问web管理界面的tag）

```sh
sudo docker pull rabbitmq:management
```

### 创建容器并运行

创建容器并运行。15672是管理界面的端口，5672是服务的端口，默认账号密码为：`guest`

```sh
docker run -dit --name Myrabbitmq -p 15672:15672 -p 5672:5672 rabbitmq:management
```

需要设置管理系统的用户名为 `admin`、密码为 `password` 的用下面这条：

```sh
docker run -dit --name Myrabbitmq -e RABBITMQ_DEFAULT_USER=admin -e RABBITMQ_DEFAULT_PASS=password -p 15672:15672 -p 5672:5672 rabbitmq:management
```

### 登录管理界面

**15672** 是管理界面的端口。如果你是本地安装，访问 http://localhost:15672 ，如果你是像我一样使用阿里云，那么访问 http://IP:15672 ，输入账号密码，有如下效果：

![image-20210425115801293](image/image-20210425115801293.png)

# Spring Boot 整合 RabbitMQ

## 创建工程

1. 创建一个 `Empty Project` 
2. 在创建的 `Empty Project` 下用 **Spring Initializr** 创建 `producer` 、`consumer`

![image-20210425122912709](image/image-20210425122912709.png)

![image-20210425123236596](image/image-20210425123236596.png)

![image-20210425123335676](image/image-20210425123335676.png)


