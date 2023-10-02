package repository.remoteRepo.responseRepo.order;

import java.io.Serializable;
import java.util.List;

public class OrderMembersResponseModel {

    /**
     * id : 11402
     * name : Syed A. T. M. Marzan
     * email : satmmarzan@gmail.com
     * phone : +8801858163253
     * primaryUserType : BUYER
     * allUserTypes : ["BUYER"]
     * profilePicDocument : {"id":41407,"docType":"PROFILE_PHOTO","docUrl":"https://lh3.googleusercontent.com/a-/AOh14GglWFiP5vaSXXPwnvX8IV82DTLAAD4vTAw725o6=s96-c","name":"","dateAdded":"2022-01-25"}
     * isShare : false
     * nickName : Hasib
     * designation : Senior Production Merchandiser
     * department : Quality
     * linkedInUrl : https://www.linkedin.com/in/arman-shatu-1a4176ab/
     */

    private int id;
    private String name;
    private String email;
    private String phone;
    private String primaryUserType;
    private ProfilePicDocumentBean profilePicDocument;
    private boolean isShare;
    private String nickName;
    private String designation;
    private String department;
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

    public boolean isIsShare() {
        return isShare;
    }

    public void setIsShare(boolean isShare) {
        this.isShare = isShare;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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
         * id : 41407
         * docType : PROFILE_PHOTO
         * docUrl : https://lh3.googleusercontent.com/a-/AOh14GglWFiP5vaSXXPwnvX8IV82DTLAAD4vTAw725o6=s96-c
         * name :
         * dateAdded : 2022-01-25
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
