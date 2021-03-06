package com.example.edumng;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {
    //현재 안드로이드앱을 에뮬레이터로 돌리므로 에뮬레이터가 설치된 서버에 있는 아파치 서버에 접근하려면
    //다음과 같이 10.0.2.2:포트번호 로 접근해야합니다
    final static private String URL = "http://10.0.2.2/androidServer/Login.do";
    private Map<String, String> parameters;

    //생성자
    public LoginRequest(String userid, String userpw, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userid", userid);
        parameters.put("userpw", userpw);
        System.out.println("request");
    }

    //PUT이나 POST요구할때 Map타입을 리턴함
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return parameters;
    }
}