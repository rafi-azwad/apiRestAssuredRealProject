package repository.remoteRepo.responseRepo.costing;

import java.io.Serializable;
import java.util.List;

public class CosGetQuoteMembersResponseModel {


    /**
     * id : 14055
     * name : Mohammad Auhiduzzaman
     * nickName : Auhiduzzaman
     * email : auhiduzzaman1@nitex.info
     * designation : Costing Engineer
     * primaryUserType : COSTING_MANAGER
     * allUserTypes : ["COSTING_MANAGER"]
     * profilePicDocument : {"id":27203,"docType":"PROFILE_PHOTO","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/profile_pic/2021/9/1632720570375_download-_1_.jpg","name":"download-_1_.jpg","dateAdded":"2021-09-27"}
     * phone : 01852346841
     * linkedInUrl : https://www.linkedin.com/in/demo-profile
     * department : Fashion Design
     */

    private int id;
    private String name;
    private String nickName;
    private String email;
    private String designation;
    private String primaryUserType;
    private ProfilePicDocumentBean profilePicDocument;
    private String phone;
    private String linkedInUrl;
    private String department;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLinkedInUrl() {
        return linkedInUrl;
    }

    public void setLinkedInUrl(String linkedInUrl) {
        this.linkedInUrl = linkedInUrl;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getAllUserTypes() {
        return allUserTypes;
    }

    public void setAllUserTypes(List<String> allUserTypes) {
        this.allUserTypes = allUserTypes;
    }

    public static class ProfilePicDocumentBean implements Serializable {
        /**
         * id : 27203
         * docType : PROFILE_PHOTO
         * docUrl : https://d2939dhdpmjcbe.cloudfront.net/profile_pic/2021/9/1632720570375_download-_1_.jpg
         * name : download-_1_.jpg
         * dateAdded : 2021-09-27
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
