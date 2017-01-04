package com.itdoater.businessoperation.dal;


import com.itdoater.access.dataaccess.UserAccess;

/**
 * Created by jt_hu on 2017/1/4.
 */
public class DalAccessFactory {
    /**
     * 获取UserAccess Session连接
     * @return
     */
    public static UserAccess getUserAccess(){
        return new UserAccess();
    }
}