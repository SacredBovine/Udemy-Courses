<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <packaging>pom</packaging>

    <modules>
        <module>pet-clinic-data</module>
        <module>pet-clinic-web</module>
    </modules>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.7.0</version>
        <relativePath /> <!-- lookup parent from repository -->
    </parent>

    <groupId>gur.springframework</groupId>
    <artifactId>sfg-pet-clinic</artifactId>
    <version>0.0.1</version>
    <name>sfg-pet-clinic</name>
    <description>sfg-pet-clinic</description>

    <scm>
        <developerConnection>scm:git:https://github.com/SacredBovine/Udemy-Courses.git</developerConnection>
      <tag>0.0.1-test</tag>
  </scm>

    <properties>
        <java.version>1.8</java.version>
    </properties>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-release-plugin</artifactId>
                <configuration>
                    <goals>install</goals>
                </configuration>
            </plugin>
        </plugins>
    </build>


</project>
