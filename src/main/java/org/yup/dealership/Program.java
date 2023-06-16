package org.yup.dealership;

import org.apache.commons.dbcp2.BasicDataSource;
import org.yup.dealership.models.DataSource;
import org.yup.dealership.views.UserInterface;

public class Program {

    public static void main(String[] args) {

        if(args.length != 2){
            System.out.println("Invalid username and password is required");
            System.exit(1);
        }

        String userName = args[0];
        String password = args[1];
        String url = "jdbc:mysql://localhost:3306/Dealership";

        DataSource dataSource = new DataSource(url, userName,password);

    }

//    private static BasicDataSource getDataSource(String userName, String password){
//        BasicDataSource dataSource = new BasicDataSource();
//
//        dataSource.setUsername(userName);
//        dataSource.setPassword(password);
//        dataSource.setUrl("jdbc:mysql://localhost:3306/Dealership");
//
//        return dataSource;
//    }
}
