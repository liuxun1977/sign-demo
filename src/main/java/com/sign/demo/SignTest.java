package com.sign.demo;

/**
 * @author liuxun
 * @description
 * @date 2020-05-21 10:05
 */
public class SignTest {

    // 私钥
    private static String privateKey = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAMElXgnHKpoM/y/5R7edOjcK52tAHjLaKExjxRJnTb03gIZfXLJ+SKhcU6wmvS/fpyOhQ2xLtM4cxWbKzECl+8pEn7OBRAw7KTFQCCIcbXTuGE8w3yF59PH56gzrQ/S1CRVIBBYFFKEdds0MKaenAbipPkecxrnly35bA1RwstQNAgMBAAECgYAOTu1bfhSq2uGgtS/Z61zfrQAd0t8p1z17Az0bMunwZYcw7SmZ038gcc6FB02mmUPxgMXU5Prc9gatqcJd263+WgQqSWCSBzMS1FK6t5RHHw6JK9SoAdan3GL5dbCeeprJbXFtXrnc6nRc6NOrPlI7VH8j+OKNj0Rh7Zqee/AbJQJBAOdx/rheoByOOgSXsSpiLcB6bS/zjXWJeR1kEwn3gM+g3D/vhoQKrJEcjy45b2dzDpxUjuEEGCflmAcKujy8S/cCQQDVoyu2jdFfI/RtKAq9eS5uOl7zzL19L/TuTT9lEIsjTBBQArH7GDYFZ2eeUQbXceR9GIU3OWg5SYwpcUty8XcbAkBO/jlR8/nxxRlIN/3f2WKEL0TU+OtvElykC2P0IuVz+BM0PyxKJNqBLJ4xyKidRkfWU4XwhtU3yMT6ok6uLBZBAkEAhStVUFJOtNOgxXo0V692NdfE4Iw7ghGmx/T3E3SghrwfXwCPGUoaQnwWpyUy8pFYMHJcd/Qc97jU2fB5a4kBCQJBAJi6wHIMK8wWaoegZpnSyPC66a7EoaxHR04IEZIlXvR1RVORYv9Xghx/VuHBjhMP0LtTWQ61Tc04acLvZDNq8FM=";
    // 公钥
    private static String publickKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDBJV4JxyqaDP8v+Ue3nTo3CudrQB4y2ihMY8USZ029N4CGX1yyfkioXFOsJr0v36cjoUNsS7TOHMVmysxApfvKRJ+zgUQMOykxUAgiHG107hhPMN8hefTx+eoM60P0tQkVSAQWBRShHXbNDCmnpwG4qT5HnMa55ct+WwNUcLLUDQIDAQAB";

    public static void main(String[] args) {
        String str = "{quantity:1,symbol:abc}1589966902000";
        String sign = RSASignature.sign(str,privateKey);
        System.out.println("签名结果：" + sign);
        Boolean flag = RSASignature.doCheck(str,sign,publickKey);
        System.out.println("验签结果：" + flag);

    }


}
