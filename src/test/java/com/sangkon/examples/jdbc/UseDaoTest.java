package com.sangkon.examples.jdbc;

import com.sangkon.examples.jdbc.ConnectionManager;
import com.sangkon.examples.jdbc.User;
import com.sangkon.examples.jdbc.UserDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

public class UseDaoTest {
    @BeforeEach
    void setUP() {
        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        populator.addScript(new ClassPathResource("db_schema.sql"));
        DatabasePopulatorUtils.execute(populator, ConnectionManager.getDataSource());
    }

    @Test
    void createTest() throws SQLException {
        UserDao userDao = new UserDao();
        userDao.create(new User("wizard", "password", "name", "email"));
        User user = userDao.findByUserId("wizard");
        assertThat(user).isEqualTo(new User("wizard", "password", "name", "email"));
    }
}

