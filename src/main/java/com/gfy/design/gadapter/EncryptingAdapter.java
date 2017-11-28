package com.gfy.design.gadapter;

import com.gfy.design.gadapter.exterior.ExteriorEncrypting;
import com.gfy.design.gadapter.util.EncryptingUtil;

/**
 * @author gfy
 * <p>
 * 适配器，主要是对接第三方加密方法
 */
public class EncryptingAdapter extends EncryptingUtil {

    private ExteriorEncrypting exteriorEncrypting;

    @Override
    public String encode(String source, String flag) {
        exteriorEncrypting = new ExteriorEncrypting();
        if ("md5".equals(flag)) {
            return exteriorEncrypting.md5(source);
        } else if ("base64".equals(flag)) {
            return exteriorEncrypting.base64(source);
        } else {
            return super.encode(source);
        }
    }
}
