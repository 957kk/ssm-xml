package com.zxk.ssm.xml.utils;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.Md5Crypt;

import java.nio.charset.StandardCharsets;
import java.util.Random;

/**
 * @Auther byzhao
 * @Modify 2021-09-12 19:50
 * <p>
 * Talk is cheap . Show me the code!
 */
public class MD5Utils {

    static final String MD5_PREFIX = "$1$";

    static final String B64T = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    /**
     * 生成MD5密码
     *
     * @param
     * @param salt
     * @return
     */
    public static String generateMd5(String key, String salt) {
        byte[] digest = DigestUtils.getMd5Digest().digest(key.getBytes());
        return Md5Crypt.md5Crypt(digest, salt);
    }

    /**
     * 生成一个随机盐
     *
     * @return
     */
    public static String getRandomSalt() {
        Random random = new Random();
        int num = getRandom(5, 10);
        final StringBuilder saltString = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            saltString.append(B64T.charAt(new Random().nextInt(B64T.length())));
        }
        return MD5_PREFIX + (saltString.toString());
    }

    /**
     * salt base64 编码
     *
     * @param salt
     * @return
     */
    public static String saltBase64Encode(String salt) {
        byte[] bytes = Base64.encodeBase64(salt.getBytes(StandardCharsets.UTF_8));
        return new String(bytes, StandardCharsets.UTF_8);
    }

    /**
     * Base64 解码真正的salt
     *
     * @param dbSalt
     * @return
     */
    public static String saltBase64Decode(String dbSalt) {
        byte[] bytes = dbSalt.getBytes(StandardCharsets.UTF_8);
        byte[] decodeBase64 = Base64.decodeBase64(bytes);
        return new String(decodeBase64, StandardCharsets.UTF_8);
    }

    /**
     * 获取一个 随机数 范围 [min,max]
     *
     * @param min
     * @param max
     * @return
     */
    private static int getRandom(int min, int max) {
        Random random = new Random();
        int s = random.nextInt(max) % (max - min + 1) + min;
        return s;

    }


}
