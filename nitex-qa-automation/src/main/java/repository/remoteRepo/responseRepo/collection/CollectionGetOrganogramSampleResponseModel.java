package repository.remoteRepo.responseRepo.collection;

import java.io.Serializable;

public class CollectionGetOrganogramSampleResponseModel {


    /**
     * id : 1
     * name : BD-Inhouse
     * type : SAMPLE_HOUSE
     * countryResponse : {"id":1,"name":"Bangladesh"}
     */

    private int id;
    private String name;
    private String type;
    private CountryResponseBean countryResponse;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CountryResponseBean getCountryResponse() {
        return countryResponse;
    }

    public void setCountryResponse(CountryResponseBean countryResponse) {
        this.countryResponse = countryResponse;
    }

    public static class CountryResponseBean implements Serializable {
        /**
         * id : 1
         * name : Bangladesh
         */

        private int id;
        private String name;

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
    }
}
