package dbEntity.document;

import java.util.HashMap;
import java.util.Map;

public enum DocumentType {

    PRODUCT_DESIGN(0),
    PROFILE_PHOTO(1),
    PRODUCT_DESIGN_FRONT(2),
    ACCESSORIES_DESIGN(3),
    DESIGN_INSPIRATION(4),
    TECH_PACK_DESIGN(5),
    SUMMARY_FILE(6),
    AUTHORIZATION_LETTER(7),
    BANK_SLIP(8),
    REFERENCE_IMAGE(9),
    PRINT_DESIGN(10),
    EMBROIDERY_DESIGN(11),
    EMBELLISHMENT(12),
    OTHER(13),
    MATERIAL_DESIGN(14),
    FRONT_IMAGE(15),
    BACK_IMAGE(16),
    FABRIC_IMAGE(17),
    SIDE_IMAGE(18),
    HOW_TO_MEASURE_IMAGE(19),
    SUPPLIER_PHOTO_DOCUMENT(20),
    SUPPLIER_CERTIFICATE(21),
    PRESENTATION_MOOD_BOARD(22),
    PURCHASE_ORDER(23),
    COMMERCIAL_INVOICE(24),
    ART_BOARD(25),
    PRODUCT_NOT_IMAGE(26),
    PAYMENT_DOCUMENT( 27 ),
    STATIC_DOCUMENT( 28 ),
    MOODBOARD_FILE(29),
    MOODBOARD_IMAGE(30),
    MOODBOARD_PRODUCT_IMAGE(31),
    SAMPLE_REQUESTED_DOCUMENT(32),
    BADGE_DOCUMENT(33),
    QUOTE_REQUESTED_DOCUMENT(34),
    NITEX_SIGNED_PI(35),
    BUYER_SIGNED_PI(36),
    SUPPLIER_SIGNED_PI(37),
    NITEX_SIGNED_SC(38),
    FABRIC_FEATURE_IMAGE ( 39 ),
    FABRIC_FRONT_IMAGE ( 40 ),
    FABRIC_DETAILS_IMAGE ( 41 ),
    ;

    private Integer value;
    private static Map<DocumentType, String> documentTypeStringMap = new HashMap<>();

    static {

        documentTypeStringMap.put( DocumentType.PROFILE_PHOTO, "profile_pic/" );
        documentTypeStringMap.put( DocumentType.PRODUCT_DESIGN, "product/design/" );
        documentTypeStringMap.put( DocumentType.PRODUCT_DESIGN_FRONT, "product/reference_image/" );
        documentTypeStringMap.put( DocumentType.ACCESSORIES_DESIGN, "product/accessories_design/" );
        documentTypeStringMap.put( DocumentType.DESIGN_INSPIRATION, "product/design_inspiration/" );
        documentTypeStringMap.put( DocumentType.TECH_PACK_DESIGN, "product/tech_pack_design/" );
        documentTypeStringMap.put( DocumentType.SUMMARY_FILE, "project/summary_file/" );
        documentTypeStringMap.put( DocumentType.AUTHORIZATION_LETTER, "project/authorization_letter/" );
        documentTypeStringMap.put( DocumentType.BANK_SLIP, "payment/bank_slip/" );
        documentTypeStringMap.put( DocumentType.REFERENCE_IMAGE, "product/reference_image/" );
        documentTypeStringMap.put( DocumentType.PRINT_DESIGN, "product/print_design/" );
        documentTypeStringMap.put( DocumentType.MATERIAL_DESIGN, "material/material_design/" );
        documentTypeStringMap.put( DocumentType.FRONT_IMAGE, "product/front_image/" );
        documentTypeStringMap.put( DocumentType.BACK_IMAGE, "product/back_image/" );
        documentTypeStringMap.put( DocumentType.FABRIC_IMAGE, "product/fabric_image/" );
        documentTypeStringMap.put( DocumentType.SIDE_IMAGE, "product/side_image/" );
        documentTypeStringMap.put( DocumentType.SUPPLIER_PHOTO_DOCUMENT, "supplier/photo_document/" );
        documentTypeStringMap.put( DocumentType.SUPPLIER_CERTIFICATE, "supplier/certificate/" );
        documentTypeStringMap.put( DocumentType.PURCHASE_ORDER, "order/po/" );
        documentTypeStringMap.put( DocumentType.COMMERCIAL_INVOICE, "order/commercial_invoice/" );
        documentTypeStringMap.put( DocumentType.ART_BOARD, "product/art_board/" );
        documentTypeStringMap.put( DocumentType.PRODUCT_NOT_IMAGE, "product/not_image/" );
        documentTypeStringMap.put( DocumentType.PAYMENT_DOCUMENT, "payment/document/" );
        documentTypeStringMap.put( DocumentType.STATIC_DOCUMENT, "static/document/" );
        documentTypeStringMap.put( DocumentType.MOODBOARD_FILE, "moodboard/file/" );
        documentTypeStringMap.put( DocumentType.MOODBOARD_IMAGE, "moodboard/image/" );
        documentTypeStringMap.put( DocumentType.MOODBOARD_PRODUCT_IMAGE, "moodboard/product_image/" );
        documentTypeStringMap.put( DocumentType.SAMPLE_REQUESTED_DOCUMENT, "sample/requested_doc/" );
        documentTypeStringMap.put( DocumentType.BADGE_DOCUMENT, "badge/" );
        documentTypeStringMap.put( DocumentType.QUOTE_REQUESTED_DOCUMENT, "quote/requested_doc/" );
        documentTypeStringMap.put( DocumentType.NITEX_SIGNED_PI, "order/" );
        documentTypeStringMap.put( DocumentType.BUYER_SIGNED_PI, "order/" );
        documentTypeStringMap.put( DocumentType.SUPPLIER_SIGNED_PI, "order/" );
        documentTypeStringMap.put( DocumentType.NITEX_SIGNED_SC, "order/" );
    }

    DocumentType( Integer val ){

        this.value = val;
    }

    public String getDirectory(){

        return DocumentType.documentTypeStringMap.getOrDefault( this, "" );
    }

    public Integer getValue(){

        return value;
    }
}
