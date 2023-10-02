package repository.remoteRepo.responseRepo.sample;

import java.io.Serializable;
import java.util.List;

public class SampleGetProductMaterialResponseModel {


    /**
     * id : 58054
     * libraryId : 56505
     * referenceNumber : F23-A0084
     * name : Sherpa, 70.0% Viscose 30.0% Cotton, 150.0 GSM, Light peach
     * description : dd
     * materialType : MAIN_FABRIC
     * compositionDetails : 70.0% Viscose 30.0% Cotton
     * documentPath : https://d2939dhdpmjcbe.cloudfront.net/2023/5/1683017612935_F22-2018-B.png
     * documentId : 157554
     * lastReceivedDate : 2023-04-28
     * quantity : 2.0
     * quantityUnit : KG
     * tagResponseList : []
     * fixedTagResponseList : [{"id":39,"text":"Light peach","type":"SUPPLIER_FINISH"}]
     * colorResponseList : []
     * documentResponseList : [{"id":157554,"docType":"MATERIAL_FEATURE_IMAGE","documentGroup":"MATERIAL_IMAGE","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/2023/5/1683017612935_F22-2018-B.png","name":"F22-2018-B.png","isGeneratedFromPDF":false,"dateAdded":"2023-05-02"},{"id":156309,"docType":"MATERIAL_DETAILS_IMAGE","documentGroup":"MATERIAL_IMAGE","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/2023/4/1681894344739_F22-2018-D.png","name":"F22-2018-D.png","isGeneratedFromPDF":false,"dateAdded":"2023-04-19"},{"id":156310,"docType":"MATERIAL_FRONT_IMAGE","documentGroup":"MATERIAL_IMAGE","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/2023/4/1681894349405_F22-2018-F.png","name":"F22-2018-F.png","isGeneratedFromPDF":false,"dateAdded":"2023-04-19"}]
     * isInventoryAvailable : false
     * liked : false
     * fabricDetailsTableResponse : {"fabricType":"Non-Woven","construction":"Sherpa","constructionDetails":"","gsm":150,"weightUnit":"GSM","compositionPartList":[{"percentage":"70","fiberName":"Viscose"},{"percentage":"30","fiberName":"Cotton"}]}
     */

    private int id;
    private int libraryId;
    private String referenceNumber;
    private String name;
    private String description;
    private String materialType;
    private String compositionDetails;
    private String documentPath;
    private int documentId;
    private String lastReceivedDate;
    private double quantity;
    private String quantityUnit;
    private boolean isInventoryAvailable;
    private boolean liked;
    private FabricDetailsTableResponseBean fabricDetailsTableResponse;
    private List<?> tagResponseList;
    private List<FixedTagResponseListBean> fixedTagResponseList;
    private List<?> colorResponseList;
    private List<DocumentResponseListBean> documentResponseList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getCompositionDetails() {
        return compositionDetails;
    }

    public void setCompositionDetails(String compositionDetails) {
        this.compositionDetails = compositionDetails;
    }

    public String getDocumentPath() {
        return documentPath;
    }

    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getLastReceivedDate() {
        return lastReceivedDate;
    }

