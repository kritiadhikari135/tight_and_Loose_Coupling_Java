package com.loose.coupling;

public class WithNewDatabase implements UserDataProvider{

    @Override
    public String getUserDetails() {
        return "Using New database";
    }
}
