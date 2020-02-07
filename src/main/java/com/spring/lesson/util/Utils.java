package com.spring.lesson.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {

    public <V>List doSomething(List<? extends V> list1, List<? super V> list2) {

        return new ArrayList();
    }

}
