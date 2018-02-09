package com.able.android.api;

import com.able.android.bean.base.AppBaseResponse;
import com.able.android.bean.response.LoginRsp;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by guanlijie on 2018/2/9.
 */

public interface Api {
    String HOST = "http://api.ngrok.zhangjinyu.ren";
    String PORT = "8080";
    String VERSION = "api/v1";
    String HOST_URL = HOST + ":" + PORT + "/" + VERSION + "/";

    @FormUrlEncoded
    @POST("login")
    Observable<AppBaseResponse<LoginRsp>> login(@Field("username") String username, @Field("password") String password);
}