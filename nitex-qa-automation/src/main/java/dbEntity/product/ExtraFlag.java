package dbEntity.product;

import dbEntity.document.DocumentType;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ExtraFlag {
    private boolean isArtBoardCreated;
    private boolean isMeasurementCompleted;
    private boolean isSupplierDeveloped;
    private List<DocumentType> photographyUpdated;

    public static ExtraFlag isArtBoardCreated( Boolean isArtBoardCreated ) {
        ExtraFlag extraFlag = new ExtraFlag();
        extraFlag.setArtBoardCreated( isArtBoardCreated );
        return extraFlag;
    }

    public static ExtraFlag isMeasurementCompleted( Boolean isMeasurementCompleted ) {
        ExtraFlag extraFlag = new ExtraFlag();
        extraFlag.setMeasurementCompleted( isMeasurementCompleted );
        return extraFlag;
    }

    public void updatePhotographyDocument( DocumentType documentType ) {
        if ( this.photographyUpdated == null )
            this.photographyUpdated = new ArrayList<>();
        if ( !this.photographyUpdated.contains( documentType ) )
            this.photographyUpdated.add( documentType );
    }

    public boolean isPhotographyUpdated() {
        return this.photographyUpdated != null && this.photographyUpdated.contains( DocumentType.FRONT_IMAGE ) &&
                this.photographyUpdated.contains( DocumentType.BACK_IMAGE ) &&
                this.photographyUpdated.contains( DocumentType.FABRIC_IMAGE ) &&
                this.photographyUpdated.contains( DocumentType.EMBELLISHMENT );
    }
}
