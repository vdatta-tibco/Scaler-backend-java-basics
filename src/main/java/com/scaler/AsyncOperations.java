package com.scaler;
import lombok.*;

public class AsyncOperations {
    @Builder
    @Getter
    static class MockLongTask {

        public String Name;
        void run() {
            new Thread(() -> {
                System.out.println(Name + " started");
                var start = System.currentTimeMillis();
                //Below line simulates real life work load of ~10 seconds.
                while (System.currentTimeMillis() - start < 50000) {}
                System.out.println(Name + " ended");
            }).start();
        }
    }

    public static void main(String[] args) {
        var task1 = new MockLongTask("Encryption");
        var task2 = new MockLongTask("Decryption");

        //Below tasks would run in parallel
        task1.run();
        task2.run();
    }
}
