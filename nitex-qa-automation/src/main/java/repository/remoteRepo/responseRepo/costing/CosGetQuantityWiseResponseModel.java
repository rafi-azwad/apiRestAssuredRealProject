package repository.remoteRepo.responseRepo.costing;

import java.io.Serializable;
import java.util.List;

public class CosGetQuantityWiseResponseModel {

    /**
     * id : 7252
     * collectionId : 30854
     * collectionName : move test
     * title : move test
     * description : this is description
     * referenceNumber : Q2210-A0024
     * requestedBy : Rashed
     * requestedDate : 2022-10-28T09:47:24
     * noOfDesign : 44
     * quoteItemResponseList : [{"id":8487,"productId":42709,"market":"Men","category":"TRUCKER JACKET","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666954876351_3e50ec1ba015ebf8bba60607eb4813a4.jpg","variation":"Mix, Twill, 49% Tencel 49% Cotton 2% Spandex, GSM 200","quantity":523,"target":121,"productionPrice":17.4102264,"adminOfferPrice":17.4102264,"buyerOfferPrice":13.529964838578536,"margin":0,"productRefNo":"MT22-A0121","productTitle":"Fleece  Active jacket","productCreator":"Towhid","initialCostingId":18198,"quantityWiseCostingId":18411,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":7,"noOfSameVariant":2,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"17.41","priceUpdateDTOArray":[{"previousValue":13.529964838578536,"updatedById":1,"updatedAt":"2022-10-28T11:10:32"}],"isCloned":false,"isQuoted":true},{"id":8487,"productId":42709,"market":"Men","category":"TRUCKER JACKET","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666954876351_3e50ec1ba015ebf8bba60607eb4813a4.jpg","variation":"Mix, Twill, 49% Tencel 49% Cotton 2% Spandex, GSM 200","quantity":666,"target":66,"productionPrice":13,"adminOfferPrice":13,"buyerOfferPrice":13,"margin":0,"productRefNo":"MT22-A0121","productTitle":"Fleece  Active jacket","productCreator":"Towhid","initialCostingId":18198,"quantityWiseCostingId":25152,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":true,"status":"APPROVED","costingSheetRowClassname":"d-flex align-items-center d-none","decimal2OfferPrice":"13.00","isCloned":false,"isQuoted":false},{"id":13302,"productId":42709,"market":"Men","category":"TRUCKER JACKET","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666954876351_3e50ec1ba015ebf8bba60607eb4813a4.jpg","quantity":500,"productionPrice":9.430352330810711,"adminOfferPrice":9.430352330810711,"margin":0,"productRefNo":"MT22-A0121","productTitle":"Fleece  Active jacket","productCreator":"Towhid","initialCostingId":25702,"quantityWiseCostingId":25002,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":false,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center d-none","decimal2OfferPrice":"9.43","isCloned":false,"isQuoted":true},{"id":13552,"productId":42709,"market":"Men","category":"TRUCKER JACKET","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666954876351_3e50ec1ba015ebf8bba60607eb4813a4.jpg","adminOfferPrice":0,"margin":56,"productRefNo":"MT22-A0121","productTitle":"Fleece  Active jacket","productCreator":"Towhid","initialCostingId":26302,"quantityWiseCostingId":25252,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":false,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center d-none","decimal2OfferPrice":"0.00","isCloned":false,"isQuoted":false},{"id":13704,"productId":42709,"market":"Men","category":"TRUCKER JACKET","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666954876351_3e50ec1ba015ebf8bba60607eb4813a4.jpg","variation":"test\n","productRefNo":"MT22-A0121","productTitle":"Fleece  Active jacket","productCreator":"Towhid","initialCostingId":26767,"quantityWiseCostingId":25512,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":false,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center d-none","isCloned":false,"isQuoted":false},{"id":15427,"productId":42709,"market":"Men","category":"TRUCKER JACKET","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666954876351_3e50ec1ba015ebf8bba60607eb4813a4.jpg","productRefNo":"MT22-A0121","productTitle":"Fleece  Active jacket","productCreator":"Towhid","initialCostingId":29377,"quantityWiseCostingId":27152,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":false,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center d-none","isCloned":false,"isQuoted":false},{"id":15575,"productId":42709,"market":"Men","category":"TRUCKER JACKET","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666954876351_3e50ec1ba015ebf8bba60607eb4813a4.jpg","productRefNo":"MT22-A0121","productTitle":"Fleece  Active jacket","productCreator":"Towhid","initialCostingId":29679,"quantityWiseCostingId":27450,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":false,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center d-none","isCloned":false,"isQuoted":false},{"id":8469,"productId":46980,"market":"Girls","category":"MIDI CARDIGAN ","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666949753685_d73b89798dbf42a7501e42fddf676deb.jpg","variation":"234.0 GSM, 40% Viscose Rayon 60% Elastane, Diagonal Fleece, Basic garments products, Both side brushed","quantity":900,"productionPrice":15.337276318241598,"adminOfferPrice":15.797394607788846,"buyerOfferPrice":15.797394607788846,"margin":3,"productRefNo":"GT22-A0394/4","productTitle":"MIDI CARDIGAN Brown","productCreator":"Towhid","initialCostingId":18180,"quantityWiseCostingId":18393,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"APPROVED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"15.80","isCloned":false,"isQuoted":false},{"id":8472,"productId":46983,"market":"Women","category":"TAPERED JEANS","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666949763531_ecd4c2364253b1053f6c715e4c88be10.jpg","variation":"250 Gauge, 10% Spandex 40% Camel Hair 30% Acetate 20% Triacetate, Diagonal Fleece, Both side brushed, Bamboo fiber, Basic garments products","quantity":600,"target":7,"productionPrice":18.36702,"adminOfferPrice":18.36702,"buyerOfferPrice":18.36702,"margin":0,"productRefNo":"WB22-A0397/4","productTitle":"TAPERED JEANS","productCreator":"Towhid","initialCostingId":18183,"quantityWiseCostingId":18396,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":2,"noOfSameVariant":1,"status":"OFFER_SENT","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"18.37","isCloned":false,"isQuoted":false},{"id":8552,"productId":46983,"market":"Women","category":"TAPERED JEANS","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666949763531_ecd4c2364253b1053f6c715e4c88be10.jpg","variation":"250 Gauge, 10% Spandex 40% Camel Hair 30% Acetate 20% Triacetate, Diagonal Fleece, Both side brushed, Bamboo fiber, Basic garments products","quantity":750,"productionPrice":15.775830000000001,"adminOfferPrice":15.775830000000001,"margin":0,"productRefNo":"WB22-A0397/4","productTitle":"TAPERED JEANS","productCreator":"Towhid","initialCostingId":18349,"quantityWiseCostingId":18738,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":false,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center d-none","decimal2OfferPrice":"15.78","isCloned":false,"isQuoted":true},{"id":8473,"productId":46984,"market":"Women","category":"MIDI CARDIGAN ","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666949766534_f3d468a6a8777c0162df847dda7bf839.jpg","variation":"150 Gauge, 20% Nylon 18% Triacetate 10% Polyester 30% Viscose 5% Jute 2% Cotton 15% Elastane, Milano Ribs, Organic jute","quantity":500,"productionPrice":14,"adminOfferPrice":14,"margin":0,"productRefNo":"WT22-A0398/4","productTitle":"MIDI CARDIGAN ","productCreator":"Towhid","initialCostingId":18184,"quantityWiseCostingId":18397,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":2,"noOfSameVariant":2,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"14.00","isCloned":false,"isQuoted":true},{"id":8473,"productId":46984,"market":"Women","category":"MIDI CARDIGAN ","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666949766534_f3d468a6a8777c0162df847dda7bf839.jpg","variation":"150 Gauge, 20% Nylon 18% Triacetate 10% Polyester 30% Viscose 5% Jute 2% Cotton 15% Elastane, Milano Ribs, Organic jute","quantity":1000,"productionPrice":12.5,"adminOfferPrice":12.5,"margin":0,"productRefNo":"WT22-A0398/4","productTitle":"MIDI CARDIGAN ","productCreator":"Towhid","initialCostingId":18184,"quantityWiseCostingId":18552,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":true,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center d-none","decimal2OfferPrice":"12.50","isCloned":false,"isQuoted":true},{"id":8474,"productId":46985,"market":"Unisex","category":"HOODIE","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949768504_a23004a31da754e3b23ce0460ad46c31.jpg","variation":"270 GSM, 100% Cotton, Single Jersey","quantity":500,"productionPrice":14.4636,"adminOfferPrice":14.4636,"margin":0,"productRefNo":"UT22-A0275/1","productTitle":"HOODIE","productCreator":"Towhid","initialCostingId":18185,"quantityWiseCostingId":18398,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"14.46","isCloned":false,"isQuoted":true},{"id":8475,"productId":46986,"market":"Girls","category":"MIDI CARDIGAN ","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666949770371_d73b89798dbf42a7501e42fddf676deb.jpg","variation":"234.0 GSM, 40% Viscose Rayon 60% Elastane, Diagonal Fleece, Basic garments products, Both side brushed","quantity":400,"productionPrice":17.5748,"adminOfferPrice":17.5748,"margin":0,"productRefNo":"GT22-A0394/2/2","productTitle":"MIDI CARDIGAN ","productCreator":"Towhid","initialCostingId":18186,"quantityWiseCostingId":18399,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"17.57","isCloned":false,"isQuoted":true},{"id":8476,"productId":46987,"market":"Women","category":"TRAPEZE ","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666949774047_d82257b00d315d3f8508ccb44707eca1.jpg","variation":"95% Cotton 5% Elastane, Variegated Rib, 240 GSM,","quantity":600,"productionPrice":32.961600000000004,"adminOfferPrice":32.961600000000004,"margin":0,"productRefNo":"WT22-A0395/2/2","productTitle":"TRAPEZE ","productCreator":"Towhid","initialCostingId":18187,"quantityWiseCostingId":18400,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"32.96","isCloned":false,"isQuoted":true},{"id":8477,"productId":46988,"market":"Women","category":"SURFBOARD/BOARDSHORTS","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666949777933_e10a9bbf03d74703bb07acacafc34811.jpg","variation":"50.0 OZ, 40% Cupro 60% Flax (Linen), Ribbed French Terry, 100% Organic","quantity":500,"productionPrice":16.990248,"adminOfferPrice":16.990248,"margin":0,"productRefNo":"WB22-A0396/2/2","productTitle":"SURFBOARD/BOARDSHORTS","productCreator":"Towhid","initialCostingId":18188,"quantityWiseCostingId":18401,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"16.99","isCloned":false,"isQuoted":true},{"id":8478,"productId":46989,"market":"Women","category":"TAPERED JEANS","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666949781702_ecd4c2364253b1053f6c715e4c88be10.jpg","variation":"250 Gauge, 10% Spandex 40% Camel Hair 30% Acetate 20% Triacetate, Diagonal Fleece, Both side brushed, Bamboo fiber, Basic garments products","quantity":400,"productionPrice":9.4212846,"adminOfferPrice":9.4212846,"margin":0,"productRefNo":"WB22-A0397/2/2","productTitle":"TAPERED JEANS","productCreator":"Towhid","initialCostingId":18189,"quantityWiseCostingId":18402,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"9.42","isCloned":false,"isQuoted":true},{"id":8479,"productId":46990,"market":"Women","category":"MIDI CARDIGAN ","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666949783871_f3d468a6a8777c0162df847dda7bf839.jpg","variation":"150 Gauge, 20% Nylon 18% Triacetate 10% Polyester 30% Viscose 5% Jute 2% Cotton 15% Elastane, Milano Ribs, Organic jute","quantity":200,"productionPrice":23.561745900000002,"adminOfferPrice":23.561745900000002,"margin":0,"productRefNo":"WT22-A0398/2/2","productTitle":"MIDI CARDIGAN ","productCreator":"Towhid","initialCostingId":18190,"quantityWiseCostingId":18403,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"23.56","isCloned":false,"isQuoted":true},{"id":8480,"productId":46991,"market":"Girls","category":"MAXI CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666949787951_3a19a817745e26806bdc0a23041d42fb.jpg","variation":"289 GSM, 50% Elastane, 50% Viscose, 2x2 Rib","quantity":300,"productionPrice":2,"adminOfferPrice":2,"margin":0,"productRefNo":"GT22-A0377/9","productTitle":"MAXI CARDIGAN","productCreator":"Towhid","initialCostingId":18191,"quantityWiseCostingId":18404,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":3,"noOfSameVariant":2,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"2.00","isCloned":false,"isQuoted":false},{"id":8480,"productId":46991,"market":"Girls","category":"MAXI CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666949787951_3a19a817745e26806bdc0a23041d42fb.jpg","variation":"289 GSM, 50% Elastane, 50% Viscose, 2x2 Rib","quantity":600,"productionPrice":10,"adminOfferPrice":10,"margin":0,"productRefNo":"GT22-A0377/9","productTitle":"MAXI CARDIGAN","productCreator":"Towhid","initialCostingId":18191,"quantityWiseCostingId":18739,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":true,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center d-none","decimal2OfferPrice":"10.00","isCloned":false,"isQuoted":true},{"id":8502,"productId":46991,"market":"Girls","category":"MAXI CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666949787951_3a19a817745e26806bdc0a23041d42fb.jpg","variation":"289 GSM, 10% Elastane, 90% Viscose, 2x2 Rib","quantity":750,"productionPrice":15.775830000000001,"adminOfferPrice":15.775830000000001,"margin":0,"productRefNo":"GT22-A0377/9","productTitle":"MAXI CARDIGAN","productCreator":"Towhid","initialCostingId":18252,"quantityWiseCostingId":18502,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":false,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center d-none","decimal2OfferPrice":"15.78","isCloned":false,"isQuoted":true},{"id":8481,"productId":46992,"market":"Toddler","category":"CROPPED CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666949790267_4c6bdad54445b600b4019dad9c6bdec1.jpg","quantity":600,"target":6,"productionPrice":7,"adminOfferPrice":7,"buyerOfferPrice":7,"margin":0,"productRefNo":"TT22-A0378/7","productTitle":"CROPPED CARDIGAN","productCreator":"Towhid","initialCostingId":18192,"quantityWiseCostingId":18743,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":3,"noOfSameVariant":3,"status":"REQUEST_FOR_REVISION","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"7.00","isCloned":false,"isQuoted":false},{"id":8481,"productId":46992,"market":"Toddler","category":"CROPPED CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666949790267_4c6bdad54445b600b4019dad9c6bdec1.jpg","quantity":750,"productionPrice":2,"adminOfferPrice":2,"buyerOfferPrice":2,"margin":0,"productRefNo":"TT22-A0378/7","productTitle":"CROPPED CARDIGAN","productCreator":"Towhid","initialCostingId":18192,"quantityWiseCostingId":18405,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":true,"status":"OFFER_SENT","costingSheetRowClassname":"d-flex align-items-center d-none","decimal2OfferPrice":"2.00","isCloned":false,"isQuoted":false},{"id":8481,"productId":46992,"market":"Toddler","category":"CROPPED CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666949790267_4c6bdad54445b600b4019dad9c6bdec1.jpg","quantity":900,"productionPrice":5,"adminOfferPrice":5,"margin":0,"productRefNo":"TT22-A0378/7","productTitle":"CROPPED CARDIGAN","productCreator":"Towhid","initialCostingId":18192,"quantityWiseCostingId":18742,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":true,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center d-none","decimal2OfferPrice":"5.00","isCloned":false,"isQuoted":true},{"id":8482,"productId":46993,"market":"Girls","category":"CROPPED CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666949795654_5b955869d8f16dee62d8b22b89f6ac78.jpg","variation":"100% Cotton, Single Jersey","quantity":850,"productionPrice":13.355447400000001,"adminOfferPrice":13.355447400000001,"margin":0,"productRefNo":"GT22-A0379/6","productTitle":"CROPPED CARDIGAN","productCreator":"Towhid","initialCostingId":18193,"quantityWiseCostingId":18406,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"13.36","isCloned":false,"isQuoted":true},{"id":8483,"productId":46994,"market":"Unisex","category":"MIDI CARDIGAN ","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949797799_InvoiceNTX_22_09_0020.jpg","variation":"12.0 GSM, 100% Cotton, Single Jersey","quantity":950,"productionPrice":13.575562146551684,"adminOfferPrice":13.575562146551684,"margin":0,"productRefNo":"UT22-A0406/1","productTitle":"MIDI CARDIGAN ","productCreator":"Towhid","initialCostingId":18194,"quantityWiseCostingId":18407,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"13.58","isCloned":false,"isQuoted":true},{"id":8486,"productId":46997,"market":"Toddler","category":"WRAP CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949801824_sales_contract_SNTX-22090019.jpg","variation":"112.0 Gauge, 100% Cotton, Single Jersey","quantity":620,"productionPrice":1,"adminOfferPrice":1,"margin":0,"productRefNo":"TT22-A0409/1","productTitle":"WRAP CARDIGAN","productCreator":"Towhid","initialCostingId":18197,"quantityWiseCostingId":18410,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":3,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"1.00","isCloned":false,"isQuoted":false},{"id":8602,"productId":46997,"market":"Toddler","category":"WRAP CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949801824_sales_contract_SNTX-22090019.jpg","productionPrice":5.05,"adminOfferPrice":5.05,"margin":0,"productRefNo":"TT22-A0409/1","productTitle":"WRAP CARDIGAN","productCreator":"Towhid","initialCostingId":18352,"quantityWiseCostingId":18752,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":false,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center d-none","decimal2OfferPrice":"5.05","isCloned":false,"isQuoted":true},{"id":8603,"productId":46997,"market":"Toddler","category":"WRAP CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949801824_sales_contract_SNTX-22090019.jpg","productionPrice":11.11,"adminOfferPrice":11.11,"margin":0,"productRefNo":"TT22-A0409/1","productTitle":"WRAP CARDIGAN","productCreator":"Towhid","initialCostingId":18353,"quantityWiseCostingId":18753,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":false,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center d-none","decimal2OfferPrice":"11.11","isCloned":false,"isQuoted":true},{"id":8488,"productId":46998,"market":"Boys","category":"MIDI CARDIGAN ","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949803514_sales_contract_SNTX-22090021.jpg","variation":"234.0 GSM, 40% Viscose Rayon 60% Elastane, Diagonal Fleece, Basic garments products, Both side brushed","quantity":510,"productionPrice":10,"adminOfferPrice":10,"margin":0,"productRefNo":"BT22-A0410/1","productTitle":"MIDI CARDIGAN ","productCreator":"Towhid","initialCostingId":18199,"quantityWiseCostingId":18412,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"10.00","isCloned":false,"isQuoted":false},{"id":8489,"productId":46999,"market":"Boys","category":"WESTERN JACKET","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949805552_sales_contract_SNTX-22100006.jpg","variation":"112.0 Gauge, 100% Cotton, Single Jersey","productionPrice":2.85,"adminOfferPrice":2.85,"margin":0,"productRefNo":"BT22-A0411/1","productTitle":"WESTERN JACKET","productCreator":"Towhid","initialCostingId":18200,"quantityWiseCostingId":18413,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":2,"noOfSameVariant":1,"status":"OFFER_SENT","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"2.85","isCloned":false,"isQuoted":false},{"id":8802,"productId":46999,"market":"Boys","category":"WESTERN JACKET","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949805552_sales_contract_SNTX-22100006.jpg","margin":0,"productRefNo":"BT22-A0411/1","productTitle":"WESTERN JACKET","productCreator":"Towhid","initialCostingId":18561,"quantityWiseCostingId":18955,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":false,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center d-none","isCloned":false,"isQuoted":false},{"id":8490,"productId":47000,"market":"Boys","category":"SINGLE BREASTED BLAZER","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949807341_Techpack_GB22-A0371.jpg","variation":"4.0 GSM, 50% Silk 50% Triacetate, Double Jersey","quantity":630,"productionPrice":2.85,"adminOfferPrice":2.85,"margin":0,"productRefNo":"BT22-A0412/1","productTitle":"SINGLE BREASTED BLAZER","productCreator":"Towhid","initialCostingId":18201,"quantityWiseCostingId":18414,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":3,"noOfSameVariant":3,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"2.85","isCloned":false,"isQuoted":false},{"id":8490,"productId":47000,"market":"Boys","category":"SINGLE BREASTED BLAZER","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949807341_Techpack_GB22-A0371.jpg","variation":"4.0 GSM, 50% Silk 50% Triacetate, Double Jersey","quantity":700,"productionPrice":4,"adminOfferPrice":4,"margin":0,"productRefNo":"BT22-A0412/1","productTitle":"SINGLE BREASTED BLAZER","productCreator":"Towhid","initialCostingId":18201,"quantityWiseCostingId":18956,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":true,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center d-none","decimal2OfferPrice":"4.00","isCloned":false,"isQuoted":true},{"id":8490,"productId":47000,"market":"Boys","category":"SINGLE BREASTED BLAZER","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949807341_Techpack_GB22-A0371.jpg","variation":"4.0 GSM, 50% Silk 50% Triacetate, Double Jersey","quantity":800,"productionPrice":3.5,"adminOfferPrice":3.5,"margin":0,"productRefNo":"BT22-A0412/1","productTitle":"SINGLE BREASTED BLAZER","productCreator":"Towhid","initialCostingId":18201,"quantityWiseCostingId":18957,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":true,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center d-none","decimal2OfferPrice":"3.50","isCloned":false,"isQuoted":true},{"id":8491,"productId":47001,"market":"Women","category":"SINGLE BREASTED BLAZER","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949809358_1660022854361_EO_PETITE_ZLPO52810_gokny_SS23_Pre-order_08.08.2022.jpg","variation":"234.0 GSM, 40% Viscose Rayon 60% Elastane, Diagonal Fleece, Basic garments products, Both side brushed","quantity":520,"productionPrice":14.126999999999999,"adminOfferPrice":14.126999999999999,"margin":0,"productRefNo":"WT22-A0413/1","productTitle":"SINGLE BREASTED BLAZER","productCreator":"Towhid","initialCostingId":18202,"quantityWiseCostingId":18415,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":3,"noOfSameVariant":3,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"14.13","isCloned":false,"isQuoted":true},{"id":8491,"productId":47001,"market":"Women","category":"SINGLE BREASTED BLAZER","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949809358_1660022854361_EO_PETITE_ZLPO52810_gokny_SS23_Pre-order_08.08.2022.jpg","variation":"234.0 GSM, 40% Viscose Rayon 60% Elastane, Diagonal Fleece, Basic garments products, Both side brushed","quantity":600,"productionPrice":20,"adminOfferPrice":20,"margin":0,"productRefNo":"WT22-A0413/1","productTitle":"SINGLE BREASTED BLAZER","productCreator":"Towhid","initialCostingId":18202,"quantityWiseCostingId":18958,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":true,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center d-none","decimal2OfferPrice":"20.00","isCloned":false,"isQuoted":true},{"id":8491,"productId":47001,"market":"Women","category":"SINGLE BREASTED BLAZER","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949809358_1660022854361_EO_PETITE_ZLPO52810_gokny_SS23_Pre-order_08.08.2022.jpg","variation":"234.0 GSM, 40% Viscose Rayon 60% Elastane, Diagonal Fleece, Basic garments products, Both side brushed","quantity":700,"productionPrice":18,"adminOfferPrice":18,"margin":0,"productRefNo":"WT22-A0413/1","productTitle":"SINGLE BREASTED BLAZER","productCreator":"Towhid","initialCostingId":18202,"quantityWiseCostingId":18959,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":true,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center d-none","decimal2OfferPrice":"18.00","isCloned":false,"isQuoted":true},{"id":8492,"productId":47002,"market":"Boys","category":"SINGLE BREASTED BLAZER","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949811575_sales_contract_SNTX-22090015.jpg","variation":"6.0 GSM, 100% Cotton, Fleece, 97.3% cotton, 2.7% linen, 2.7% linen","productionPrice":2,"adminOfferPrice":2,"margin":0,"productRefNo":"BT22-A0414/1","productTitle":"SINGLE BREASTED BLAZER","productCreator":"Towhid","initialCostingId":18203,"quantityWiseCostingId":18416,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"2.00","isCloned":false,"isQuoted":true},{"id":8493,"productId":47003,"market":"Men","category":"WESTERN JACKET","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949812393_1654782157387_ZLPO51561_1byby-rgnyy.jpg","variation":"220.0 , 30% Ramie 40% Camel Hair 20% Modacrylic 10% Silk, Polar Fleece, Both side brushed","quantity":750,"productionPrice":0,"adminOfferPrice":0,"margin":0,"productRefNo":"MT22-A0415/1","productTitle":"WESTERN JACKET","productCreator":"Towhid","initialCostingId":18204,"quantityWiseCostingId":18417,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"0.00","isCloned":false,"isQuoted":true},{"id":8494,"productId":47004,"market":"Toddler","category":"MIDI CARDIGAN ","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949815674_2022_2022-06-06_%284%29.jpg","variation":"234.0 GSM, 40% Viscose Rayon 60% Elastane, Diagonal Fleece, Basic garments products, Both side brushed","quantity":845,"productionPrice":1,"adminOfferPrice":1,"margin":0,"productRefNo":"TT22-A0416/1","productTitle":"MIDI CARDIGAN ","productCreator":"Towhid","initialCostingId":18205,"quantityWiseCostingId":18418,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"1.00","isCloned":false,"isQuoted":false},{"id":8495,"productId":47005,"market":"Toddler","category":"CROPPED CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949817272_2022_2022-06-06_%285%29.jpg","variation":"12.0 GSM, 100% Cotton, Double Jersey","quantity":75,"productionPrice":0,"adminOfferPrice":0,"margin":0,"productRefNo":"TT22-A0417/1","productTitle":"CROPPED CARDIGAN","productCreator":"Towhid","initialCostingId":18206,"quantityWiseCostingId":18419,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"0.00","isCloned":false,"isQuoted":true},{"id":8496,"productId":47006,"market":"Boys","category":"WRAP CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949818914_1654782164130_ZLPO51562_1byby-rgnyy.jpg","variation":"12.0 GSM, 100% Cotton, Double Jersey","productionPrice":15,"adminOfferPrice":15,"margin":0,"productRefNo":"BT22-A0418/1","productTitle":"WRAP CARDIGAN","productCreator":"Towhid","initialCostingId":18207,"quantityWiseCostingId":18420,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"15.00","isCloned":false,"isQuoted":true},{"id":8497,"productId":47007,"market":"Boys","category":"BOMBER JACKET","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949822907_1660022843447_EO_JERSEY_ZLPO52808_rokny_SS23_Pre-order_08.08.2022.jpg","variation":"4.0 GSM, 50% Silk 50% Triacetate, Double Jersey","productionPrice":6,"adminOfferPrice":6,"margin":0,"productRefNo":"BT22-A0419/1","productTitle":"BOMBER JACKET","productCreator":"Towhid","initialCostingId":18208,"quantityWiseCostingId":18421,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"6.00","isCloned":false,"isQuoted":true},{"id":8498,"productId":47008,"market":"Infant","category":"MAXI CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949824705_1660022849537_EO_CURVY_ZLPO52809_fokny_SS23_Pre-order_08.08.2022.jpg","variation":"234.0 GSM, 40% Viscose Rayon 60% Elastane, Diagonal Fleece, Basic garments products, Both side brushed","quantity":500,"productionPrice":6,"adminOfferPrice":6,"margin":0,"productRefNo":"IT22-A0420/1","productTitle":"MAXI CARDIGAN","productCreator":"Towhid","initialCostingId":18209,"quantityWiseCostingId":18422,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":3,"noOfSameVariant":2,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"6.00","isCloned":false,"isQuoted":false},{"id":8498,"productId":47008,"market":"Infant","category":"MAXI CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949824705_1660022849537_EO_CURVY_ZLPO52809_fokny_SS23_Pre-order_08.08.2022.jpg","variation":"234.0 GSM, 40% Viscose Rayon 60% Elastane, Diagonal Fleece, Basic garments products, Both side brushed","quantity":600,"productionPrice":1.73,"adminOfferPrice":1.73,"margin":0,"productRefNo":"IT22-A0420/1","productTitle":"MAXI CARDIGAN","productCreator":"Towhid","initialCostingId":18209,"quantityWiseCostingId":19253,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":true,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center d-none","decimal2OfferPrice":"1.73","isCloned":false,"isQuoted":true},{"id":8952,"productId":47008,"market":"Infant","category":"MAXI CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949824705_1660022849537_EO_CURVY_ZLPO52809_fokny_SS23_Pre-order_08.08.2022.jpg","variation":"234.0 GSM, 40% Viscose Rayon 60% Elastane, Diagonal Fleece, Basic garments products, Both side brushed","productRefNo":"IT22-A0420/1","productTitle":"MAXI CARDIGAN","productCreator":"Towhid","initialCostingId":18802,"quantityWiseCostingId":19252,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":false,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center d-none","isCloned":false,"isQuoted":false},{"id":8452,"productId":47009,"market":"Women","category":"CROPPED CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949827489_move_test_2022-09-02.jpg","variation":"234.0 GSM, 40% Viscose Rayon 60% Elastane, Diagonal Fleece, Basic garments products, Both side brushed","productionPrice":6,"adminOfferPrice":6,"margin":0,"productRefNo":"WT22-A0421/1","productTitle":"CROPPED CARDIGAN","productCreator":"Towhid","initialCostingId":18163,"quantityWiseCostingId":18376,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"6.00","isCloned":false,"isQuoted":false},{"id":8453,"productId":47010,"market":"Unisex","category":"MAXI CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949829179_Techpack_WB22-A1318.jpg","variation":"234.0 GSM, 40% Viscose Rayon 60% Elastane, Diagonal Fleece, Basic garments products, Both side brushed","quantity":500,"productionPrice":59.1,"adminOfferPrice":59.1,"margin":0,"productRefNo":"UT22-A0422/1","productTitle":"MAXI CARDIGAN","productCreator":"Towhid","initialCostingId":18164,"quantityWiseCostingId":18377,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"59.10","isCloned":false,"isQuoted":false},{"id":8454,"productId":47011,"market":"Women","category":"CROPPED CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949833164_Account_manager_issue_2022-08-31.jpg","variation":"55.0 GSM, 100% Cotton, Single Jersey","quantity":400,"target":12,"productionPrice":13.458978,"adminOfferPrice":13.72815756,"buyerOfferPrice":14.535696240000002,"margin":2,"productRefNo":"WT22-A0423/1","productTitle":"CROPPED CARDIGAN","productCreator":"Towhid","initialCostingId":18165,"quantityWiseCostingId":18378,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"REQUEST_FOR_REVISION","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"13.73","priceUpdateDTOArray":[{"previousValue":14.535696240000002,"updatedById":9902,"updatedAt":"2022-12-08T10:44:10"}],"isCloned":false,"isQuoted":false},{"id":8455,"productId":47012,"market":"Men","category":"DOUBLE BREASTED BLAZER","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949835679_2022_2022-06-06_%281%29.jpg","variation":"234.0 GSM, 40% Viscose Rayon 60% Elastane, Diagonal Fleece, Basic garments products, Both side brushed","quantity":600,"target":10,"productionPrice":15,"adminOfferPrice":15,"buyerOfferPrice":15.75,"margin":0,"productRefNo":"MT22-A0424/1","productTitle":"DOUBLE BREASTED BLAZER","productCreator":"Towhid","initialCostingId":18166,"quantityWiseCostingId":18379,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"REQUEST_FOR_REVISION","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"15.00","priceUpdateDTOArray":[{"previousValue":15.75,"updatedById":9902,"updatedAt":"2022-12-08T11:51:24"}],"isCloned":false,"isQuoted":false},{"id":8456,"productId":47013,"market":"Infant","category":"ZIP UP CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949843298_2022_2022-06-07_%282%29.jpg","variation":"55.0 GSM, 100% Cotton, Single Jersey","quantity":500,"margin":0,"productRefNo":"IT22-A0425/1","productTitle":"ZIP UP CARDIGAN","productCreator":"Towhid","initialCostingId":18167,"quantityWiseCostingId":18380,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","isCloned":false,"isQuoted":false},{"id":8457,"productId":47014,"market":"Women","category":"MAXI CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949845440_2022_2022-06-07_%283%29.jpg","variation":"12.0 GSM, 100% Cotton, Double Jersey","quantity":800,"margin":0,"productRefNo":"WT22-A0427/1","productTitle":"MAXI CARDIGAN","productCreator":"Towhid","initialCostingId":18168,"quantityWiseCostingId":18381,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","isCloned":false,"isQuoted":false},{"id":8458,"productId":47015,"market":"Men","category":"BOMBER JACKET","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949851518_2022_2022-06-10.jpg","variation":"234.0 GSM, 40% Viscose Rayon 60% Elastane, Diagonal Fleece, Basic garments products, Both side brushed","quantity":700,"margin":0,"productRefNo":"MT22-A0426/1","productTitle":"BOMBER JACKET","productCreator":"Towhid","initialCostingId":18169,"quantityWiseCostingId":18382,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","isCloned":false,"isQuoted":false},{"id":8459,"productId":47016,"market":"Men","category":"DOUBLE BREASTED BLAZER","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949853635_08_2022-06-08.jpg","variation":"55.0 GSM, 100% Cotton, Single Jersey","quantity":600,"margin":0,"productRefNo":"MT22-A0428/1","productTitle":"DOUBLE BREASTED BLAZER","productCreator":"Towhid","initialCostingId":18170,"quantityWiseCostingId":18383,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","isCloned":false,"isQuoted":false},{"id":8460,"productId":47017,"market":"Women","category":"CROPPED CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949860839_20222_2022-06-08.jpg","variation":"55.0 GSM, 100% Cotton, Single Jersey","quantity":500,"margin":0,"productRefNo":"WT22-A0429/1","productTitle":"CROPPED CARDIGAN","productCreator":"Towhid","initialCostingId":18171,"quantityWiseCostingId":18384,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","isCloned":false,"isQuoted":false},{"id":8461,"productId":47018,"market":"Boys","category":"DOUBLE BREASTED BLAZER","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949868283_2022_2022-06-06_%283%29.jpg","variation":"234.0 GSM, 40% Viscose Rayon 60% Elastane, Diagonal Fleece, Basic garments products, Both side brushed","quantity":400,"margin":0,"productRefNo":"BT22-A0430/1","productTitle":"DOUBLE BREASTED BLAZER","productCreator":"Towhid","initialCostingId":18172,"quantityWiseCostingId":18385,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","isCloned":false,"isQuoted":false},{"id":8462,"productId":47019,"market":"Boys","category":"BOMBER JACKET","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949872114_1_2022-09-26.jpg","variation":"55.0 GSM, 100% Cotton, Single Jersey","quantity":300,"margin":0,"productRefNo":"BT22-A0431/1","productTitle":"BOMBER JACKET","productCreator":"Towhid","initialCostingId":18173,"quantityWiseCostingId":18386,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","isCloned":false,"isQuoted":false},{"id":8463,"productId":47020,"market":"Women","category":"CROPPED CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949876402_1_2022-09-26_%282%29.jpg","variation":"234.0 GSM, 40% Viscose Rayon 60% Elastane, Diagonal Fleece, Basic garments products, Both side brushed","quantity":200,"margin":0,"productRefNo":"WT22-A0432/1","productTitle":"CROPPED CARDIGAN","productCreator":"Towhid","initialCostingId":18174,"quantityWiseCostingId":18387,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","isCloned":false,"isQuoted":false},{"id":8464,"productId":47021,"market":"Boys","category":"SHORTS","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949877473_1635935349042_tuertewr.jpg","variation":"As per attached","quantity":100,"margin":0,"productRefNo":"HPBWT81-CT-018/1","productTitle":"Sweatshirts","productCreator":"Towhid","initialCostingId":18175,"quantityWiseCostingId":18388,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","isCloned":false,"isQuoted":false},{"id":8465,"productId":47022,"market":"Men","category":"SWEATER","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949879930_testNew.PNG","variation":"As per attached","quantity":800,"margin":0,"productRefNo":"HPMWT81-CT-026/1","productTitle":"T-shirts","productCreator":"Towhid","initialCostingId":18176,"quantityWiseCostingId":18389,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","isCloned":false,"isQuoted":false},{"id":8466,"productId":47023,"market":"Men","category":"TRUCKER JACKET","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949882956_8f9235c9e6f054da8e3a33c5917df402.jpg","variation":"62% Polyester 33% Cotton 5% Elastane, Rib 4x2, 220 GSM","quantity":700,"margin":0,"productRefNo":"HPMKT81-CT-030/1","productTitle":"Tops","productCreator":"Towhid","initialCostingId":18177,"quantityWiseCostingId":18390,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"INITIALIZED","costingSheetRowClassname":"d-flex align-items-center","isCloned":false,"isQuoted":false},{"id":8467,"productId":47024,"market":"Women","category":"MAXI CARDIGAN","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949888216_profile-pic.png","variation":"12.0 GSM, 100% Cotton, Double Jersey","quantity":500,"productionPrice":10,"adminOfferPrice":10,"margin":0,"productRefNo":"WT22-A0433/1","productTitle":"MAXI CARDIGAN","productCreator":"Towhid","initialCostingId":18178,"quantityWiseCostingId":18391,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"10.00","isCloned":false,"isQuoted":true},{"id":8468,"productId":47025,"market":"Boys","category":"STRAIGHT LEG JEANS","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666949889097_bc7b281e1bd38e01d4c62a2d8759e06a.jpg","variation":"60% Ecovero Viscose 25% Organic Cotton 5% Spandex, GSM 280","quantity":500,"productionPrice":0,"adminOfferPrice":0,"margin":0,"productRefNo":"HPBWOW81-CT-015/1","productTitle":"Jackets","productCreator":"Towhid","initialCostingId":18179,"quantityWiseCostingId":18392,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"0.00","isCloned":false,"isQuoted":true},{"id":8503,"productId":47056,"market":"Men","category":"TRUCKER JACKET","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666954912844_3e50ec1ba015ebf8bba60607eb4813a4.jpg","variation":"Mix, Twill, 49% Tencel 49% Cotton 2% Spandex, GSM 200","quantity":500,"productionPrice":0,"adminOfferPrice":0,"margin":0,"productRefNo":"MT22-A0121/1","productTitle":"Fleece  Active jacket","productCreator":"Towhid","initialCostingId":18254,"quantityWiseCostingId":18509,"isChangeRequired":false,"isSameProduct":false,"isSameVariant":false,"noOfSameProduct":1,"noOfSameVariant":1,"status":"QUOTED","costingSheetRowClassname":"d-flex align-items-center","decimal2OfferPrice":"0.00","isCloned":true,"isQuoted":true}]
     * brandId : 3052
     * brandName : HERMES PARIS
     * status : RUNNING
     * requestedDocumentList : []
     * quoteApprovalStatus : APPROVED
     * estimatedOrderDeliveryDate : 2022-11-30
     * noOfUnreadMessage : 0
     */

