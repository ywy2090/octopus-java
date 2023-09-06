/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sharding.sphere.demo.jdbc;

import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;

public class DataSourceProxyConfig {
    private String rawUrl;
    private String url;
    private String rawDriverClassName;
    private String name;

    private PasswordCallback passwordCallback;
    private NameCallback userCallback;

    public DataSourceProxyConfig() {}

    public PasswordCallback getPasswordCallback() {
        return passwordCallback;
    }

    public void setPasswordCallback(PasswordCallback passwordCallback) {
        this.passwordCallback = passwordCallback;
    }

    public NameCallback getUserCallback() {
        return userCallback;
    }

    public void setUserCallback(NameCallback userCallback) {
        this.userCallback = userCallback;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRawUrl() {
        return rawUrl;
    }

    public void setRawUrl(String rawUrl) {
        this.rawUrl = rawUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRawDriverClassName() {
        return rawDriverClassName;
    }

    public void setRawDriverClassName(String driverClassName) {
        this.rawDriverClassName = driverClassName;
    }
}
