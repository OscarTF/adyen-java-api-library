/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2017 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;


import static com.adyen.util.Util.toIndentedString;

/**
 * FraudCheckResult
 */
public class FraudCheckResult {
    @SerializedName("name")
    private String name = null;

    @SerializedName("accountScore")
    private Integer accountScore = null;

    @SerializedName("checkId")
    private Integer checkId = null;

    public FraudCheckResult name(String name) {
        this.name = name;
        return this;
    }

    /**
     * the name of the risk check
     *
     * @return name
     **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FraudCheckResult accountScore(Integer accountScore) {
        this.accountScore = accountScore;
        return this;
    }

    /**
     * the fraud score generated by the risk check
     *
     * @return accountScore
     **/
    public Integer getAccountScore() {
        return accountScore;
    }

    public void setAccountScore(Integer accountScore) {
        this.accountScore = accountScore;
    }

    public FraudCheckResult checkId(Integer checkId) {
        this.checkId = checkId;
        return this;
    }

    /**
     * the id of the risk check
     *
     * @return checkId
     **/
    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FraudCheckResult fraudCheckResult = (FraudCheckResult) o;
        return Objects.equals(this.name, fraudCheckResult.name) && Objects.equals(this.accountScore, fraudCheckResult.accountScore) && Objects.equals(this.checkId, fraudCheckResult.checkId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accountScore, checkId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FraudCheckResult {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    accountScore: ").append(toIndentedString(accountScore)).append("\n");
        sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
        sb.append("}");
        return sb.toString();
    }



}

