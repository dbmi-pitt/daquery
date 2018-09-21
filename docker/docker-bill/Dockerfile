FROM centos:6.8

RUN yum -y update; yum clean all
#I need JDK 1.7 for maven otherwise I get a tool.jar not found error during compilation
RUN yum -y install java-1.7.0-openjdk
RUN yum -y install java-1.7.0-openjdk-devel
RUN yum -y install git
RUN yum -y install gcc-c++ make
RUN curl --silent --location https://rpm.nodesource.com/setup_6.x | bash -
RUN yum -y install nodejs npm; yum clean all

#make a directory to store files
RUN mkdir -p /localdata

#tomcat setup tasks
COPY apache-tomcat-6.0.53.tar.gz /localdata/apache-tomcat-6.0.53.tar.gz
RUN chmod 755 /localdata/apache-tomcat-6.0.53.tar.gz
RUN cd /localdata && tar xvzf apache-tomcat-6.0.53.tar.gz
RUN mv -f /localdata/apache-tomcat-6.0.53 /usr/local/tomcat
COPY startup.sh /usr/local/tomcat/bin/startup.sh
COPY catalina.sh /usr/local/tomcat/bin/catalina.sh
RUN echo 'export CATALINA_HOME=/usr/local/tomcat' >>~/.bashrc
RUN echo 'export PATH=$CATALINA_HOME/bin:$PATH' >>~/.bashrc

RUN "/usr/local/tomcat/bin/startup.sh"
CMD ["/bin/bash"]

