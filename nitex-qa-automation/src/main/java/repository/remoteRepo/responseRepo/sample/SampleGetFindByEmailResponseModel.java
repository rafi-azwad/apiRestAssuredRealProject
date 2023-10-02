package repository.remoteRepo.responseRepo.sample;

import java.io.Serializable;

public class SampleGetFindByEmailResponseModel {


    /**
     * id : 7002
     * name : Md. Mokhlasur
     * email : mokhlasur1@nitex.info
     * designation : Pattern Master (CAD)
     * profilePicDocument : {"id":141017,"docType":"PROFILE_PHOTO","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/profile_pic/2023/1/1672913746563_download-_5_.jpg","name":"download-_5_.jpg","isGeneratedFromPDF":false,"dateAdded":"2023-01-05"}
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
         * id : 141017
         * docType : PROFILE_PHOTO
         * docUrl : https://d2939dhdpmjcbe.cloudfront.net/profile_pic/2023/1/1672913746563_download-_5_.jpg
         * name : download-_5_.jpg
         * isGeneratedFromPDF : false
         * dateAdded : 2023-01-05
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
