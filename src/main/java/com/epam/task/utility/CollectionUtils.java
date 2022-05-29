package com.epam.task.utility;

import java.util.Collection;
import java.util.Map;

public class CollectionUtils {

    public static boolean isEmpty(Collection < ? > collection) {
        return (collection == null || collection.isEmpty());
    }

    public static boolean isNotEmpty(Collection < ? > collection) {
        return !isEmpty(collection);
    }

    public static boolean isEmpty(Map < ? , ? > map) {
        return (map == null || map.isEmpty());
    }

    public static boolean isNotEmpty(Map < ? , ? > map) {
        return !isEmpty(map);
    }

    public static boolean isEmpty(Object[] array) {
        return (array == null || array.length == 0);
    }

    public static boolean containsInstance(Collection < ? > collection, Object element) {
        if (collection != null) {
            for (Object candidate: collection) {
                if (candidate == element) {
                    return true;
                }
            }
        }
        return false;
    }
}