    private int id;
    private int collectionId;
    private String collectionName;
    private String title;
    private String description;
    private String referenceNumber;
    private String requestedBy;
    private String requestedDate;
    private int noOfDesign;
    private int brandId;
    private String brandName;
    private String status;
    private String quoteApprovalStatus;
    private String estimatedOrderDeliveryDate;
    private int noOfUnreadMessage;
    private List<QuoteItemResponseListBean> quoteItemResponseList;
    private List<?> requestedDocumentList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(int collectionId) {
        this.collectionId = collectionId;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public String getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }

    public int getNoOfDesign() {
        return noOfDesign;
    }

    public void setNoOfDesign(int noOfDesign) {
        this.noOfDesign = noOfDesign;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getQuoteApprovalStatus() {
        return quoteApprovalStatus;
    }

    public void setQuoteApprovalStatus(String quoteApprovalStatus) {
        this.quoteApprovalStatus = quoteApprovalStatus;
    }

    public String getEstimatedOrderDeliveryDate() {
        return estimatedOrderDeliveryDate;
    }

    public void setEstimatedOrderDeliveryDate(String estimatedOrderDeliveryDate) {
        this.estimatedOrderDeliveryDate = estimatedOrderDeliveryDate;
    }

    public int getNoOfUnreadMessage() {
        return noOfUnreadMessage;
    }

    public void setNoOfUnreadMessage(int noOfUnreadMessage) {
        this.noOfUnreadMessage = noOfUnreadMessage;
    }

    public List<QuoteItemResponseListBean> getQuoteItemResponseList() {
        return quoteItemResponseList;
    }

    public void setQuoteItemResponseList(List<QuoteItemResponseListBean> quoteItemResponseList) {
        this.quoteItemResponseList = quoteItemResponseList;
    }

    public List<?> getRequestedDocumentList() {
        return requestedDocumentList;
    }

    public void setRequestedDocumentList(List<?> requestedDocumentList) {
        this.requestedDocumentList = requestedDocumentList;
    }

    public static class QuoteItemResponseListBean implements Serializable {
        /**
         * id : 8487
         * productId : 42709
         * market : Men
         * category : TRUCKER JACKET
         * featureImageDocUrl : https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666954876351_3e50ec1ba015ebf8bba60607eb4813a4.jpg
         * variation : Mix, Twill, 49% Tencel 49% Cotton 2% Spandex, GSM 200
         * quantity : 523
         * target : 121.0
         * productionPrice : 17.4102264
         * adminOfferPrice : 17.4102264
         * buyerOfferPrice : 13.529964838578536
         * margin : 0.0
         * productRefNo : MT22-A0121
         * productTitle : Fleece  Active jacket
         * productCreator : Towhid
         * initialCostingId : 18198
         * quantityWiseCostingId : 18411
         * isChangeRequired : false
         * isSameProduct : false
         * isSameVariant : false
         * noOfSameProduct : 7
         * noOfSameVariant : 2
         * status : QUOTED
         * costingSheetRowClassname : d-flex align-items-center
         * decimal2OfferPrice : 17.41
         * priceUpdateDTOArray : [{"previousValue":13.529964838578536,"updatedById":1,"updatedAt":"2022-10-28T11:10:32"}]
         * isCloned : false
         * isQuoted : true
         */

        private int id;
        private int productId;
        private String market;
        private String category;
        private String featureImageDocUrl;
        private String variation;
        private int quantity;
        private double target;
        private double productionPrice;
        private double adminOfferPrice;
        private double buyerOfferPrice;
        private double margin;
        private String productRefNo;
        private String productTitle;
        private String productCreator;
        private int initialCostingId;
        private int quantityWiseCostingId;
        private boolean isChangeRequired;
        private boolean isSameProduct;
        private boolean isSameVariant;
        private int noOfSameProduct;
        private int noOfSameVariant;
        private String status;
        private String costingSheetRowClassname;
        private String decimal2OfferPrice;
        private boolean isCloned;
        private boolean isQuoted;
        private List<PriceUpdateDTOArrayBean> priceUpdateDTOArray;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public String getMarket() {
            return market;
        }

        public void setMarket(String market) {
            this.market = market;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getFeatureImageDocUrl() {
            return featureImageDocUrl;
        }

        public void setFeatureImageDocUrl(String featureImageDocUrl) {
            this.featureImageDocUrl = featureImageDocUrl;
        }

        public String getVariation() {
            return variation;
        }

        public void setVariation(String variation) {
            this.variation = variation;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getTarget() {
            return target;
        }

        public void setTarget(double target) {
            this.target = target;
        }

        public double getProductionPrice() {
            return productionPrice;
        }

        public void setProductionPrice(double productionPrice) {
            this.productionPrice = productionPrice;
        }

        public double getAdminOfferPrice() {
            return adminOfferPrice;
        }

        public void setAdminOfferPrice(double adminOfferPrice) {
            this.adminOfferPrice = adminOfferPrice;
        }

        public double getBuyerOfferPrice() {
            return buyerOfferPrice;
        }

        public void setBuyerOfferPrice(double buyerOfferPrice) {
            this.buyerOfferPrice = buyerOfferPrice;
        }

        public double getMargin() {
            return margin;
        }

        public void setMargin(double margin) {
            this.margin = margin;
        }

        public String getProductRefNo() {
            return productRefNo;
        }

        public void setProductRefNo(String productRefNo) {
            this.productRefNo = productRefNo;
        }

        public String getProductTitle() {
            return productTitle;
        }

        public void setProductTitle(String productTitle) {
            this.productTitle = productTitle;
        }

        public String getProductCreator() {
            return productCreator;
        }

        public void setProductCreator(String productCreator) {
            this.productCreator = productCreator;
        }

        public int getInitialCostingId() {
            return initialCostingId;
        }

        public void setInitialCostingId(int initialCostingId) {
            this.initialCostingId = initialCostingId;
        }

        public int getQuantityWiseCostingId() {
            return quantityWiseCostingId;
        }

        public void setQuantityWiseCostingId(int quantityWiseCostingId) {
            this.quantityWiseCostingId = quantityWiseCostingId;
        }

        public boolean isIsChangeRequired() {
            return isChangeRequired;
        }

        public void setIsChangeRequired(boolean isChangeRequired) {
            this.isChangeRequired = isChangeRequired;
        }

        public boolean isIsSameProduct() {
            return isSameProduct;
        }

        public void setIsSameProduct(boolean isSameProduct) {
            this.isSameProduct = isSameProduct;
        }

        public boolean isIsSameVariant() {
            return isSameVariant;
        }

        public void setIsSameVariant(boolean isSameVariant) {
            this.isSameVariant = isSameVariant;
        }

        public int getNoOfSameProduct() {
            return noOfSameProduct;
        }

        public void setNoOfSameProduct(int noOfSameProduct) {
            this.noOfSameProduct = noOfSameProduct;
        }

        public int getNoOfSameVariant() {
            return noOfSameVariant;
        }

        public void setNoOfSameVariant(int noOfSameVariant) {
            this.noOfSameVariant = noOfSameVariant;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCostingSheetRowClassname() {
            return costingSheetRowClassname;
        }

        public void setCostingSheetRowClassname(String costingSheetRowClassname) {
            this.costingSheetRowClassname = costingSheetRowClassname;
        }

        public String getDecimal2OfferPrice() {
            return decimal2OfferPrice;
        }

        public void setDecimal2OfferPrice(String decimal2OfferPrice) {
            this.decimal2OfferPrice = decimal2OfferPrice;
        }

        public boolean isIsCloned() {
            return isCloned;
        }

        public void setIsCloned(boolean isCloned) {
            this.isCloned = isCloned;
        }

        public boolean isIsQuoted() {
            return isQuoted;
        }

        public void setIsQuoted(boolean isQuoted) {
            this.isQuoted = isQuoted;
        }

        public List<PriceUpdateDTOArrayBean> getPriceUpdateDTOArray() {
            return priceUpdateDTOArray;
        }

        public void setPriceUpdateDTOArray(List<PriceUpdateDTOArrayBean> priceUpdateDTOArray) {
            this.priceUpdateDTOArray = priceUpdateDTOArray;
        }

        public static class PriceUpdateDTOArrayBean implements Serializable {
            /**
             * previousValue : 13.529964838578536
             * updatedById : 1
             * updatedAt : 2022-10-28T11:10:32
             */

            private double previousValue;
            private int updatedById;
            private String updatedAt;

            public double getPreviousValue() {
                return previousValue;
            }

            public void setPreviousValue(double previousValue) {
                this.previousValue = previousValue;
            }

            public int getUpdatedById() {
                return updatedById;
            }

            public void setUpdatedById(int updatedById) {
                this.updatedById = updatedById;
            }

            public String getUpdatedAt() {
                return updatedAt;
            }

            public void setUpdatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
            }
        }
    }
}
