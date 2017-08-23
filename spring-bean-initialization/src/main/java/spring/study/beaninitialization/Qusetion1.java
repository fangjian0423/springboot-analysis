//package spring.study.beaninitialization;
//
//import java.text.MessageFormat;
//import java.util.concurrent.locks.Condition;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class Qusetion1 {
//
//    public static void main(String[] args) {
//        new ThreadPrinter(1).start();
//    }
//
//    private static class ThreadPrinter {
//        private int startNum;
//        ReentrantLock lock = new ReentrantLock();
//        Condition oddCondition = lock.newCondition();
//        Condition evenCondition = lock.newCondition();
//        public ThreadPrinter(int startNum) {
//            this.startNum = startNum;
//        }
//        public void start() {
//            Thread threadOdd = buildThread("Printer1", new Runnable() {
//                @Override
//                public void run() {
//                    while(startNum < 100) {
//                        lock.lock();
//                        try {
//                            while (startNum % 2 == 0) {
//                                oddCondition.await();
//                            }
//                            System.out.println(MessageFormat.format("{0} - {1}", Thread.currentThread().getName(), (startNum++)));
//                            evenCondition.signal();
//                        } catch (InterruptedException e) {
//                            Thread.interrupted();
//                        } finally {
//                            lock.unlock();
//                        }
//                    }
//                }
//            });
//            Thread threadEven = buildThread("Printer2", new Runnable() {
//                @Override
//                public void run() {
//                    while (startNum < 100) {
//                        lock.lock();
//                        try {
//                            while(startNum % 2 == 1) {
//                                evenCondition.await();
//                            }
//                            System.out.println(MessageFormat.format("{0} - {1}", Thread.currentThread().getName(), (startNum++)));
//                            oddCondition.signal();
//                        } catch (InterruptedException e) {
//                            Thread.interrupted();
//                        } finally {
//                            lock.unlock();
//                        }
//                    }
//                }
//            });
//            threadOdd.start();
//            threadEven.start();
//        }
//        private Thread buildThread(String name, Runnable runnable) {
//            Thread thread = new Thread(runnable);
//            thread.setName(name);
//            return thread;
//        }
//    }
//
//}
