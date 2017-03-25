package com.example.arsiddiqui.aicte.APIService;


import retrofit.http.Field;
import retrofit.http.POST;
import retrofit2.http.FormUrlEncoded;

public interface APIservice {

    @FormUrlEncoded
    @POST("/getSelectedData.php")
    Call<List<RawData>> getTheData(@Field(Year) String Year,
                                   @Field(State) String State,
                                   @Field(Program) String Program,
                                   @Field(Level) String Level,
                                   @Field(Institution_Type) String Year,
                                   )
}
