//package spring.study.beaninitialization;
//
//import java.text.MessageFormat;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Format on 2017/7/6.
// */
//public class Question2 {
//
//    public static void main(String[] args) {
//        new StringSearch("abaabbccdd").run();
//        new StringSearch("aabb").run();
//        new StringSearch("aaaa").run();
//        new StringSearch("aabbcc").run();
//        new StringSearch("ab").run();
//        new StringSearch("abcd").run();
//        new StringSearch("abc").run();
//        new StringSearch("").run();
//        new StringSearch(" ").run();
//    }
//
//    private static class StringSearch {
//        private String rawStr;
//        public StringSearch(String rawStr) {
//            this.rawStr = rawStr;
//        }
//        public List<String> search() {
//            List<String> list = new ArrayList<>();
//            int length = rawStr.length();
//            for(int index = 0; index < length - 3; index ++) {
//                if(
//                    rawStr.charAt(index) == rawStr.charAt(index + 1) &&
//                    rawStr.charAt(index + 2) == rawStr.charAt(index + 3) &&
//                    rawStr.charAt(index) != rawStr.charAt(index + 2)
//                ) {
//                    list.add(rawStr.substring(index, index + 4));
//                }
//            }
//            return list;
//        }
//        public void run() {
//            System.out.println(MessageFormat.format("\"{0}\" find: {1}", rawStr, search()));
//        }
//    }
//
//}
