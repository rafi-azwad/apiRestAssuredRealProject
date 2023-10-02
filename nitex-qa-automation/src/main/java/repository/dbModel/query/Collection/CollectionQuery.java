package repository.dbModel.query.Collection;

import core.dbmanager.DatabaseConnection;
import repository.dbModel.collection.CollectionDbModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CollectionQuery {

    public CollectionDbModel getCollectionTableInfo(int id) throws SQLException, ClassNotFoundException {
        CollectionDbModel collectionDbModel = new CollectionDbModel();

        //ResultSet resultSet = DatabaseConnection.executeQueries("SELECT * FROM shopup_sc.line_items");
        ResultSet resultSet = DatabaseConnection.executeQueries("select * from collection where id =" + id + "  limit 1");
        ResultSet resultSet2 = DatabaseConnection.executeQueries("select nick_name from users where id=(select owner from collection where id="+ id +") limit 1");

        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching .........................");
                    collectionDbModel.setName(String.valueOf(resultSet.getString(8)));
                    collectionDbModel.setBrand_id(resultSet.getInt(10));
                    collectionDbModel.setSeason(resultSet.getInt(12));
                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        }
        if (resultSet2 != null) {
            try {
                while (resultSet2.next()) {
                    System.out.println("Data fetching .........................");

                    collectionDbModel.setOwnerName(resultSet2.getString(1));


                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        }

     else{
                System.out.println("ResultSet at getLineItemsData is NULL");
            }

            return collectionDbModel;


        }

    public CollectionDbModel getCollectionMy(int id) throws SQLException, ClassNotFoundException {
        CollectionDbModel collectionDbModel = new CollectionDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from collection where id =" + id + "  limit 1");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching .........................");
                    collectionDbModel.setName(String.valueOf(resultSet.getString(8)));
                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        }
        else{
            System.out.println("ResultSet at getLineItemsData is NULL");
        }
        return collectionDbModel;
    }

    public CollectionDbModel getCollectionSearchStatus(int id) throws SQLException, ClassNotFoundException {
        CollectionDbModel collectionDbModel = new CollectionDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from collection where id =" + id + "  limit 1");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching .........................");
                    collectionDbModel.setName(String.valueOf(resultSet.getString(6)));
                    collectionDbModel.setBrand_id(Integer.parseInt(String.valueOf(resultSet.getString(12))));
                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        }
        else{
            System.out.println("ResultSet at getLineItemsData is NULL");
        }
        return collectionDbModel;
    }
    public CollectionDbModel getcollectionGetSingleMember(int id) throws SQLException, ClassNotFoundException {
        CollectionDbModel collectionDbModel = new CollectionDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from users where id =" + id + "  limit 1");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching .........................");
                    collectionDbModel.setName(String.valueOf(resultSet.getString(19)));
                    collectionDbModel.setEmail((String.valueOf(resultSet.getString(2))));
                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        }
        else{
            System.out.println("ResultSet at getLineItemsData is NULL");
        }
        return collectionDbModel;
    }

    public CollectionDbModel getcollectionProducts(int id) throws SQLException, ClassNotFoundException {
        CollectionDbModel collectionDbModel = new CollectionDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from product where id =" + id + "  limit 1");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching .........................");
                    collectionDbModel.setName(String.valueOf(resultSet.getString(8)));
                    collectionDbModel.setRef(String.valueOf(resultSet.getString(10)));
                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        }
        else{
            System.out.println("ResultSet at getLineItemsData is NULL");
        }
        return collectionDbModel;
    }

    public CollectionDbModel getcollectionEmainNUserType(int id) throws SQLException, ClassNotFoundException {
        CollectionDbModel collectionDbModel = new CollectionDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from users where id =" + id + "  limit 1");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching .........................");
                    collectionDbModel.setDesignation((String.valueOf(resultSet.getString(11))));
                    collectionDbModel.setName(String.valueOf(resultSet.getString(17)));
                    collectionDbModel.setEmail((String.valueOf(resultSet.getString(2))));

                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        }
        else{
            System.out.println("ResultSet at getLineItemsData is NULL");
        }
        return collectionDbModel;
    }
    public CollectionDbModel getAllBrand(int id) throws SQLException, ClassNotFoundException {
        CollectionDbModel collectionDbModel = new CollectionDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from brand where id =" + id + "  limit 1");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching .........................");
                    collectionDbModel.setName(String.valueOf(resultSet.getString(5)));
                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        }
        else{
            System.out.println("ResultSet at getLineItemsData is NULL");
        }
        return collectionDbModel;
    }
    public CollectionDbModel getSubCategory(int id) throws SQLException, ClassNotFoundException {
        CollectionDbModel collectionDbModel = new CollectionDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from product_sub_category where id =" + id + "  limit 1");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching .........................");
                    collectionDbModel.setName(String.valueOf(resultSet.getString(2)));
                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        }
        else{
            System.out.println("ResultSet at getLineItemsData is NULL");
        }
        return collectionDbModel;
    }

    public CollectionDbModel getOpsUnit(int id) throws SQLException, ClassNotFoundException {
        CollectionDbModel collectionDbModel = new CollectionDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from operational_unit where id =" + id + "  limit 1");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching .........................");
                    collectionDbModel.setName(String.valueOf(resultSet.getString(2)));
                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        }
        else{
            System.out.println("ResultSet at getLineItemsData is NULL");
        }
        return collectionDbModel;
    }

}

