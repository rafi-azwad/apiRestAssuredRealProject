package repository.dbModel.query.Sample;

import core.dbmanager.DatabaseConnection;
import repository.dbModel.collection.CollectionDbModel;
import repository.dbModel.sample.SampleDbModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SampleQuery {

    public SampleDbModel getSampleTableInfo(int id, int id2) throws SQLException, ClassNotFoundException {
        SampleDbModel sampleDbModel = new SampleDbModel();

        //ResultSet resultSet = DatabaseConnection.executeQueries("SELECT * FROM shopup_sc.line_items");
        ResultSet resultSet = DatabaseConnection.executeQueries("select * from sample_request where id =" + id + "  limit 1");
        ResultSet resultSet2 = DatabaseConnection.executeQueries("select * from collection where id =" + id2 + "  limit 1");

        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching .........................");
                    sampleDbModel.setRef_name(String.valueOf(resultSet.getString(8)));

                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
                }
            }

        if (resultSet2 != null) {
            try {
                while (resultSet2.next()) {
                    System.out.println("Data fetching .........................");

                    sampleDbModel.setCollection_name(String.valueOf(resultSet2.getString(6)));
                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }

        }

        return sampleDbModel;

    }

    public SampleDbModel getSampleTableAll(int id, int id2) throws SQLException, ClassNotFoundException {
        SampleDbModel sampleDbModel = new SampleDbModel();

        //ResultSet resultSet = DatabaseConnection.executeQueries("SELECT * FROM shopup_sc.line_items");
        ResultSet resultSet = DatabaseConnection.executeQueries("select * from collection where id =" + id + "  limit 1");
        ResultSet resultSet2 = DatabaseConnection.executeQueries("select * from sample_request where id =" + id2 + "  limit 1");
        ResultSet resultSet3 = DatabaseConnection.executeQueries("select * from brand where id =" + id2 + "  limit 1");

        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching .........................");
                    sampleDbModel.setCollection_name(String.valueOf(resultSet.getString(6)));

                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        }

        if (resultSet2 != null) {
            try {
                while (resultSet2.next()) {
                    System.out.println("Data fetching .........................");

                    sampleDbModel.setRef_name(String.valueOf(resultSet2.getString(8)));

                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }

        }

        if (resultSet3 != null) {
            try {
                while (resultSet3.next()) {
                    System.out.println("Data fetching .........................");
                    sampleDbModel.setBrand(String.valueOf(resultSet3.getString(4)));

                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        }
        return sampleDbModel;
    }

    public SampleDbModel getsampleGetReqMembers(int id) throws SQLException, ClassNotFoundException {
        SampleDbModel sampleDbModel = new SampleDbModel();

        //ResultSet resultSet = DatabaseConnection.executeQueries("SELECT * FROM shopup_sc.line_items");
        ResultSet resultSet = DatabaseConnection.executeQueries("select * from users where id =" + id + "  limit 1");


        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching .........................");
                    sampleDbModel.setEmail(String.valueOf(resultSet.getString(2)));
                    sampleDbModel.setDepartment(String.valueOf(resultSet.getString(10)));
                    sampleDbModel.setDesignation(String.valueOf(resultSet.getString(11)));
                    sampleDbModel.setName(String.valueOf(resultSet.getString(17)));

                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        }

        return sampleDbModel;
    }

    public SampleDbModel getsampleGetMaterials(int id) throws SQLException, ClassNotFoundException {
        SampleDbModel sampleDbModel = new SampleDbModel();

        //ResultSet resultSet = DatabaseConnection.executeQueries("SELECT * FROM shopup_sc.line_items");
        ResultSet resultSet = DatabaseConnection.executeQueries("select * from material where id =" + id + "  limit 1");


        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching .........................");
                    sampleDbModel.setDescription(String.valueOf(resultSet.getString(2)));
                    sampleDbModel.setRef_number(String.valueOf(resultSet.getString(16)));

                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        }

        return sampleDbModel;
    }


}

