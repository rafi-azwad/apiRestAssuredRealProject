package repository.remoteRepo.responseRepo.sample;

import java.io.Serializable;
import java.util.List;

public class SampleGetReqMembersResponseModel {


    /**
     * id : 12802
     * name : Nur Alam Jahangir
     * nickName : Jahangir
     * email : jahangir1@nitex.info
     * phone : 01712123456
     * designation : Sample development manager
     * department : Sample
     * primaryUserType : SAMPLE_DEVELOPMENT
     * allUserTypes : ["SAMPLE_DEVELOPMENT"]
     * profilePicDocument : {"id":84202,"docType":"PROFILE_PHOTO","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/profile_pic/2022/6/1655025989397_1640007584357_PP2X2.jpeg","name":"1640007584357_PP2X2.jpeg","isGeneratedFromPDF":false,"dateAdded":"2022-06-12"}
     * linkedInUrl : https://www.linkedin.com/in/demo-account-38a90b23?trk=people-guest_people_search-card
     */

    private int id;
    private String name;
    private String nickName;
    private String email;
    private String phone;
    private String designation;
    private String department;
    private String primaryUserType;
    private ProfilePicDocumentBean profilePicDocument;
    private String linkedInUrl;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
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

    public ProfilePicDocumentBean getProfilePicDocument() {
        return profilePicDocument;
    }

    public void setProfilePicDocument(ProfilePicDocumentBean profilePicDocument) {
        this.profilePicDocument = profilePicDocument;
    }

    public String getLinkedInUrl() {
        return linkedInUrl;
    }

    public void setLinkedInUrl(String linkedInUrl) {
        this.linkedInUrl = linkedInUrl;
    }

    public List<String> getAllUserTypes() {
        return allUserTypes;
    }

    public void setAllUserTypes(List<String> allUserTypes) {
        this.allUserTypes = allUserTypes;
    }

    public static class ProfilePicDocumentBean implements Serializable {
        /**
         * id : 84202
         * docType : PROFILE_PHOTO
         * docUrl : https://d2939dhdpmjcbe.cloudfront.net/profile_pic/2022/6/1655025989397_1640007584357_PP2X2.jpeg
         * name : 1640007584357_PP2X2.jpeg
         * isGeneratedFromPDF : false
         * dateAdded : 2022-06-12
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
