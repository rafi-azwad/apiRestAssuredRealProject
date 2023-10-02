package repository.remoteRepo.responseRepo.collection;

import java.io.Serializable;

public class CollectionGetUserNEmailTypeResponseModel {


    /**
     * id : 9102
     * name : Rakib
     * email : rakibislam@nitex.info
     * designation : UI Developer
     * profilePicDocument : {"id":29653,"docType":"PROFILE_PHOTO","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/profile_pic/2021/11/1635845601620_1635788820707.jpg","name":"1635788820707.jpg","dateAdded":"2021-11-02"}
     */

    private int id;
    private String name;
    private String email;
    private String designation;
    private ProfilePicDocumentBean profilePicDocument;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public ProfilePicDocumentBean getProfilePicDocument() {
        return profilePicDocument;
    }

    public void setProfilePicDocument(ProfilePicDocumentBean profilePicDocument) {
        this.profilePicDocument = profilePicDocument;
    }

    public static class ProfilePicDocumentBean implements Serializable {
        /**
         * id : 29653
         * docType : PROFILE_PHOTO
         * docUrl : https://d2939dhdpmjcbe.cloudfront.net/profile_pic/2021/11/1635845601620_1635788820707.jpg
         * name : 1635788820707.jpg
         * dateAdded : 2021-11-02
         */

        private int id;
        private String docType;
        private String docUrl;
        private String name;
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

        public String getDateAdded() {
            return dateAdded;
        }

        public void setDateAdded(String dateAdded) {
            this.dateAdded = dateAdded;
        }
    }
}
