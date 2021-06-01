# spring-boot-ldap-auth

This is a demo app to authenticate API with LDAP users using Spring boot, spring security and LDAP(In memory opensource LDAP - unboundid)
<br>
**How to run?**
<br>
Run SpringBootLdapAuthApplication.java as Spring boot application
<br>
Access API to test<br>
http://localhost:8081/app/teams
<br>
This will prompt for Login form, user ben as userName and benspassword as password.


<br>
If you want to change spring boot version update it in pom.xml<br>
<parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
**        <version>2.5.0</version>**
        <relativePath/>
</parent>
<br>
Using different versions of different spring dependencies might result in failing of start of inMemory LDAP server
