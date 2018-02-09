package com.FlipkartAffiliates.response;

/**
 * Created by nndra on 13-Jan-18.
 */

public class CategoryListResponse {
    private String nextUrl;

    private ProductInfoList[] productInfoList;

    private String validTill;

    public String getNextUrl ()
    {
        return nextUrl;
    }

    public void setNextUrl (String nextUrl)
    {
        this.nextUrl = nextUrl;
    }

    public ProductInfoList[] getProductInfoList ()
    {
        return productInfoList;
    }

    public void setProductInfoList (ProductInfoList[] productInfoList)
    {
        this.productInfoList = productInfoList;
    }

    public String getValidTill ()
    {
        return validTill;
    }

    public void setValidTill (String validTill)
    {
        this.validTill = validTill;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [nextUrl = "+nextUrl+", productInfoList = "+productInfoList+", validTill = "+validTill+"]";
    }

    public class ProductInfoList
    {
        private ProductShippingBaseInfo productShippingBaseInfo;

        private ProductBaseInfo productBaseInfo;

        private String offset;

        public ProductShippingBaseInfo getProductShippingBaseInfo ()
        {
            return productShippingBaseInfo;
        }

        public void setProductShippingBaseInfo (ProductShippingBaseInfo productShippingBaseInfo)
        {
            this.productShippingBaseInfo = productShippingBaseInfo;
        }

        public ProductBaseInfo getProductBaseInfo ()
        {
            return productBaseInfo;
        }

        public void setProductBaseInfo (ProductBaseInfo productBaseInfo)
        {
            this.productBaseInfo = productBaseInfo;
        }

        public String getOffset ()
    {
        return offset;
    }

        public void setOffset (String offset)
        {
            this.offset = offset;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [productShippingBaseInfo = "+productShippingBaseInfo+", productBaseInfo = "+productBaseInfo+", offset = "+offset+"]";
        }
    }

    public class ProductShippingBaseInfo
    {
        private String shippingOptions;

        public String getShippingOptions ()
    {
        return shippingOptions;
    }

        public void setShippingOptions (String shippingOptions)
        {
            this.shippingOptions = shippingOptions;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [shippingOptions = "+shippingOptions+"]";
        }
    }

    public class ProductBaseInfo
    {
        private ProductIdentifier productIdentifier;

        private ProductAttributes productAttributes;

        public ProductIdentifier getProductIdentifier ()
        {
            return productIdentifier;
        }

        public void setProductIdentifier (ProductIdentifier productIdentifier)
        {
            this.productIdentifier = productIdentifier;
        }

        public ProductAttributes getProductAttributes ()
        {
            return productAttributes;
        }

        public void setProductAttributes (ProductAttributes productAttributes)
        {
            this.productAttributes = productAttributes;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [productIdentifier = "+productIdentifier+", productAttributes = "+productAttributes+"]";
        }
    }

    public class ProductAttributes
    {
        private String codAvailable;

        private String styleCode;

        private String productDescription;

        private MaximumRetailPrice maximumRetailPrice;

        private String[] offers;

        private ImageUrls imageUrls;

        private String colorVariants;

        private String emiAvailable;

        private String isAvailable;

        private String size;

        private SellingPrice sellingPrice;

        private String title;

        private String productBrand;

        private String color;

        private String productUrl;

        private String discountPercentage;

        private String sizeUnit;

        private String cashBack;

        private String sizeVariants;

        private String inStock;

        public String getCodAvailable ()
        {
            return codAvailable;
        }

        public void setCodAvailable (String codAvailable)
        {
            this.codAvailable = codAvailable;
        }

        public String getStyleCode ()
        {
            return styleCode;
        }

        public void setStyleCode (String styleCode)
        {
            this.styleCode = styleCode;
        }

        public String getProductDescription ()
        {
            return productDescription;
        }

        public void setProductDescription (String productDescription)
        {
            this.productDescription = productDescription;
        }

