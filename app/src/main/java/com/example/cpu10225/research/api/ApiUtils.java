package com.example.cpu10225.research.api;

import com.example.cpu10225.research.data.remote.RetrofitClient;
import com.example.cpu10225.research.data.remote.SOService;

/**
 * Created by cpu10225 on 10/11/2017.
 */

public class ApiUtils {
    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}
