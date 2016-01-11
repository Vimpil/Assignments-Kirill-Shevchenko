# docker_hello_world 
## INSTALLATION INSTRUCTION
A simple java program that prints "Hello, Docker!" in your console.

###Installation:
 1. You need to install Docker. To get started, check out the [**installation instructions in the documentation**](https://docs.docker.com/engine/installation/).

  * If you want to download and run my **full image of program**, just type in console *"docker run vimpil/hello-docker"*. Thats it, the end.

 2. But if you want to make it **manually**, you need to download  [Dockerfile](https://github.com/Vimpil/Assignments-Kirill-Shevchenko/raw/master/02/01_task/Dockerfile) and [helloDocker.java](https://raw.githubusercontent.com/Vimpil/Assignments-Kirill-Shevchenko/master/02/01_task/helloDocker.java) files from my repo and put them in one folder (just open each link and save opened pages in one folder).
 
 3. Type in console *"docker build -t image_name [file-path to folder where you downloaded files]"*. You can type any *"image_name"* that you want.
 
 4. Type in console *"docker run image_name"*.
 
 Done !
