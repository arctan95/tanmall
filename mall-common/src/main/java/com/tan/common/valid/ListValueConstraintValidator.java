package com.tan.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName ListValueConstraintValidator
 * @Description TODO
 * @Author tan
 * @Date 2020/10/27 21:18
 * @Version 1.0
 **/
public class ListValueConstraintValidator implements ConstraintValidator<ListValue, Integer> {

    private Set<Integer> set = new HashSet<>();

    //初始化方法
    @Override
    public void initialize(ListValue constraintAnnotation) {
        int[] vals = constraintAnnotation.vals();
        for (int val : vals) {
            set.add(val);
        }
    }

    // 判断是否校验成功
    @Override
    /**
     * @description TODO
     * @author tan
     * @date 2020/10/27 21:28
     * @param value 需要校验的值
     * @param context
     * @return boolean
     **/
    public boolean isValid(Integer value, ConstraintValidatorContext context) {

        return set.contains(value);
    }
}
