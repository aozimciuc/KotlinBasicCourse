package academy.learnprograming.generics

import java.math.BigDecimal

fun main() {
    val list: List<Any> = listOf(
        "string", 1, BigDecimal(22.5), "fall", BigDecimal(-5938.393849)
    )
    println(getElementsOfType<BigDecimal>(list))
}

inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
    val result: MutableList<T> = mutableListOf()
    for (element in list) {
        if (element is T) {
            result.add(element)
        }
    }
    return result
}

// Decompiled from KotlinBasics/target/classes/academy/learnprograming/generics/ReifiedParametersKt.class
//
//public final class ReifiedParametersKt {
//    public static final void main() {
//        Object[] var1 = new Object[]{"string", 1, new BigDecimal(22.5), "fall", new BigDecimal(-5938.393849)};
//        List list = CollectionsKt.listOf(var1);
//        int $i$f$getElementsOfType = false;
//        List result$iv = (List)(new ArrayList());
//        Iterator var3 = list.iterator();
//
//        while(var3.hasNext()) {                          // inline fun <reified T> getElementsOfType(list: List<Any>): List<T>
//            Object element$iv = var3.next();
//            if (element$iv instanceof BigDecimal) {      // if (element is T)
//                result$iv.add(element$iv);
//            }
//        }                                                // end of inline fun
//
//        System.out.println(result$iv);
//    }
//
//    // $FF: synthetic method
//    public static final List getElementsOfType(List list) {
//        Intrinsics.checkNotNullParameter(list, "list");
//        int $i$f$getElementsOfType = false;
//        List result = (List)(new ArrayList());
//        Iterator var3 = list.iterator();
//
//        while(var3.hasNext()) {
//            Object element = var3.next();
//            Intrinsics.reifiedOperationMarker(3, "T");
//            if (element instanceof Object) {           // if (element is T)
//                result.add(element);
//            }
//        }
//
//        return result;
//    }
//
//    // $FF: synthetic method
//    public static void main(String[] args) {
//        main();
//    }
//}
