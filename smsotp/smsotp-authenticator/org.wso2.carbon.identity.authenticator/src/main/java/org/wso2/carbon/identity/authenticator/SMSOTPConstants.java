/*
 *  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.identity.authenticator;

import java.lang.String;

public class SMSOTPConstants {
    public static final String AUTHENTICATOR_NAME = "SMSOTP";
    public static final String AUTHENTICATOR_FRIENDLY_NAME = "SMSOTP";
    public static final String ALGORITHM_NAME = "SHA1PRNG";
    public static final String ALGORITHM_HMAC = "HmacSHA1";
    public static final String ALGORITHM_HMAC_SHA = "HMAC-SHA-1";

    public static final int SECRET_KEY_LENGTH = 5;
    public static final int NUMBER_BASE = 2;
    public static final int NUMBER_DIGIT = 6;
    public static final String HTTP_METHOD = "GET";
    public static final String CODE = "code";
    public static final String MOBILE_CLAIM = "http://wso2.org/claims/mobile";

    public static final String API_KEY = "api_key";
    public static final String API_SECRET = "api_secret";
    public static final String SMS_URL = "sms_url";

    public static final String PROPERTIES_FILE = "smsprovider.properties";
    public static final String LOGIN_PAGE = "smsotpauthenticationendpoint/smsotp.jsp";
    public static final String RETRY_PARAMS = "&authFailure=true&authFailureMsg=login.fail.message";
}