        public MaximumRetailPrice getMaximumRetailPrice ()
        {
            return maximumRetailPrice;
        }

        public void setMaximumRetailPrice (MaximumRetailPrice maximumRetailPrice)
        {
            this.maximumRetailPrice = maximumRetailPrice;
        }

        public String[] getOffers ()
        {
            return offers;
        }

        public void setOffers (String[] offers)
        {
            this.offers = offers;
        }

        public ImageUrls getImageUrls ()
        {
            return imageUrls;
        }

        public void setImageUrls (ImageUrls imageUrls)
        {
            this.imageUrls = imageUrls;
        }

        public String getColorVariants ()
    {
        return colorVariants;
    }

        public void setColorVariants (String colorVariants)
        {
            this.colorVariants = colorVariants;
        }

        public String getEmiAvailable ()
    {
        return emiAvailable;
    }

        public void setEmiAvailable (String emiAvailable)
        {
            this.emiAvailable = emiAvailable;
        }

        public String getIsAvailable ()
        {
            return isAvailable;
        }

        public void setIsAvailable (String isAvailable)
        {
            this.isAvailable = isAvailable;
        }

        public String getSize ()
    {
        return size;
    }

        public void setSize (String size)
        {
            this.size = size;
        }

        public SellingPrice getSellingPrice ()
        {
            return sellingPrice;
        }

        public void setSellingPrice (SellingPrice sellingPrice)
        {
            this.sellingPrice = sellingPrice;
        }

        public String getTitle ()
        {
            return title;
        }

        public void setTitle (String title)
        {
            this.title = title;
        }

        public String getProductBrand ()
        {
            return productBrand;
        }

        public void setProductBrand (String productBrand)
        {
            this.productBrand = productBrand;
        }

        public String getColor ()
        {
            return color;
        }

        public void setColor (String color)
        {
            this.color = color;
        }

        public String getProductUrl ()
        {
            return productUrl;
        }

        public void setProductUrl (String productUrl)
        {
            this.productUrl = productUrl;
        }

        public String getDiscountPercentage ()
        {
            return discountPercentage;
        }

        public void setDiscountPercentage (String discountPercentage)
        {
            this.discountPercentage = discountPercentage;
        }

        public String getSizeUnit ()
        {
            return sizeUnit;
        }

        public void setSizeUnit (String sizeUnit)
        {
            this.sizeUnit = sizeUnit;
        }

        public String getCashBack ()
    {
        return cashBack;
    }

        public void setCashBack (String cashBack)
        {
            this.cashBack = cashBack;
        }

        public String getSizeVariants ()
        {
            return sizeVariants;
        }

        public void setSizeVariants (String sizeVariants)
        {
            this.sizeVariants = sizeVariants;
        }

        public String getInStock ()
        {
            return inStock;
        }

        public void setInStock (String inStock)
        {
            this.inStock = inStock;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [codAvailable = "+codAvailable+", styleCode = "+styleCode+", productDescription = "+productDescription+", maximumRetailPrice = "+maximumRetailPrice+", offers = "+offers+", imageUrls = "+imageUrls+", colorVariants = "+colorVariants+", emiAvailable = "+emiAvailable+", isAvailable = "+isAvailable+", size = "+size+", sellingPrice = "+sellingPrice+", title = "+title+", productBrand = "+productBrand+", color = "+color+", productUrl = "+productUrl+", discountPercentage = "+discountPercentage+", sizeUnit = "+sizeUnit+", cashBack = "+cashBack+", sizeVariants = "+sizeVariants+", inStock = "+inStock+"]";
        }
    }


    public class SellingPrice
    {
        private String amount;

        private String currency;

        public String getAmount ()
        {
            return amount;
        }

        public void setAmount (String amount)
        {
            this.amount = amount;
        }

        public String getCurrency ()
        {
            return currency;
        }

        public void setCurrency (String currency)
        {
            this.currency = currency;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [amount = "+amount+", currency = "+currency+"]";
        }
    }

