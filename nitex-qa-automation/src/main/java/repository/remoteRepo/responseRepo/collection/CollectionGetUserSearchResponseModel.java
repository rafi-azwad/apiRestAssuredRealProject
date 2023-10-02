package repository.remoteRepo.responseRepo.collection;

import java.io.Serializable;
import java.util.List;

public class CollectionGetUserSearchResponseModel {


    /**
     * totalPages : 57
     * totalElements : 846
     * currentPage : 0
     * data : [{"id":10002,"name":"Syed Marzan","email":"syed.marzan.sa@gmail.com","primaryUserType":"BUYER"},{"id":19002,"name":"Tanveer","email":"tnvr@zara.com","primaryUserType":"BUYER"},{"id":6202,"name":"Md. Sufian","nickName":"Sufian","email":"sufian1@nitex.info","designation":"Quality Assurance Officer","primaryUserType":"QA"},{"id":17252,"name":"re","email":"sdfgg@gmail.com","primaryUserType":"BUYER"},{"id":18902,"name":"Rashedul Islam","email":"rashedul123.nitex@gmail.com","primaryUserType":"BUYER"},{"id":3002,"name":"Monjur Morshed","nickName":"Irteza","email":"irteza1@nitex.info","designation":"Business Evangelist","primaryUserType":"ACCOUNT_MANAGER"},{"id":11502,"name":"ENRAGÉ","email":"enrage@gmail.com","primaryUserType":"BUYER"},{"id":14502,"name":"Toni Purdie","nickName":"Toni","email":"toni1@nitex.info","designation":"Head of Design","primaryUserType":"FASHION_DESIGNER"},{"id":3012,"name":"Toma Nath","nickName":"Toma","email":"toma1@nitex.info","designation":"Fashion Designer","primaryUserType":"FASHION_DESIGNER"},{"id":14203,"name":"Alam Design","nickName":"Alam","email":"designalam@nitex.info","designation":"Fashion Designer","primaryUserType":"FASHION_DESIGNER"},{"id":14552,"name":"MD. ABDUL AL FAISAL","nickName":"Faisal","email":"faisal1@nitex.info","designation":"QA","primaryUserType":"SAMPLE_DEVELOPMENT"},{"id":15655,"name":"Jannatul Ferdows Puspa","nickName":"Puspa","email":"puspa1@nitex.info","designation":"Executive - Raw Material Innovation","primaryUserType":"MATERIAL_MANAGEMENT"},{"id":15855,"name":"YESIM SISIK","nickName":"YESIM","email":"yesim1@nitex.info","designation":"Country Head, Turkey","primaryUserType":"PROJECT_MANAGER"},{"id":12552,"name":"S M Mahbubul Alam","nickName":"Rezvy","email":"rizvi@nitex.info","designation":"Network Administrator","primaryUserType":"ADMIN"},{"id":9102,"name":"Rakib","nickName":"nickname","email":"rakibislam@nitex.info","designation":"UI Developer","primaryUserType":"ADMIN"}]
     */

    private int totalPages;
    private int totalElements;
    private int currentPage;
    private List<DataBean> data;

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * id : 10002
         * name : Syed Marzan
         * email : syed.marzan.sa@gmail.com
         * primaryUserType : BUYER
         * nickName : Sufian
         * designation : Quality Assurance Officer
         */

        private int id;
        private String name;
        private String email;
        private String primaryUserType;
        private String nickName;
        private String designation;

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

        public String getPrimaryUserType() {
            return primaryUserType;
        }

        public void setPrimaryUserType(String primaryUserType) {
            this.primaryUserType = primaryUserType;
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
    }
}