    public void setLastReceivedDate(String lastReceivedDate) {
        this.lastReceivedDate = lastReceivedDate;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getQuantityUnit() {
        return quantityUnit;
    }

    public void setQuantityUnit(String quantityUnit) {
        this.quantityUnit = quantityUnit;
    }

    public boolean isIsInventoryAvailable() {
        return isInventoryAvailable;
    }

    public void setIsInventoryAvailable(boolean isInventoryAvailable) {
        this.isInventoryAvailable = isInventoryAvailable;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public FabricDetailsTableResponseBean getFabricDetailsTableResponse() {
        return fabricDetailsTableResponse;
    }

    public void setFabricDetailsTableResponse(FabricDetailsTableResponseBean fabricDetailsTableResponse) {
        this.fabricDetailsTableResponse = fabricDetailsTableResponse;
    }

    public List<?> getTagResponseList() {
        return tagResponseList;
    }

    public void setTagResponseList(List<?> tagResponseList) {
        this.tagResponseList = tagResponseList;
    }

    public List<FixedTagResponseListBean> getFixedTagResponseList() {
        return fixedTagResponseList;
    }

    public void setFixedTagResponseList(List<FixedTagResponseListBean> fixedTagResponseList) {
        this.fixedTagResponseList = fixedTagResponseList;
    }

    public List<?> getColorResponseList() {
        return colorResponseList;
    }

    public void setColorResponseList(List<?> colorResponseList) {
        this.colorResponseList = colorResponseList;
    }

    public List<DocumentResponseListBean> getDocumentResponseList() {
        return documentResponseList;
    }

    public void setDocumentResponseList(List<DocumentResponseListBean> documentResponseList) {
        this.documentResponseList = documentResponseList;
    }

    public static class FabricDetailsTableResponseBean implements Serializable {
        /**
         * fabricType : Non-Woven
         * construction : Sherpa
         * constructionDetails :
         * gsm : 150.0
         * weightUnit : GSM
         * compositionPartList : [{"percentage":"70","fiberName":"Viscose"},{"percentage":"30","fiberName":"Cotton"}]
         */

        private String fabricType;
        private String construction;
        private String constructionDetails;
        private double gsm;
        private String weightUnit;
        private List<CompositionPartListBean> compositionPartList;

        public String getFabricType() {
            return fabricType;
        }

        public void setFabricType(String fabricType) {
            this.fabricType = fabricType;
        }

        public String getConstruction() {
            return construction;
        }

        public void setConstruction(String construction) {
            this.construction = construction;
        }

        public String getConstructionDetails() {
            return constructionDetails;
        }

        public void setConstructionDetails(String constructionDetails) {
            this.constructionDetails = constructionDetails;
        }

        public double getGsm() {
            return gsm;
        }

        public void setGsm(double gsm) {
            this.gsm = gsm;
        }

        public String getWeightUnit() {
            return weightUnit;
        }

        public void setWeightUnit(String weightUnit) {
            this.weightUnit = weightUnit;
        }

        public List<CompositionPartListBean> getCompositionPartList() {
            return compositionPartList;
        }

        public void setCompositionPartList(List<CompositionPartListBean> compositionPartList) {
            this.compositionPartList = compositionPartList;
        }

        public static class CompositionPartListBean implements Serializable {
            /**
             * percentage : 70
             * fiberName : Viscose
             */

            private String percentage;
            private String fiberName;

            public String getPercentage() {
                return percentage;
            }

            public void setPercentage(String percentage) {
                this.percentage = percentage;
            }

            public String getFiberName() {
                return fiberName;
            }

            public void setFiberName(String fiberName) {
                this.fiberName = fiberName;
            }
        }
    }

    public static class FixedTagResponseListBean implements Serializable {
        /**
         * id : 39
         * text : Light peach
         * type : SUPPLIER_FINISH
         */

        private int id;
        private String text;
        private String type;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class DocumentResponseListBean implements Serializable {
        /**
         * id : 157554
         * docType : MATERIAL_FEATURE_IMAGE
         * documentGroup : MATERIAL_IMAGE
         * docUrl : https://d2939dhdpmjcbe.cloudfront.net/2023/5/1683017612935_F22-2018-B.png
         * name : F22-2018-B.png
         * isGeneratedFromPDF : false
         * dateAdded : 2023-05-02
         */

        private int id;
        private String docType;
        private String documentGroup;
        private String docUrl;
        private String name;
        private boolean isGeneratedFromPDF;
        private String dateAdded;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDocType() {
            return docType;
        }

        public void setDocType(String docType) {
            this.docType = docType;
        }

        public String getDocumentGroup() {
            return documentGroup;
        }

        public void setDocumentGroup(String documentGroup) {
            this.documentGroup = documentGroup;
        }

        public String getDocUrl() {
            return docUrl;
        }

        public void setDocUrl(String docUrl) {
            this.docUrl = docUrl;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isIsGeneratedFromPDF() {
            return isGeneratedFromPDF;
        }

        public void setIsGeneratedFromPDF(boolean isGeneratedFromPDF) {
            this.isGeneratedFromPDF = isGeneratedFromPDF;
        }

        public String getDateAdded() {
            return dateAdded;
        }

        public void setDateAdded(String dateAdded) {
            this.dateAdded = dateAdded;
        }
    }
}
