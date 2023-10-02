package repository.dbModel.query.Costing;

import core.dbmanager.DatabaseConnection;
import repository.dbModel.costing.CostingDbModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CostingQuery {


    public CostingDbModel costingReq(int id) throws SQLException, ClassNotFoundException {
        CostingDbModel costingDbModel = new CostingDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from brand where id ="+ id +"  limit 1");

        if(resultSet!=null){
            try{
                while (resultSet.next()) {
                    System.out.println("Data fetching ...........Costing Request..............");

                  /*  collectionDbModel.setRef_number(String.valueOf(resultSet.getString(2)));
                    collectionDbModel.setStatus(resultSet.getInt(3));
                    collectionDbModel.setCollection_id(resultSet.getInt(4));*/
                    costingDbModel.setName(resultSet.getString(4));


                }
            }catch (Exception e){
                System.out.println(e + "getLineItemsData");
            }
        }else {
            System.out.println("ResultSet at getLineItemsData is NULL");
        }

        return costingDbModel;

    }

    //Costing Api Remarks
    public CostingDbModel costingRemarks(int id) throws SQLException, ClassNotFoundException {
        CostingDbModel costingDbModel = new CostingDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from initial_costing where id ="+ id +"  limit 1");

        if(resultSet!=null){
            try{
                while (resultSet.next()) {
                    System.out.println("Data fetching ...........Costing Remarks..............");

                  /*  collectionDbModel.setRef_number(String.valueOf(resultSet.getString(2)));
                    collectionDbModel.setStatus(resultSet.getInt(3));
                    collectionDbModel.setCollection_id(resultSet.getInt(4));*/
                    costingDbModel.setRemarks(resultSet.getString(21));


                }
            }catch (Exception e){
                System.out.println(e + "getLineItemsData");
            }
        }else {
            System.out.println("ResultSet at getLineItemsData is NULL");
        }

        return costingDbModel;

    }

    //Costing Api Add Variant
    public CostingDbModel costingAddVariant(int id) throws SQLException, ClassNotFoundException {
        CostingDbModel costingDbModel = new CostingDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from product where id ="+ id +"  limit 1");

        if(resultSet!=null){
            try{
                while (resultSet.next()) {
                    System.out.println("Data fetching ...........Costing Add Variant..............");

                  /*  collectionDbModel.setRef_number(String.valueOf(resultSet.getString(2)));
                    collectionDbModel.setStatus(resultSet.getInt(3));
                    collectionDbModel.setCollection_id(resultSet.getInt(4));*/
                    costingDbModel.setRef_number(resultSet.getString(18));


                }
            }catch (Exception e){
                System.out.println(e + "getLineItemsData");
            }
        }else {
            System.out.println("ResultSet at getLineItemsData is NULL");
        }

        return costingDbModel;

    }

    //Costing Api Process All Cost
    public CostingDbModel costingProcessAllCost(int id) throws SQLException, ClassNotFoundException {
        CostingDbModel costingDbModel = new CostingDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from initial_costing where id ="+ id +"  limit 1");

        if(resultSet!=null){
            try{
                while (resultSet.next()) {
                    System.out.println("Data fetching ...........Costing Process All..............");

                  /*  collectionDbModel.setRef_number(String.valueOf(resultSet.getString(2)));
                    collectionDbModel.setStatus(resultSet.getInt(3));
                    collectionDbModel.setCollection_id(resultSet.getInt(4));*/
                    costingDbModel.setRemarks(resultSet.getString(21));


                }
            }catch (Exception e){
                System.out.println(e + "getLineItemsData");
            }
        }else {
            System.out.println("ResultSet at getLineItemsData is NULL");
        }

        return costingDbModel;

    }
    //Costing Api Add
    public CostingDbModel costingAdd(int id) throws SQLException, ClassNotFoundException {
        CostingDbModel costingDbModel = new CostingDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from initial_costing where id ="+ id +"  limit 1");

        if(resultSet!=null){
            try{
                while (resultSet.next()) {
                    System.out.println("Data fetching ...........Costing Add..............");

                  /*  collectionDbModel.setRef_number(String.valueOf(resultSet.getString(2)));
                    collectionDbModel.setStatus(resultSet.getInt(3));
                    collectionDbModel.setCollection_id(resultSet.getInt(4));*/
                    costingDbModel.setMoq(resultSet.getInt(11));


                }
            }catch (Exception e){
                System.out.println(e + "getLineItemsData");
            }
        }else {
            System.out.println("ResultSet at getLineItemsData is NULL");
        }

        return costingDbModel;

    }

    //Costing Api Cost Wise
    public CostingDbModel costingQuantityWiseCosting(int id) throws SQLException, ClassNotFoundException {
        CostingDbModel costingDbModel = new CostingDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from quantity_wise_initial_costing where id ="+ id +"  limit 1");

        if(resultSet!=null){
            try{
                while (resultSet.next()) {
                    System.out.println("Data fetching ...........Costing Quantity Wise..............");

                  /*  collectionDbModel.setRef_number(String.valueOf(resultSet.getString(2)));
                    collectionDbModel.setStatus(resultSet.getInt(3));
                    collectionDbModel.setCollection_id(resultSet.getInt(4));*/
                    costingDbModel.setMinimum_quantity(resultSet.getInt(3));
                    costingDbModel.setPrice(resultSet.getDouble(4));


                }
            }catch (Exception e){
                System.out.println(e + "getLineItemsData");
            }
        }else {
            System.out.println("ResultSet at getLineItemsData is NULL");
        }

        return costingDbModel;

    }
    //Costing Api Cost Wise
    public CostingDbModel costing_Init_Collection(int id) throws SQLException, ClassNotFoundException {
        CostingDbModel costingDbModel = new CostingDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from product where id ="+ id +"  limit 1");

        if(resultSet!=null){
            try{
                while (resultSet.next()) {
                    System.out.println("Data fetching ...........Costing Initial Collection..............");

                  /*  collectionDbModel.setRef_number(String.valueOf(resultSet.getString(2)));
                    collectionDbModel.setStatus(resultSet.getInt(3));
                    collectionDbModel.setCollection_id(resultSet.getInt(4));*/
                    costingDbModel.setBrand_id(resultSet.getInt(1));
                    costingDbModel.setName(resultSet.getString(8));
                    costingDbModel.setRef_number(resultSet.getString(18));


                }
            }catch (Exception e){
                System.out.println(e + "getLineItemsData");
            }
        }else {
            System.out.println("ResultSet at getLineItemsData is NULL");
        }

        return costingDbModel;

    }

    //Costing Quote Single
    public CostingDbModel costingQuote(int id) throws SQLException, ClassNotFoundException {
        CostingDbModel costingDbModel = new CostingDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from product where id ="+ id +"  limit 1");


        if(resultSet!=null){
            try{
                while (resultSet.next()) {
                    System.out.println("Data fetching ...........Costing Quote.............");

                  /*  collectionDbModel.setRef_number(String.valueOf(resultSet.getString(2)));
                    collectionDbModel.setStatus(resultSet.getInt(3));
                    collectionDbModel.setCollection_id(resultSet.getInt(4));*/
                    costingDbModel.setRef_number(resultSet.getString(18));
                    costingDbModel.setName(resultSet.getString(8));


                }
            }catch (Exception e){
                System.out.println(e + "getLineItemsData");
            }
        }
        return costingDbModel;

    }

    //Costing Quote Members
    public CostingDbModel costingQuoteMembers(int id) throws SQLException, ClassNotFoundException {
        CostingDbModel costingDbModel = new CostingDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from users where id ="+ id +"  limit 1");


        if(resultSet!=null){
            try{
                while (resultSet.next()) {
                    System.out.println("Data fetching ...........Costing Quote Members.............");

                  /*  collectionDbModel.setRef_number(String.valueOf(resultSet.getString(2)));
                    collectionDbModel.setStatus(resultSet.getInt(3));
                    collectionDbModel.setCollection_id(resultSet.getInt(4));*/
                    costingDbModel.setDesignation(resultSet.getString(11));
                    costingDbModel.setName(resultSet.getString(17));


                }
            }catch (Exception e){
                System.out.println(e + "getLineItemsData");
            }
        }
        return costingDbModel;

    }


    //Costing Quote Req
    public CostingDbModel costingQuoteReq(int id) throws SQLException, ClassNotFoundException {
        CostingDbModel costingDbModel = new CostingDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from quote_request where id ="+ id +"  limit 1");


        if(resultSet!=null){
            try{
                while (resultSet.next()) {
                    System.out.println("Data fetching ...........Costing Quote Req.............");

                  /*  collectionDbModel.setRef_number(String.valueOf(resultSet.getString(2)));
                    collectionDbModel.setStatus(resultSet.getInt(3));
                    collectionDbModel.setCollection_id(resultSet.getInt(4));*/
                    costingDbModel.setRef_number(resultSet.getString(2));
                    costingDbModel.setReq_by(resultSet.getString(6));


                }
            }catch (Exception e){
                System.out.println(e + "getLineItemsData");
            }
        }
        return costingDbModel;

    }


    //Costing Quote Item
    public CostingDbModel costingQuoteItem(int id) throws SQLException, ClassNotFoundException {
        CostingDbModel costingDbModel = new CostingDbModel();

        ResultSet resultSet = DatabaseConnection.executeQueries("select * from quote_item where id ="+ id +"  limit 1");


        if(resultSet!=null){
            try{
                while (resultSet.next()) {
                    System.out.println("Data fetching ...........Costing Quote Item.............");

                  /*  collectionDbModel.setRef_number(String.valueOf(resultSet.getString(2)));
                    collectionDbModel.setStatus(resultSet.getInt(3));
                    collectionDbModel.setCollection_id(resultSet.getInt(4));*/
                    costingDbModel.setVariation(resultSet.getString(4));


                }
            }catch (Exception e){
                System.out.println(e + "getLineItemsData");
            }
        }
        return costingDbModel;

    }

}
