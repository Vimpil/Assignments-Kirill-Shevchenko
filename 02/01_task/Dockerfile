FROM java:8
# ./myapp - директория на локальной машине с приложением
COPY .  /usr/src/hello-docker
WORKDIR /usr/src/hello-docker
RUN javac helloDocker.java
CMD ["java", "helloDocker"]
