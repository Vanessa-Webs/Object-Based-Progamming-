package org.example;

import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class Database {
    public static Sql2o db;

    static {
        db = new Sql2o("jdbc:mysql://localhost:3306/cafenicoboba", "Nicolas", "Tamankota123");
    }
}
