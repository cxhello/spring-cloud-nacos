# spring-cloud-nacos

## 步骤

1. 构建镜像；
2. 部署nacos，在nacos-server控制台新建配置spring-cloud-nacos.yaml； 
3. 修改docker-compose.yml的镜像地址和nacos配置； 
4. 启动应用；
5. 重启宿主机，查看应用日志；

```shell
cd spring-cloud-nacos
docker build -t spring-cloud-nacos:1.0 -f docker/Dockerfile .
vim docker/docker-compose.yml
docker-compose -f docker/docker-compose.yml up -d
docker logs -f --tail 100 spring-cloud-nacos
```

```shell
reboot
docker logs -f --tail 100 spring-cloud-nacos
```