package repository.remoteRepo.requestRepo.photography;

public class PhotoPostUploadRequestModel {


    /**
     * name : 1678945037253_MB23-A0341-FT.jpg
     * docMimeType : image/jpeg
     * documentType : PRESENTATION_UPLOAD
     * base64Str : data:image/jpeg;base64
     */

    private String name;
    private String docMimeType;
    private String documentType;
    private String base64Str;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocMimeType() {
        return docMimeType;
    }

    public void setDocMimeType(String docMimeType) {
        this.docMimeType = docMimeType;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getBase64Str() {
        return base64Str;
    }

    public void setBase64Str(String base64Str) {
        this.base64Str = base64Str;
    }
}
