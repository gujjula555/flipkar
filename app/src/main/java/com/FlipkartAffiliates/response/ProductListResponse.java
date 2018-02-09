package com.FlipkartAffiliates.response;

/**
 * Created by nndra on 13-Jan-18.
 */

public class ProductListResponse {

    private ApiGroups apiGroups;

    private String title;

    private String description;

    public ApiGroups getApiGroups ()
    {
        return apiGroups;
    }

    public void setApiGroups (ApiGroups apiGroups)
    {
        this.apiGroups = apiGroups;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [apiGroups = "+apiGroups+", title = "+title+", description = "+description+"]";
    }

    public class ApiGroups
    {
        private Affiliate affiliate;

        public Affiliate getAffiliate ()
        {
            return affiliate;
        }

        public void setAffiliate (Affiliate affiliate)
        {
            this.affiliate = affiliate;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [affiliate = "+affiliate+"]";
        }
    }

    public class Affiliate
    {
        private String name;

        private ApiListings apiListings;

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public ApiListings getApiListings ()
        {
            return apiListings;
        }

        public void setApiListings (ApiListings apiListings)
        {
            this.apiListings = apiListings;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [name = "+name+", apiListings = "+apiListings+"]";
        }
    }

    public class ApiListings
    {
        private Food_nutrition food_nutrition;

        private Televisions televisions;

        private Landline_phones landline_phones;



        public Food_nutrition getFood_nutrition ()
        {
            return food_nutrition;
        }

        public void setFood_nutrition (Food_nutrition food_nutrition)
        {
            this.food_nutrition = food_nutrition;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [food_nutrition = "+food_nutrition+"]";
        }
    }

    public class Food_nutrition
    {
        private AvailableVariants availableVariants;

        private String apiName;

        public AvailableVariants getAvailableVariants ()
        {
            return availableVariants;
        }

        public void setAvailableVariants (AvailableVariants availableVariants)
        {
            this.availableVariants = availableVariants;
        }

        public String getApiName ()
        {
            return apiName;
        }

        public void setApiName (String apiName)
        {
            this.apiName = apiName;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [availableVariants = "+availableVariants+", apiName = "+apiName+"]";
        }
    }

    public class AvailableVariants
    {
        private V v0;

        private V v1;

        public V getv0()
        {
            return v0;
        }

        public void setv0(V v0)
        {
            this.v0 = v0;
        }

        public V getv1()
        {
            return v1;
        }

        public void setv1(V v1)
        {
            this.v1 = v1;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [v0.1.0 = "+v0+", v1.1.0 = "+v1+"]";
        }
    }

    public class V
    {
        private String put;

        private String post;

        private String deltaGet;

        private String get;

        private String delete;

        private String resourceName;

        private String top;

        public String getPut ()
        {
            return put;
        }

    public void setPut (String put)
    {
        this.put = put;
    }

    public String getPost ()
    {
        return post;
    }

    public void setPost (String post)
    {
        this.post = post;
    }

    public String getDeltaGet ()
    {
        return deltaGet;
    }

    public void setDeltaGet (String deltaGet)
    {
        this.deltaGet = deltaGet;
    }

    public String getGet ()
    {
        return get;
    }

    public void setGet (String get)
    {
        this.get = get;
    }

    public String getDelete ()
    {
        return delete;
    }

    public void setDelete (String delete)
    {
        this.delete = delete;
    }

    public String getResourceName ()
    {
        return resourceName;
    }

    public void setResourceName (String resourceName)
    {
        this.resourceName = resourceName;
    }

    public String getTop ()
    {
        return top;
    }

    public void setTop (String top)
    {
        this.top = top;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [put = "+put+", post = "+post+", deltaGet = "+deltaGet+", get = "+get+", delete = "+delete+", resourceName = "+resourceName+", top = "+top+"]";
    }
    }

    public class Televisions
    {
        private AvailableVariants availableVariants;

        private String apiName;

        public AvailableVariants getAvailableVariants ()
        {
            return availableVariants;
        }

        public void setAvailableVariants (AvailableVariants availableVariants)
        {
            this.availableVariants = availableVariants;
        }

        public String getApiName ()
        {
            return apiName;
        }

        public void setApiName (String apiName)
        {
            this.apiName = apiName;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [availableVariants = "+availableVariants+", apiName = "+apiName+"]";
        }
    }

    public class Landline_phones
    {
        private AvailableVariants availableVariants;

        private String apiName;

        public AvailableVariants getAvailableVariants ()
        {
            return availableVariants;
        }

        public void setAvailableVariants (AvailableVariants availableVariants)
        {
            this.availableVariants = availableVariants;
        }

        public String getApiName ()
        {
            return apiName;
        }

        public void setApiName (String apiName)
        {
            this.apiName = apiName;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [availableVariants = "+availableVariants+", apiName = "+apiName+"]";
        }
    }

    public class Tv_video_accessories
    {
        private AvailableVariants availableVariants;

        private String apiName;

        public AvailableVariants getAvailableVariants ()
        {
            return availableVariants;
        }

        public void setAvailableVariants (AvailableVariants availableVariants)
        {
            this.availableVariants = availableVariants;
        }

        public String getApiName ()
        {
            return apiName;
        }

