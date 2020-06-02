package com.pid.dynamiclists.Network;

import com.pid.dynamiclists.Models.DynamicListObject;
import com.pid.dynamiclists.Models.MainMenu;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NetworkInterface {

    @GET("menu.php")
    Call<MainMenu> getMenu(@Query(value = "list") int list, @Query(value = "level") int level,
                                  @Query(value = "fac") String fac, @Query(value = "spec") String spec,
                                       @Query(value = "fin") String fin,@Query(value = "form") String form,
                                       @Query(value = "json") int json);


    @GET("archive/now/{path}.ar")
    Call <DynamicListObject> getDynamicListByPath(@Path("path") String path);
}
