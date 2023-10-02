package repository.dbModel.query.DesignEdit;

import core.dbmanager.DatabaseConnection;
import repository.dbModel.designedit.DesignDbModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DesignQuery {


    public DesignDbModel getProduct(int id) throws SQLException, ClassNotFoundException {
        DesignDbModel designDbModel = new DesignDbModel();

        //ResultSet resultSet = DatabaseConnection.executeQueries("SELECT * FROM shopup_sc.line_items");
        ResultSet resultSet = DatabaseConnection.executeQueries("select * from product where id =" + id + "  limit 1");
        ResultSet resultSet2 = DatabaseConnection.executeQueries("select nick_name from users where id=(select owner from collection where id=" + id + ") limit 1");
        ResultSet resultSet3 = DatabaseConnection.executeQueries("select * from product_art_board where id =" + id + " limit 1");
        ResultSet resultSet4 = DatabaseConnection.executeQueries("select * from product_document_map where document_id =" + id + " limit 1");
        ResultSet resultSet5 = DatabaseConnection.executeQueries("select * from product_art_board where id =" + id + " limit 1");


        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching Product .........................");
                    designDbModel.setName(String.valueOf(resultSet.getString(8)));
                    designDbModel.setRef_Num(String.valueOf(resultSet.getString(18)));
                    designDbModel.setConstruction(String.valueOf(resultSet.getString(35)));

                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        }
        if (resultSet2 != null) {
            try {
                while (resultSet2.next()) {
                    System.out.println("Data fetching .........................");


                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
            if (resultSet3 != null) {
                try {
                    while (resultSet3.next()) {
                        System.out.println("Data fetching Product Dev New Post.........................");
                        designDbModel.setArtBoardName(String.valueOf(resultSet3.getString(3)));

                    }
                } catch (Exception e) {
                    System.out.println(e + "getLineItemsData");
                }
            }
            if (resultSet4 != null) {
                try {
                    while (resultSet4.next()) {
                        System.out.println("Data fetching Product Dev New Post.........................");
                        designDbModel.setProduct_Id(Integer.parseInt(String.valueOf(resultSet4.getString(1))));

                    }
                } catch (Exception e) {
                    System.out.println(e + "getLineItemsData");
                }
            }
        }

        return designDbModel;
    }

    ////////////////////
    public DesignDbModel getArtBoard(int id) throws SQLException, ClassNotFoundException {
        DesignDbModel designDbModel = new DesignDbModel();

        //ResultSet resultSet = DatabaseConnection.executeQueries("SELECT * FROM shopup_sc.line_items");
        ResultSet resultSet = DatabaseConnection.executeQueries("select * from product_art_board where id =" + id + "  limit 1");


        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching ArtBoard ID.........................");
                    designDbModel.setArtBoardName_2(String.valueOf(resultSet.getString(3)));
                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        } else {
            System.out.println("ResultSet at getLineItemsData is NULL");
        }

        return designDbModel;
    }

    ///////////////

    public DesignDbModel getProMeasureBoard(int id) throws SQLException, ClassNotFoundException {
        DesignDbModel designDbModel = new DesignDbModel();

        //ResultSet resultSet = DatabaseConnection.executeQueries("SELECT * FROM shopup_sc.line_items");
        ResultSet resultSet = DatabaseConnection.executeQueries("select * from size_category where id =" + id + "  limit 1");


        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching pro measurement.........................");
                    designDbModel.setName(String.valueOf(resultSet.getString(7)));
                    designDbModel.setBrand_Id(Integer.valueOf(resultSet.getString(11)));

                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        } else {
            System.out.println("ResultSet at getLineItemsData is NULL");
        }

        return designDbModel;
    }

    public DesignDbModel getProMeasureUnit(int id) throws SQLException, ClassNotFoundException {
        DesignDbModel designDbModel = new DesignDbModel();

        //ResultSet resultSet = DatabaseConnection.executeQueries("SELECT * FROM shopup_sc.line_items");
        ResultSet resultSet = DatabaseConnection.executeQueries("select * from point_of_measurement where id =" + id + "  limit 1");


        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching pro measurement.........................");
                    designDbModel.setName(String.valueOf(resultSet.getString(2)));
                    designDbModel.setCat_id(Integer.valueOf(resultSet.getString(4)));

                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        } else {
            System.out.println("ResultSet at getLineItemsData is NULL");
        }

        return designDbModel;
    }

    public DesignDbModel getTagsType(int id) throws SQLException, ClassNotFoundException {
        DesignDbModel designDbModel = new DesignDbModel();

        //ResultSet resultSet = DatabaseConnection.executeQueries("SELECT * FROM shopup_sc.line_items");
        ResultSet resultSet = DatabaseConnection.executeQueries("select * from free_text_tag where id =" + id + "  limit 1");


        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching Tags.........................");
                    designDbModel.setTags(String.valueOf(resultSet.getString(2)));

                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        } else {
            System.out.println("ResultSet at getLineItemsData is NULL");
        }

        return designDbModel;
    }

    public DesignDbModel getCollectionPhoto(int id) throws SQLException, ClassNotFoundException {
        DesignDbModel designDbModel = new DesignDbModel();

        //ResultSet resultSet = DatabaseConnection.executeQueries("SELECT * FROM shopup_sc.line_items");
        ResultSet resultSet = DatabaseConnection.executeQueries("select * from product where id =" + id + "  limit 1");

        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching pro measurement.........................");
                    designDbModel.setName(String.valueOf(resultSet.getString(8)));
                    designDbModel.setBrand_Id(Integer.valueOf(resultSet.getString(1)));

                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        } else {
            System.out.println("ResultSet at getLineItemsData is NULL");
        }

        return designDbModel;
    }

    public DesignDbModel designProStyleInfo(int id) throws SQLException, ClassNotFoundException {
        DesignDbModel designDbModel = new DesignDbModel();

        //ResultSet resultSet = DatabaseConnection.executeQueries("SELECT * FROM shopup_sc.line_items");
        ResultSet resultSet = DatabaseConnection.executeQueries("select * from product where id =" + id + "  limit 1");


        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching ArtBoard ID.........................");
                    designDbModel.setName(String.valueOf(resultSet.getString(8)));
                    designDbModel.setRef_Num(String.valueOf(resultSet.getString(18)));

                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        } else {
            System.out.println("ResultSet at getLineItemsData is NULL");
        }

        return designDbModel;
    }


    public DesignDbModel getComment(int id) throws SQLException, ClassNotFoundException {
        DesignDbModel designDbModel = new DesignDbModel();

        //ResultSet resultSet = DatabaseConnection.executeQueries("SELECT * FROM shopup_sc.line_items");
        ResultSet resultSet = DatabaseConnection.executeQueries("select * from post where id =" + id + "  limit 1");


        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    System.out.println("Data fetching Comment Text.........................");
                    designDbModel.setText(String.valueOf(resultSet.getString(4)));

                }
            } catch (Exception e) {
                System.out.println(e + "getLineItemsData");
            }
        } else {
            System.out.println("ResultSet at getLineItemsData is NULL");
        }

        return designDbModel;
    }

}
