// com/mindviewinc/atunit/Test.java
// �2015 MindView LLC: see Copyright.txt
// The @Test tag.
package com.mindviewinc.atunit;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {}
