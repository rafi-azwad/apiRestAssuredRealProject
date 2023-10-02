package core.Helper;

import java.io.File;

public class FilePathHelper {



    public static final String dir = System.getProperty("user.dir");
    static File f = new File(dir);
    static String filepath = f.getParent();
    public static final String FilePathInCore = filepath + "/nitex-qa-automation/src/main/java/repository/localRepo/";

    public static final String collectionCreationJsonPath = FilePathInCore + "/apiJson/collection/collectionCreateFormat.json";
    public static final String collectionUpdateJsonPath = FilePathInCore + "/apiJson/collection/collectionUpdateFormat.json";

    public static final String collectionShare = FilePathInCore + "/apiJson/collection/collectionPostShare.json";

    public static final String collectionPostQuoteReq = FilePathInCore + "/apiJson/collection/collectionPostQuoteReq.json";

    public static final String collectionPostPersonalSet = FilePathInCore + "/apiJson/collection/collectionPostPersonalSet.json";

    public static final String collectionPostPhotoReq = FilePathInCore + "/apiJson/collection/collectionPostPhotoReq.json";

    public static final String collectionPostSampleReq = FilePathInCore + "/apiJson/collection/collectionPostSampleReq.json";

    public static final String collectionPostBulkReq = FilePathInCore + "/apiJson/collection/collectionPostBulkReq.json";

    public static final String collectionDelete = FilePathInCore + "/apiJson/collection/collectionDelete.json";


    public static final String idReaderPath = FilePathInCore + "/dataFile/collection/id.txt";

    public static final String member_id = FilePathInCore + "/dataFile/collection/member_id.txt";

    public static final String brand_id = FilePathInCore + "/dataFile/collection/brand_id.txt";

    public static final String idDesignReaderPath = FilePathInCore + "/dataFile/design/id.txt";

    public static final String costingRemarksUpdateJsonPath = FilePathInCore + "/apiJson/costing/costingRemrksPostFormat.json";

    public static final String costingPutUpdateVariant = FilePathInCore + "/apiJson/costing/costingPutUpdateVariant.json";

    public static final String costingAllProcess = FilePathInCore + "/apiJson/costing/costingAllProcess.json";

    public static final String costingAdd = FilePathInCore + "/apiJson/costing/costingAdd.json";

    public static final String costingQuantityAdd = FilePathInCore + "/apiJson/costing/costingQuantityAdd.json";


    public static final String dgnProductAdd = FilePathInCore + "/apiJson/designedit/dgnAddProduct.json";
    public static final String dgnProductAddV2 = FilePathInCore + "/apiJson/designedit/dgnAddProductV2.json";

    public static final String dgnProductRemove = FilePathInCore + "/apiJson/designedit/dgnRemoveProduct.json";

    public static final String dgnPresentationLink = FilePathInCore + "/apiJson/designedit/dgnPresentationLink.json";

    public static final String dgnSequence = FilePathInCore + "/apiJson/designedit/dgnPretSequence.json";

    public static final String dgnProDevComNew = FilePathInCore + "/apiJson/designedit/dgnProDevComNew.json";

    public static final String dgnProMeasurementRmv = FilePathInCore + "/apiJson/designedit/dgnProMeasurementRmv.json";

    public static final String dgnProMeasurement = FilePathInCore + "/apiJson/designedit/dgnProMeasurementRmv.json";

    public static final String dgnProMeasurementSizeCat = FilePathInCore + "/apiJson/designedit/dgnProMesSizeCat.json";

    public static final String DgnInspirationStyle = FilePathInCore + "/apiJson/designedit/dgnInspirationStyle.json";

    public static final String designDocgroupAdd = FilePathInCore + "/apiJson/designedit/dgnDocgroupAdd.json";

    public static final String designFabricAdd = FilePathInCore + "/apiJson/designedit/designFabricAdd.json";

    public static final String designArtBoardAdd = FilePathInCore + "/apiJson/designedit/designArtBoardAdd.json";

    public static final String dgnProStyleInfo = FilePathInCore + "/apiJson/designedit/designArtBoardAdd.json";

    public static final String dgnPutMaterialUpdate = FilePathInCore + "/apiJson/designedit/DgnPutMaterialUpdate.json";

    //SAMPLE/////////

    public static final String samplePostReqCompleteActivity = FilePathInCore + "/apiJson/sample/samplePostReqCompleteActivity.json";

    public static final String samplePutReqItemActivity = FilePathInCore + "/apiJson/sample/samplePutReqItemActivity.json";

    //PHOTOGRAPHY/////////

    public static final String photoPostGroupAdd = FilePathInCore + "/apiJson/photography/photoPostGroupAdd.json";

    public static final String photoPostUpload = FilePathInCore + "/apiJson/photography/photoPostUpload.json";

    ////////////////////////////////////////////////////////////////////////////////////////

    public static final String imageUpload1 = filepath+"/nitex-qa-automation/src/test/resources/images/image1.jpg";
    //public static final String imageUpload1 = filepath + "\\nitex-qa-automation\\src\\test\\resources\\images\\image1.jpg";


    public static final String imageUpload2 = filepath+"/nitex-qa-automation/src/test/resources/images/image2.jpg";
    // public static final String imageUpload2 = filepath + "\\nitex-qa-automation\\src\\test\\resources\\images\\image2.jpg";

    public static final String imageUpload3 = filepath+"/nitex-qa-automation/src/test/resources/images/image3.jpg";
    //public static final String imageUpload3 = filepath + "\\nitex-qa-automation\\src\\test\\resources\\images\\image3.jpg";



    ////////////////////CI CD///////////////

   /*
   public static final String imageUpload1 = filepath + "/NitexAutomation/src/test/resources/images/image1.jpg";

    public static final String imageUpload2 = filepath + "/NitexAutomation/src/test/resources/images/image2.jpg";

    public static final String imageUpload3 = filepath + "/NitexAutomation/src/test/resources/images/image3.jpg";

*/
    ////////////////////CI CD///////////////


}
