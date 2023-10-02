package repository.remoteRepo.responseRepo.collection;

import java.io.Serializable;
import java.util.List;

public class CollectionGetSingleMemberResponseModel {


    /**
     * id : 3007
     * name : Towhid Rahman
     * designation : Business Relationship Partner
     * email : towhid1@nitex.info
     * profilePicDocument : {"id":78652,"docType":"PROFILE_PHOTO","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/profile_pic/2022/5/1653906356888_download.jpg","name":"download.jpg","isGeneratedFromPDF":false,"dateAdded":"2022-05-30"}
     * nickName : Towhid
     * department : Business Development
     * primaryUserType : ACCOUNT_MANAGER
     * allUserTypes : ["ACCOUNT_MANAGER"]
     */

    private int id;
    private String name;
    private String designation;
    private String email;
    private ProfilePicDocumentBean profilePicDocument;
    private String nickName;
    private String department;
    private String primaryUserType;
    private List<String> allUserTypes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ProfilePicDocumentBean getProfilePicDocument() {
        return profilePicDocument;
    }

    public void setProfilePicDocument(ProfilePicDocumentBean profilePicDocument) {
        this.profilePicDocument = profilePicDocument;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPrimaryUserType() {
        return primaryUserType;
    }

    public void setPrimaryUserType(String primaryUserType) {
        this.primaryUserType = primaryUserType;
    }

    public List<String> getAllUserTypes() {
        return allUserTypes;
    }

    public void setAllUserTypes(List<String> allUserTypes) {
        this.allUserTypes = allUserTypes;
    }

    public static class ProfilePicDocumentBean implements Serializable {
        /**
         * id : 78652
         * docType : PROFILE_PHOTO
         * docUrl : https://d2939dhdpmjcbe.cloudfront.net/profile_pic/2022/5/1653906356888_download.jpg
         * name : download.jpg
         * isGeneratedFromPDF : false
         * dateAdded : 2022-05-30
         */

        private int id;
        private String docType;
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