        public void setApiName (String apiName)
        {
            this.apiName = apiName;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [availableVariants = "+availableVariants+", apiName = "+apiName+"]";
        }
    }

    public class Software
    {
        private AvailableVariants availableVariants;

        private String apiName;

        public AvailableVariants getAvailableVariants ()
        {
            return availableVariants;
        }

        public void setAvailableVariants (AvailableVariants availableVariants)
        {
            this.availableVariants = availableVariants;
        }

        public String getApiName ()
        {
            return apiName;
        }

        public void setApiName (String apiName)
        {
            this.apiName = apiName;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [availableVariants = "+availableVariants+", apiName = "+apiName+"]";
        }
    }


    public class Computer_storage
    {
        private AvailableVariants availableVariants;

        private String apiName;

        public AvailableVariants getAvailableVariants ()
        {
            return availableVariants;
        }

        public void setAvailableVariants (AvailableVariants availableVariants)
        {
            this.availableVariants = availableVariants;
        }

        public String getApiName ()
        {
            return apiName;
        }

        public void setApiName (String apiName)
        {
            this.apiName = apiName;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [availableVariants = "+availableVariants+", apiName = "+apiName+"]";
        }
    }


    public class Fragrances
    {
        private AvailableVariants availableVariants;

        private String apiName;

        public AvailableVariants getAvailableVariants ()
        {
            return availableVariants;
        }

        public void setAvailableVariants (AvailableVariants availableVariants)
        {
            this.availableVariants = availableVariants;
        }

        public String getApiName ()
        {
            return apiName;
        }

        public void setApiName (String apiName)
        {
            this.apiName = apiName;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [availableVariants = "+availableVariants+", apiName = "+apiName+"]";
        }
    }


    public class Network_components
    {
        private AvailableVariants availableVariants;

        private String apiName;

        public AvailableVariants getAvailableVariants ()
        {
            return availableVariants;
        }

        public void setAvailableVariants (AvailableVariants availableVariants)
        {
            this.availableVariants = availableVariants;
        }

        public String getApiName ()
        {
            return apiName;
        }

        public void setApiName (String apiName)
        {
            this.apiName = apiName;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [availableVariants = "+availableVariants+", apiName = "+apiName+"]";
        }
    }


    public class E_learning
    {
        private AvailableVariants availableVariants;

        private String apiName;

        public AvailableVariants getAvailableVariants ()
        {
            return availableVariants;
        }

        public void setAvailableVariants (AvailableVariants availableVariants)
        {
            this.availableVariants = availableVariants;
        }

        public String getApiName ()
        {
            return apiName;
        }

        public void setApiName (String apiName)
        {
            this.apiName = apiName;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [availableVariants = "+availableVariants+", apiName = "+apiName+"]";
        }
    }


    public class Video_players
    {
        private AvailableVariants availableVariants;

        private String apiName;

        public AvailableVariants getAvailableVariants ()
        {
            return availableVariants;
        }

        public void setAvailableVariants (AvailableVariants availableVariants)
        {
            this.availableVariants = availableVariants;
        }

        public String getApiName ()
        {
            return apiName;
        }

        public void setApiName (String apiName)
        {
            this.apiName = apiName;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [availableVariants = "+availableVariants+", apiName = "+apiName+"]";
        }
    }


    public class Mens_clothing
    {
        private AvailableVariants availableVariants;

        private String apiName;

        public AvailableVariants getAvailableVariants ()
        {
            return availableVariants;
        }

        public void setAvailableVariants (AvailableVariants availableVariants)
        {
            this.availableVariants = availableVariants;
        }

        public String getApiName ()
        {
            return apiName;
        }

        public void setApiName (String apiName)
        {
            this.apiName = apiName;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [availableVariants = "+availableVariants+", apiName = "+apiName+"]";
        }
    }


    public class Music_movies_posters
    {
        private AvailableVariants availableVariants;

        private String apiName;

        public AvailableVariants getAvailableVariants ()
        {
            return availableVariants;
        }

        public void setAvailableVariants (AvailableVariants availableVariants)
        {
            this.availableVariants = availableVariants;
        }

        public String getApiName ()
        {
            return apiName;
        }

        public void setApiName (String apiName)
        {
            this.apiName = apiName;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [availableVariants = "+availableVariants+", apiName = "+apiName+"]";
        }
    }


    public class Furniture
    {
        private AvailableVariants availableVariants;

        private String apiName;

        public AvailableVariants getAvailableVariants ()
        {
            return availableVariants;
        }

        public void setAvailableVariants (AvailableVariants availableVariants)
        {
            this.availableVariants = availableVariants;
        }

        public String getApiName ()
        {
            return apiName;
        }

        public void setApiName (String apiName)
        {
            this.apiName = apiName;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [availableVariants = "+availableVariants+", apiName = "+apiName+"]";
        }
    }


    public class Bags_wallets_belts
    {
        private AvailableVariants availableVariants;

        private String apiName;

        public AvailableVariants getAvailableVariants ()
        {
            return availableVariants;
        }

        public void setAvailableVariants (AvailableVariants availableVariants)
        {
            this.availableVariants = availableVariants;
        }

        public String getApiName ()
        {
            return apiName;
        }

        public void setApiName (String apiName)
        {
            this.apiName = apiName;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [availableVariants = "+availableVariants+", apiName = "+apiName+"]";
        }
    }

}
