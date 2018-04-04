package com.changeset.firstinfo.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Author: Xuelong Liao
 * @ Description:
 * @ Date: created in 16:28 2018/4/4
 * @ ModifiedBy:
 */
public class ViewObject {
    private Map<String, Object> objs = new HashMap<>();
    public void set(String key, Object value) {
        objs.put(key, value);
    }

    public Object get(String key) { return objs.get(key); }
}
