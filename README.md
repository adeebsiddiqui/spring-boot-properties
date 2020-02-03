# spring-boot-properties
This project demonstrates how properties from YAML files are read. This also shows how profile-specific properties are configured.

A profile can be made active by defining `Environment` property `spring.profiles.active` either in application.yml OR specifying in the command line like one of the following:
1. java -jar <app-jar-name>.jar --spring.profiles.active=test,prod
2. java -Dspring.profiles.active=test,prod -jar <app-jar-name>.jar

Read about [Externalized Configuration](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-external-config).

Read about [Profiles](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-profiles).

Check out [Common Application Properties](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html).

Make sure to read [Getting Started](https://github.com/echosiddiqui/spring-boot-properties/blob/master/HELP.md) to learn more.
