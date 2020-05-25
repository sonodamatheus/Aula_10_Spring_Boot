<?xml version="1.0" encoding="UTF-8"?>
<persistence version="2.1"
xmlns="http://xmlns.jcp.org/xml/ns/persistence"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence
http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd">
<persistence-unit name="usjtPU">
<provider>org.hibernate.ejb.HibernatePersistence</provider>
<properties>
<property name="javax.persistence.jdbc.url"

value="jdbc:mysql://localhost/usjt_ecp6anmca_jpa_hibernate?useTimezone=true&
amp;serverTimezone=America/Sao_Paulo&amp;createDatabaseIfNotExist=true" />
<property name="javax.persistence.jdbc.user" value="alunos" />
<property name="javax.persistence.jdbc.password"
value="alunos" />
<property name="javax.persistence.jdbc.driver"
value="com.mysql.cj.jdbc.Driver" />
<property name="hibernate.dialect"
value="org.hibernate.dialect.MySQL8Dialect" />
<property name="hibernate.show_sql" value="true" />
<property name="hibernate.format_sql" value="true" />
<property name="hibernate.hbm2ddl.auto" value="update" />
</properties>
</persistence-unit>
</persistence>