    public class MaximumRetailPrice
    {
        private String amount;

        private String currency;

        public String getAmount ()
        {
            return amount;
        }

        public void setAmount (String amount)
        {
            this.amount = amount;
        }

        public String getCurrency ()
        {
            return currency;
        }

        public void setCurrency (String currency)
        {
            this.currency = currency;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [amount = "+amount+", currency = "+currency+"]";
        }
    }

    public class ImageUrls
    {
        private String r400x400;

        private String r75x75;

        private String r275x275;

        private String r125x125;

        private String r40x40;

        private String r100x100;

        private String r200x200;

        private String r1100x1360;

        private String unknown;

        private String r180x240;

        private String r275x340;

        public String get400x400 ()
        {
            return r400x400;
        }

        public void set400x400 (String r400x400)
        {
            this.r400x400 = r400x400;
        }

        public String get75x75 ()
        {
            return r75x75;
        }

        public void set75x75 (String r75x75)
        {
            this.r75x75 = r75x75;
        }

        public String get275x275 ()
        {
            return r275x275;
        }

        public void set275x275 (String r275x275)
        {
            this.r275x275 = r275x275;
        }

        public String get125x125 ()
        {
            return r125x125;
        }

        public void set125x125 (String r125x125)
        {
            this.r125x125 = r125x125;
        }

        public String get40x40 ()
        {
            return r40x40;
        }

        public void set40x40 (String r40x40)
        {
            this.r40x40 = r40x40;
        }

        public String get100x100 ()
        {
            return r100x100;
        }

        public void set100x100 (String r100x100)
        {
            this.r100x100 = r100x100;
        }

        public String get200x200 ()
        {
            return r200x200;
        }

        public void set200x200 (String r200x200)
        {
            this.r200x200 = r200x200;
        }

        public String get1100x1360 ()
        {
            return r1100x1360;
        }

        public void set1100x1360 (String r1100x1360)
        {
            this.r1100x1360 = r1100x1360;
        }

        public String getUnknown ()
        {
            return unknown;
        }

        public void setUnknown (String unknown)
        {
            this.unknown = unknown;
        }

        public String get180x240 ()
        {
            return r180x240;
        }

        public void set180x240 (String r180x240)
        {
            this.r180x240 = r180x240;
        }

        public String get275x340 ()
        {
            return r275x340;
        }

        public void set275x340 (String r275x340)
        {
            this.r275x340 = r275x340;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [400x400 = "+r400x400+", 75x75 = "+r75x75+", 275x275 = "+r275x275+", 125x125 = "+r125x125+", 40x40 = "+r40x40+", 100x100 = "+r100x100+", 200x200 = "+r200x200+", 1100x1360 = "+r1100x1360+", unknown = "+unknown+", 180x240 = "+r180x240+", 275x340 = "+r275x340+"]";
        }
    }

    public class ProductIdentifier
    {
        private CategoryPaths categoryPaths;

        private String productId;

        public CategoryPaths getCategoryPaths ()
        {
            return categoryPaths;
        }

        public void setCategoryPaths (CategoryPaths categoryPaths)
        {
            this.categoryPaths = categoryPaths;
        }

        public String getProductId ()
        {
            return productId;
        }

        public void setProductId (String productId)
        {
            this.productId = productId;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [categoryPaths = "+categoryPaths+", productId = "+productId+"]";
        }
    }

    public class CategoryPaths
    {
        private CategoryPath[][] categoryPath;

        public CategoryPath[][] getCategoryPath ()
        {
            return categoryPath;
        }

        public void setCategoryPath (CategoryPath[][] categoryPath)
        {
            this.categoryPath = categoryPath;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [categoryPath = "+categoryPath+"]";
        }
    }

    public class CategoryPath
    {
        private String title;

        public String getTitle ()
        {
            return title;
        }

        public void setTitle (String title)
        {
            this.title = title;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [title = "+title+"]";
        }
    }


}