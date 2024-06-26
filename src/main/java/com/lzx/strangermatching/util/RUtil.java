package com.lzx.strangermatching.util;

import com.lzx.strangermatching.response.R;

public class RUtil {

    public static R success(Object object){
        R r = new R();
        r.setCode(0);
        r.setMsg("ok");
        r.setData(object);
        return r;
    }

    public static R success(){
        return success(null);
    }

    public static R error(Integer code, String msg){
        R r = new R();
        r.setCode(code);
        r.setMsg(msg);
        return r;
    }
}
