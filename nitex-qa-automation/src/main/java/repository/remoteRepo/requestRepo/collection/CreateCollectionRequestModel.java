package repository.remoteRepo.requestRepo.collection;

import java.io.Serializable;
import java.util.List;

public class CreateCollectionRequestModel {


    /**
     * name : Sample collection for QA
     * brandId : 1
     * season : WINTER_23
     * tagRequestList : [{"text":"Winter"}]
     * isNitexCollection : true
     * privacy : CUSTOM
     */

    private String name;
    private int brandId;
    private String season;
    private boolean isNitexCollection;
    private String privacy;
    private List<TagRequestListBean> tagRequestList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public boolean isIsNitexCollection() {
        return isNitexCollection;
    }

    public void setIsNitexCollection(boolean isNitexCollection) {
        this.isNitexCollection = isNitexCollection;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public List<TagRequestListBean> getTagRequestList() {
        return tagRequestList;
    }

    public void setTagRequestList(List<TagRequestListBean> tagRequestList) {
        this.tagRequestList = tagRequestList;
    }

    public static class TagRequestListBean implements Serializable {
        /**
         * text : Winter
         */

        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
