package com.gfy.design.gadapter.adapter;

import com.gfy.design.gadapter.adaptee.ExteriorEncrypting;
import com.gfy.design.gadapter.target.EncryptingUtil;

/**
 * @author gfy
 * <p>
 * 适配器，主要是对接第三方加密方法
 */
public class EncryptingAdapter extends EncryptingUtil {

    private ExteriorEncrypting exteriorEncrypting;

    public EncryptingAdapter(ExteriorEncrypting exteriorEncrypting) {
        this.exteriorEncrypting = exteriorEncrypting;
    }

    @Override
    public String encode(String source, String flag) {
        if ("md5".equals(flag)) {
            return this.exteriorEncrypting.md5(source);
        } else if ("base64".equals(flag)) {
            return this.exteriorEncrypting.base64(source);
        } else {
            return super.encode(source);
        }
    }
}
