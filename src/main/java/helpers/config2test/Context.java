package com.customertimes.config;

import java.util.stream.Stream;

public enum Context {

    COUNTRY,
    ACCOUNT_NAME,
    SECONDARY_ACCOUNT_NAME,
    ACCOUNT_ID,
    SECONDARY_ACCOUNT_ID,
    TERRASSE,
    NOTE,
    ZIP_CODE,
    ACCOUNT_TERRITORY,
    TEAM_MEMBER_ROLE,
    WHAT_SUCCESS_LOOKS_LIKE,
    LINKED_ACCOUNT_NAME,

    CONTACT_NAME,
    CONTACT_FIRST_NAME,
    CONTACT_CONTRACT_SIGNATOR_NAME,
    CONTACT_CONTRACT_SIGNATOR_FIRST_NAME,
    CONTACT_ID,
    CONTACT_SIGNATOR_ID,
    BUSINESS_PHONE,
    EMAIL,
    IN_WHICH_ACCOUNT_IS_THE_CONTACT_WORKING,
    FIRST_NAME,
    SECOND_NAME,
    LAST_NAME,
    TITLE,
    FUNCTION,
    LANGUAGE,
    BIRTHDATE,
    REMIND_BIRTHDAY,
    LAST_POSITIVE_CONTACT,
    MOBILE_PHONE,
    INTERESTS,
    INFLUENCER_LEVEL,
    AMBASSADORSHIP,

    EVENT_ID,
    VISIT_ID,
    PRODUCT,
    PRODUCT_ID,
    COCKTAIL,
    SURVEY_SCORE,
    VISIT_CONTACT_ID,
    VISIT_START_TIME,
    VISIT_END_TIME,
    VISIT_TIME,
    LIGHT_VISIT_TIME,
    VIRTUAL_VISIT_TIME,

    OVERDUE_TASK_NAME,
    COMPLETED_TASK_NAME,
    TODAY_TASK_NAME,
    TODAY_TASK_DESCRIPTION,
    TOMORROW_TASK_NAME,
    LATER_THIS_WEEK_TASK_NAME,
    NEXT_WEEK_TASK_NAME,
    LATER_THIS_MONTH_TASK_NAME,
    NEXT_MONTH_TASK_NAME,
    LATER_THAN_NEXT_MONTH_TASK_NAME,
    COMMA_SEPARATED_LIST_OF_ASSIGNED_TASKS,
    TODAY_TASK_ID,
    SALES_REP_TASK_NAME,
    SALES_MANAGER_TASK_NAME,

