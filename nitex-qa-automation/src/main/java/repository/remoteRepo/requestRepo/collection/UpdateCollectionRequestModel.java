package repository.remoteRepo.requestRepo.collection;

import java.io.Serializable;
import java.util.List;

public class UpdateCollectionRequestModel {

    /**
     * id : 38754
     * name : Sample collection for QA update
     * brandId : 1
     * isNitexCollection : true
     * season : WINTER_23
     * tagRequestList : [{"id":10505,"text":"Winter"}]
     */

    private String id;
    private String name;
    private int brandId;
    private boolean isNitexCollection;
    private String season;
    private List<TagRequestListBean> tagRequestList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public boolean isIsNitexCollection() {
        return isNitexCollection;
    }

    public void setIsNitexCollection(boolean isNitexCollection) {
        this.isNitexCollection = isNitexCollection;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public List<TagRequestListBean> getTagRequestList() {
        return tagRequestList;
    }

    public void setTagRequestList(List<TagRequestListBean> tagRequestList) {
        this.tagRequestList = tagRequestList;
    }

    public static class TagRequestListBean implements Serializable {
        /**
         * id : 10505
         * text : Winter
         */

        private int id;
        private String text;

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
    }
}
