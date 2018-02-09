package com.FlipkartAffiliates.response;

/**
 * Created by nndra on 13-Jan-18.
 */

public class ApiListings {

    private V0 v0;

    private V1 v1;

    public V0 getv0()
    {
        return v0;
    }

    public void setv0(V0 v0)
    {
        this.v0 = v0;
    }

    public V1 getv1()
    {
        return v1;
    }

    public void setv1(V1 v1)
    {
        this.v1 = v1;
    }


    public class V0{

        String resourceName;
        String get;
        String deltaGet;

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public String getGet() {
            return get;
        }

        public void setGet(String get) {
            this.get = get;
        }

        public String getDeltaGet() {
            return deltaGet;
        }

        public void setDeltaGet(String deltaGet) {
            this.deltaGet = deltaGet;
        }
    }

    public class V1{

        String resourceName;
        String get;
        String deltaGet;

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public String getGet() {
            return get;
        }

        public void setGet(String get) {
            this.get = get;
        }

        public String getDeltaGet() {
            return deltaGet;
        }

        public void setDeltaGet(String deltaGet) {
            this.deltaGet = deltaGet;
        }
    }

}