    CONTRACT_START_DATE,
    CONTRACT_END_DATE,
    CONTRACT_PROPOSAL_NAME,
    CONTRACT_TOTAL_AMOUNT_OF_PAYMENTS,
    CONTRACT_TOTAL_TURNOVER,
    CONTRACT_TOTAL_VOLUME,
    CONTRACT_TOTAL_VOLUME_DISCOUNT,
    CONTRACT_RECORD_VOLUME,
    CONTRACT_RECORD_TRY_FOR,
    CONTRACT_RECORD_MIN_LIKE,
    CONTRACT_FIRST_PRODUCT_TRY_FOR_VOLUME_DISCOUNT,
    CONTRACT_FIRST_PRODUCT_MIN_LIKE_VOLUME_DISCOUNT,
    CONTRACT_SCALE_FIRST_ROW_VOLUME,
    CONTRACT_SCALE_SECOND_ROW_VOLUME,
    CONTRACT_SCALE_THIRD_ROW_VOLUME,
    CONTRACT_SCALE_FIRST_ROW_DISCOUNT,
    CONTRACT_SCALE_SECOND_ROW_DISCOUNT,
    CONTRACT_SCALE_THIRD_ROW_DISCOUNT,
    CONTRACT_SCALE_TOTAL_VOLUME_DISCOUNT,
    CONTRACT_ADDITIONAL_CLAUSE,
    CONTRACT_MARKETING_SUPPORT_RECORD_NAME,
    CONTRACT_MARKETING_SUPPORT_RECORD_ID,
    CONTRACT_MARKETING_SUPPORT_VALUE,
    CONTRACT_MARKETING_SUPPORT_MAX_ALLOWED_VALUE,
    CONTRACT_MARKETING_SUPPORT_ACTIVATION_DATE,
    CONTRACT_FINANCIAL_SUPPORT_ACTIVATION_DATE,
    CONTRACT_FINANCIAL_SUPPORT_RECORD_NAME,
    CONTRACT_FINANCIAL_SUPPORT_RECORD_AMOUNT,
    CONTRACT_FINANCIAL_SUPPORT_CAN_CHANGE_DESCRIPTION_DEFAULT,
    CONTRACT_FINANCIAL_SUPPORT_CAN_CHANGE_DEFAULT_VALUE_DEFAULT,
    CONTRACT_FINANCIAL_SUPPORT_DEFAULT_VALUE,
    CONTRACT_FINANCIAL_SUPPORT_AMOUNT,
    CONTRACT_FINANCIAL_SUPPORT_DESCRIPTION,
    CONTRACT_FINANCIAL_SUPPORT_ID,
    CONTRACT_ACTIVATIONS_ACTIVATION_DATE,
    CONTRACT_ACTIVATIONS_DESCRIPTION,
    CONTRACT_TOTAL_FINANCIAL_SUPPORT,
    CONTRACT_ACTIVATION_RECORD_NAME,
    CONTRACT_NOTE_FOR_MANAGER,
    CONTRACT_NOTE_FOR_REP,
    CONTRACT_AGREEMENT_ACCOUNT_ID,
    CONTRACT_AGREEMENT_SECONDARY_ACCOUNT_ID,
    CONTRACT_AGREEMENT_ID,
    CONTRACT_ID,
    CONTRACT_NAME,
    CONTRACT_QUARTERLY_PAYMENT_PLAN_FIRST_DATE,
    CONTRACT_QUARTERLY_PAYMENT_PLAN_SECOND_DATE,
    CONTRACT_QUARTERLY_PAYMENT_PLAN_THIRD_DATE,
    CONTRACT_QUARTERLY_PAYMENT_PLAN_FORTH_DATE,
    CONTRACT_QUARTERLY_PAYMENT_PLAN_FIRST_AMOUNT,
    CONTRACT_QUARTERLY_PAYMENT_PLAN_SECOND_AMOUNT,
    CONTRACT_QUARTERLY_PAYMENT_PLAN_THIRD_AMOUNT,
    CONTRACT_QUARTERLY_PAYMENT_PLAN_FORTH_AMOUNT,
    CONTRACT_FINANCIAL_SUPPORT_PAYMENT_PLAN_FIRST_DATE,
    CONTRACT_FINANCIAL_SUPPORT_PAYMENT_PLAN_SECOND_DATE,
    CONTRACT_FINANCIAL_SUPPORT_PAYMENT_PLAN_FIRST_AMOUNT,
    CONTRACT_FINANCIAL_SUPPORT_PAYMENT_PLAN_SECOND_AMOUNT,
    CONTRACT_FILE_NAME,
    CONTRACT_SUPPLIER_NAME,
    CONTRACT_MANAGEMENT_ALLOW_ADDENDUMS_DEFAULT,
    CONTRACT_MANAGEMENT_ID,
    CONTRACT_MANAGEMENT_DAYS_IN_ADVANCE,
    CONTRACT_MANAGEMENT_DAYS_IN_ADVANCE_DEFAULT,
    CONTRACT_MANAGEMENT_RENEWAL_AVAILABLE_DURING_DEFAULT,
    CONTRACT_MANAGEMENT_VERBAL_DEALS_THRESHOLD,
    CONTRACT_MANAGEMENT_VERBAL_DEALS_THRESHOLD_DEFAULT,
    CONTRACT_TYPE_NAME,
    CONTRACT_CUSTOMER_COMMITMENT_CONCEPT_ID,

    SUPERVISION_AND_PAYMENT_INCREMENT_VALUE,
    SUPERVISION_AND_PAYMENT_CONTACT_CONGA_SIGN_LINK,
    SUPERVISION_AND_PAYMENT_NOTE_FOR_MANAGER,
    SUPERVISION_AND_PAYMENT_EMAIL_INVOICE_FILENAME,
    SUPERVISION_AND_PAYMENT_INVOICE_ID,

    SUPERVISION_ID,
    SUPERVISION_DETAIL_ID,

    JOINT_BUSINESS_PLAN_VOLUME_PAYMENT_ID,
    SECOND_JOINT_BUSINESS_PLAN_VOLUME_PAYMENT_ID,
    JOINT_BUSINESS_PLAN_FIXED_PAYMENT_ID,
    SECOND_JOINT_BUSINESS_PLAN_FIXED_PAYMENT_ID,
    JOINT_BUSINESS_PLAN_FOR_MARKETING_SUPPORT_ID,
    JOINT_BUSINESS_PLAN_START_DATE,
    SECOND_JOINT_BUSINESS_PLAN_START_DATE,

    VENDOR_NAME,
    VENDOR_ADDRESS,
    VENDOR_CITY,
    VENDOR_ZIP_CODE,
    VENDOR_EMAIL,
    VENDOR_VAT_NUMBER,
    VENDOR_IBAN,
    VENDOR_COUNTRY,
    VENDOR_ACCOUNT_ID,
    VENDOR_PHONE,
    VENDOR_BIC;

    private final ThreadLocal<String> value = new ThreadLocal<>();

    public String get() {
        return value.get();
    }

    public void set(String value) {
        this.value.set(value);
    }

    public void clearItem() {
        value.set(null);
    }

    public static void clear() {
        Stream.of(values()).forEach(Context::clearItem);
    }

    public static final RunLanguage RUN_LANGUAGE = RunLanguage.fromString(Parameter.RUN_LANGUAGE.get());
    public static final RunMarket RUN_MARKET = RunMarket.fromString(Parameter.RUN_MARKET.get());
}