# Cloud diary
 
![云](jetbrains://idea/navigate/reference?project=yun&path=~\Desktop\云.jpg)
 
## 目录
* [背景介绍](#背景介绍)
* [项目介绍](#项目介绍)
* [使用说明](#使用说明)
  * [功能介绍](#功能介绍)
  * [技术细节](#技术细节)
  * [开发环境](#开发环境)
  * [数据库设计](#数据库设计)
       * [数据库介绍](#数据库介绍)
       * [配置文件](#配置文件)
* [其他](#其他)
 
<a name="背景介绍"></a>
## 背景介绍
 
*diary*，每天都会有很多事情发生用这个来记录，还可以把未完成的任务记录下来。<br/>
*Cloud diary*，是一个Java入门级项目。
 
<a name="项目介绍"></a>
## 项目介绍
 
*Cloud diary* 软件就是用于记录日常生活点滴。一款跨平台的简单快速的个人记事备忘工具,并且能够实现PC、移动设备和云端之间的信息同步，简洁高效。将会议记录、日程安排、生活备忘，奇思妙想、 快乐趣事以及任何突发灵感都可快速记录到系统中。
本系统采用B/S架构，使用BootStrap + Jsc+ Servlet + MySQL+ Tomcat 开发,使用Maven构建，采用Junit单元测试、Log4j搭建日志、使用POI导入导出报表，操作DB使用大名鼎鼎的DBUtil,同时V2版本使用MongoDB数据库，底层使用Redis做缓存，采用Git进行分布式版本控制开发。
本项目包含用户模块、类型模块、云记模块、数据报表、首页模块这几个核心模块，核心主旨是掌握功能的分析以及前后台数据交互。
 
<a name="使用说明"></a>
## 使用说明
 
 <a name="功能介绍"></a>
 ### 功能介绍
 
 类别|功能              |功能             |功能
 ---|:--:             |:--:            |---:
 用户|登陆退出显示用户信息 |加载头像 上传头像  |验证昵称的唯一性
 类型|查询类型列表       |验证类型名的唯一性  |添加修改删除类别
 云记|分页查询云记列表    |添加修改|删除
 主页|标题查询云记列表    |日期分组查询       |类别分组查询
 报表|用户发布位置的散点图 |云记发布月份的柱状图 |
 
   
<a name="技术细节"></a>
### 技术细节
 
增删改查
免登录*Session* *Cookie*
非法访问过滤器*Filter*
文件上传
分页
*Ajax Dom*操作
富文本编辑器

<a name="开发环境"></a>
### 开发环境

IDEA+Maven+MySQL+jdk1.8+Tomcat
 
1. 使用方式
 
```
//使用日志工厂类，记录日志
private static Logger logger = LoggerFactory.getLogger(DBUtil.class);
//记录日志
logger.info("在{}时，获取数据库连接“，new SimpleDateFormat("yyyy-MM-ddHH:mm:ss").format(new Date()));

```
 

2. 编写插件配置文件
 
```
### 设置###stdout,
log4j.rootLogger = all,D,E,stdout

### 输出信息到控制台 ###
log4j.appender.stdout = org.apache.log4j.ConsoleAppender
log4j.appender.stdout.Target = System.out
log4j.appender.stdout.layout = org.apache.log4j.PatternLayout
log4j.appender.stdout.layout.ConversionPattern = [%-5p] %d{yyyy-MM-dd HH:mm:ss,SSS} \
method:%l%n%m%n

### 输出DEBUG 级别以上的日志到=D://logs/log.log ###
log4j.appender.D = org.apache.log4j.DailyRollingFileAppender
log4j.appender.D.File = D://logs/log.log
log4j.appender.D.Append = true
log4j.appender.D.Threshold = DEBUG 
log4j.appender.D.layout = org.apache.log4j.PatternLayout
log4j.appender.D.layout.ConversionPattern = %-d{yyyy-MM-dd HH:mm:ss}  [ %t:%r ] - [ %p ]  \
%m%n

### 输出ERROR 级别以上的日志到=E://logs/error.log ###
log4j.appender.E = org.apache.log4j.DailyRollingFileAppender
log4j.appender.E.File =E://logs/error.log
log4j.appender.E.Append = true
log4j.appender.E.Threshold = ERROR 
log4j.appender.E.layout = org.apache.log4j.PatternLayout
log4j.appender.E.layout.ConversionPattern = %-d{yyyy-MM-dd HH:mm:ss}  [ %t:%r ] - [ %p ]

```

   log4j.properties担当集成环境中调试器的作用，可以向文件或者调试器打印代码的信息，这样就不用在代码中打印输出测试了
 
<a name="数据库设计"></a>
#### 数据库设计
<a name="数据库介绍"></a>
#### 数据库介绍

  数据库设计 根据系统架构设计， 本系统采用简单灵巧的 MySQL 数据库， 遵循关系型数据库标准， 符合三范式设 计， 一切从简。
  *tb_user* ，
  *tb_note_type*，
  *tb_note*
  
 <a name="配置文件"></a>
 #### 配置文件
 
```
#连接MYSQL数据库的配置文件 注：等号的前后不要写空格
#驱动名
jdbcName=com.mysql.cj.jdbc.Driver
#数据库连接（lezijie_note是数据库的名称）
dbUrl=jdbc:mysql://localhost:3306/lezijie_note?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false
#数据库的连接账号（账号基本上都是root）
dbName=root
#数据库的连接密码（每个人数据库密码可能不一致，需要修改）
dbPwd=123456
```    
 

 

<a name="其他"></a>
## 其他
 
时间仓促，功能简陋，望您包涵。特别希望看到该项目对您哪怕一点点的帮助。任意的意见和建议，欢迎随意与我沟通,联系方式：
 
* Email: <2609015467@qq.com>
* QQ:2609015467
 
项目的Bug和改进点，可以通过Email的方式直接提交给我。

个人收获
先要站在用户的角度分析，做好需求分析，才能做好项目
知道了如何建表（表结构的设计）：用户表 用户登陆会需要到用户名和密码 个人中心昵称头像心情
类型表：主键，类型名称需要关联一下用户表的主键，让我们知道这个类型是属于谁的，云记关联了类型表的
云记表：散点图每一篇日记发布的时候所在的位置，还有精度和纬度的字段
在创建项目之后要配置环境Maven,webapp下是放资源的，没有Maven的时候的时候要复制jar包放在WEB-INF下，用Maven就把jar变成依赖
学会了分层思想，把写在一个方法里的代码拆分到几个不同的代码里，拆分出来方便代码的复用，按照职责不同简洁了代码也可以简化代码
项目环境搭建之后，考虑项目中能不能获取到数据库的连接，能才能拿到数据，后续功能才能正确显示出来，通过单元测试来测试写过的方法或者接口，明白使用日志的意义，写项目思路，会让后续写代码非常的顺利,前后端搭配写