package net.xiaoluo.crazyit.crazyjava.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(FkTags.class)
public @interface FkTag {
    String name() default "Martin";

    int age();
}
