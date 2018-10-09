package com.aphabetsequence;

public class RemoveSpecialChracter {
	public static void main(String[] args) {

		String string = "{\r\n  \"id\": \"6212052\",\r\n  \"currencyCode\": \"USD\",\r\n  \"countryCode\": \"CA\",\r\n  \"transactionLineItems\": [\r\n    {\r\n      \"id\": \"00k4100000VWaO7AAL\",\r\n      \"productCode\": \"IVM\",\r\n      \"productFamily\": \"Vulnerability Management\",\r\n      \"cashValueCategory\": \"Subscription\",\r\n      \"productLine\": \"InsightVM\",\r\n      \"startDate\": \"2018-05-23\",\r\n      \"endDate\": \"2019-05-22\",\r\n      \"totalPrice\": 1264\r\n    },\r\n    {\r\n      \"id\": \"00k4100000VWaO7AAM\",\r\n      \"productCode\": \"IVM-ADD\",\r\n      \"productFamily\": \"Vulnerability Management\",\r\n      \"cashValueCategory\": \"Excess Term\",\r\n      \"productLine\": \"InsightVM\",\r\n      \"startDate\": \"2018-08-31\",\r\n      \"endDate\": \"2019-08-30\",\r\n      \"totalPrice\": 3200\r\n    },\r\n    {\r\n      \"id\": \"00k4100000VWaO7AAN\",\r\n      \"productCode\": \"IVM-ADD\",\r\n      \"productFamily\": \"Vulnerability Management\",\r\n      \"cashValueCategory\": \"Excess Term\",\r\n      \"productLine\": \"InsightVM\",\r\n      \"startDate\": \"2018-09-26\",\r\n      \"endDate\": \"2019-09-25\",\r\n      \"totalPrice\": 3200\r\n    }\r\n  ]\r\n}\r\n\r\n";

		System.out.println(string);
		String result = string.replaceAll("(\r\n|\n)", " ");
		System.out.println(result);

	}
}
