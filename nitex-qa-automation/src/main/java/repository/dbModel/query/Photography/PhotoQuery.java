package repository.dbModel.query.Photography;

import core.dbmanager.DatabaseConnection;
import repository.dbModel.photography.PhotoDbModel;
import repository.dbModel.sample.SampleDbModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PhotoQuery {

    public PhotoDbModel getPhotoTableInfo(int id, int id2) throws SQLException, ClassNotFoundException {
        PhotoDbModel photoDbModel = new PhotoDbModel();

        //ResultSet resultSet = DatabaseConnection.executeQueries("SELECT * FROM shopup_sc.line_items");
        ResultSet resultSet = DatabaseConnection.executeQueries("select * from collection where id =" + id + "  limit 1");
        ResultSet resultSet2 = DatabaseConnection.executeQueries("select * from brand where id =" + id2 + "  limit 1");
        ResultSet resultSet3 = DatabaseConnection.executeQueries("select * from users where id =" + id + "  limit 1");


        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching .........................");
                    photoDbModel.setCollection_name(String.valueOf(resultSet.getString(6)));

                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
                }
            }

        if (resultSet2 != null) {
            try {
                while (resultSet2.next()) {
                    System.out.println("Data fetching .........................");
                    photoDbModel.setBrand_name(String.valueOf(resultSet2.getString(4)));

                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        }
        if (resultSet3 != null) {
            try {
                while (resultSet3.next()) {
                    System.out.println("Data fetching .........................");
                    photoDbModel.setEmail(String.valueOf(resultSet3.getString(2)));
                    photoDbModel.setName(String.valueOf(resultSet3.getString(17)));

                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        }

        return photoDbModel;
    }
}

