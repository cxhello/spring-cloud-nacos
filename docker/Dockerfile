FROM java:8

# 设置时区,编码(防止中文乱码)等环境变量
ENV TimeZone=Asia/Shanghai LANG=zh_CN.UTF-8 LANGUAGE=zh_CN:en LC_ALL=zh_CN.UTF-8

# 设置时区
RUN echo $TimeZone > /etc/timezone

WORKDIR /data

# 复制jar到docker的WORKDIR目录
COPY target/spring-cloud-nacos-1.0-SNAPSHOT.jar spring-cloud-nacos-1.0-SNAPSHOT.jar
# 默认启动jar
ENTRYPOINT java -Dfile.encoding=UTF-8 -jar spring-cloud-nacos-1.0.jar