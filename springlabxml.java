<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="emp_details" class="com.lab.ex1.bean.Employee">  
         <property name="id"><value>12345</value></property>
         <property name="name" value="Harriet"></property>
         <property name="salary"><value>40000.0</value></property>
         <property name="bu" value="PES-BU"></property>
         <property name="age" value="30"></property>
    </bean>
    
    
	
</beans>