package com.example.kuhas.myapplication.Page3;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kuhas on 2/2/2561.
 */

public class GetAndSet {



        /**
         * vdo_id : 1
         * vdo_title : The Hobbit 2
         * vdo_path : http://www.youtube.com/watch?v=YUgLgblxHmI
         * create_date : 2013-11-11 13:14:10
         * create_by : 1
         * update_date : 2013-12-18 13:30:30
         * update_by : 1
         * active : n
         */

        @SerializedName("vdo_id")               private String vdoid;
        @SerializedName("vdo_title")            private String vdotitle;
        @SerializedName("vdo_path")             private String vdopath;
        @SerializedName("create_date")          private String createdate;
        @SerializedName("create_by")            private String createby;
        @SerializedName("update_date")          private String updatedate;
        @SerializedName("update_by")            private String updateby;
        @SerializedName("active")               private String active;

        public String getVdoid() {
            return vdoid;
        }

        public void setVdoid(String vdoid) {
            this.vdoid = vdoid;
        }

        public String getVdotitle() {
            return vdotitle;
        }

        public void setVdotitle(String vdotitle) {
            this.vdotitle = vdotitle;
        }

        public String getVdopath() {
            return vdopath;
        }

        public void setVdopath(String vdopath) {
            this.vdopath = vdopath;
        }

        public String getCreatedate() {
            return createdate;
        }

        public void setCreatedate(String createdate) {
            this.createdate = createdate;
        }

        public String getCreateby() {
            return createby;
        }

        public void setCreateby(String createby) {
            this.createby = createby;
        }

        public String getUpdatedate() {
            return updatedate;
        }

        public void setUpdatedate(String updatedate) {
            this.updatedate = updatedate;
        }

        public String getUpdateby() {
            return updateby;
        }

        public void setUpdateby(String updateby) {
            this.updateby = updateby;
        }

        public String getActive() {
            return active;
        }

        public void setActive(String active) {
            this.active = active;
        }
    }
