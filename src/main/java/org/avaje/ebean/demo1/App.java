package org.avaje.ebean.demo1;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;
import org.avaje.ebean.demo1.models.Customer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String sql = "select count(*) as count from dual";
        SqlRow row =
                Ebean.createSqlQuery(sql)
                        .findUnique();

        Integer i = row.getInteger("count");

        System.out.println("Got "+i+"  - DataSource good.");

        Customer c = new Customer();
        c.setFirstName("Alice");
        c.setLastName("Smith");

        Ebean.save(c);

        System.out.println("Hello World!");
    }
}
