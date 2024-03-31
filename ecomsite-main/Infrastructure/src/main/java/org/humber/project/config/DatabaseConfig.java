/*
 * package org.humber.project.config;
 * 
 * import java.util.Properties;
 * 
 * import javax.sql.DataSource;
 * 
 * import org.springframework.beans.factory.annotation.Qualifier;
 * import org.springframework.boot.context.properties.ConfigurationProperties;
 * import org.springframework.boot.jdbc.DataSourceBuilder;
 * import org.springframework.context.annotation.Bean;
 * import org.springframework.context.annotation.Configuration;
 * import org.springframework.context.annotation.Primary;
 * import org.springframework.jdbc.core.JdbcTemplate;
 * import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
 * import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
 * 
 * @Configuration
 * public class DatabaseConfig {
 * 
 * @Bean(name = "userDataSource")
 * 
 * @Primary
 * 
 * @ConfigurationProperties(prefix = "spring.datasource.user-db")
 * public DataSource userDataSource() {
 * return DataSourceBuilder.create().build();
 * }
 * 
 * @Bean(name = "productDataSource")
 * 
 * @ConfigurationProperties(prefix = "spring.datasource.product-db")
 * public DataSource productDataSource() {
 * return DataSourceBuilder.create().build();
 * }
 * 
 * @Bean
 * public LocalContainerEntityManagerFactoryBean entityManagerFactory(
 * 
 * @Qualifier("userDataSource") DataSource dataSource) {
 * LocalContainerEntityManagerFactoryBean em = new
 * LocalContainerEntityManagerFactoryBean();
 * em.setDataSource(dataSource);
 * em.setPackagesToScan("org.humber.project.domain");
 * em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
 * em.setJpaProperties(additionalProperties());
 * return em;
 * }
 * 
 * // Additional properties for Hibernate
 * private Properties additionalProperties() {
 * Properties properties = new Properties();
 * properties.setProperty("hibernate.dialect",
 * "org.hibernate.dialect.MySQLDialect"); // Set your MySQL dialect
 * // here
 * return properties;
 * }
 * }
 */