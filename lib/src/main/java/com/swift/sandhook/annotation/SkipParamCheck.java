package com.swift.sandhook.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface SkipParamCheck {}


/* Location:              C:\User\\user\Desktop\classes-dex2jar.jar!\com\swift\sandhook\annotation\SkipParamCheck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.1
 */